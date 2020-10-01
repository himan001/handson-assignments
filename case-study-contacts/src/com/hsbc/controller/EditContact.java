package com.hsbc.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.hsbc.exception.AuthenticationException;
import com.hsbc.exception.InvalidContactException;
import com.hsbc.model.beans.User;
import com.hsbc.model.service.ContactService;
import com.hsbc.model.service.UserService;
import com.hsbc.model.util.Type;
import com.hsbc.model.util.UserFactory;

@WebServlet("/EditContact")
public class EditContact extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String contactId = request.getParameter("contactId");
		int cId = Integer.parseInt(contactId);
		String cName = request.getParameter("cname");
		String cPhone = request.getParameter("phone");

		
		ContactService service = (ContactService)UserFactory.getInstance(Type.CSERVICE);
		try {
	
			HttpSession session = request.getSession();
			User user = (User) session.getAttribute("userKey");
			int id =   user.getUserId(); 
			
			
			if(cPhone!=null && !cPhone.isEmpty()) {
				long phone = Long.parseLong(cPhone);
				
				service.updatePhone(id, cId, phone);
				 }
			
			if(cName!=null && !cName.isEmpty()) {
				service.updateName(id, cId, cName);

				}
			
			RequestDispatcher rd = request.getRequestDispatcher("editsuccess.jsp");
			rd.forward(request, response);
		}catch(InvalidContactException  e ) {	
			RequestDispatcher rd = request.getRequestDispatcher("editfailure.jsp");
			request.setAttribute("err", e.getMessage());
			rd.forward(request, response);
			
		} 
	}

}
