package com.hsbc.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.hsbc.exception.InvalidContactException;
import com.hsbc.model.beans.Contact;
import com.hsbc.model.beans.User;
import com.hsbc.model.service.ContactService;
import com.hsbc.model.util.Type;
import com.hsbc.model.util.UserFactory;

@WebServlet("/DeleteContact")
public class DeleteContact extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String cId = request.getParameter("cid");
		int cid = Integer.parseInt(cId);
			
		ContactService service = (ContactService)UserFactory.getInstance(Type.CSERVICE);
		
		Contact contact = new Contact();
		
		
		HttpSession session = request.getSession();

		User user = (User) session.getAttribute("userKey");
		int id = user.getUserId();
		contact.setRefId(id);

		try {
			service.deleteContact(id, cid);
			RequestDispatcher rd = request.getRequestDispatcher("deletesuccess.jsp");
			rd.forward(request, response);
		} catch (InvalidContactException e) {
			RequestDispatcher rd = request.getRequestDispatcher("deletefailure.jsp");
			request.setAttribute("err", e.getMessage());
			rd.include(request, response);
		}
			
	}

}
