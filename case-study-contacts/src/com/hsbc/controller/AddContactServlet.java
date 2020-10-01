package com.hsbc.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.hsbc.model.beans.Contact;
import com.hsbc.model.beans.User;
import com.hsbc.model.service.ContactService;
import com.hsbc.model.util.Type;
import com.hsbc.model.util.UserFactory;


@WebServlet("/AddContactServlet")
public class AddContactServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String name = request.getParameter("conName");
		String phoneNo = request.getParameter("phone");
		
		Long phone = Long.parseLong(phoneNo);
		
		ContactService service = (ContactService)UserFactory.getInstance(Type.CSERVICE);
		
		Contact contact = new Contact();
		contact.setName(name);
		contact.setPhoneNo(phone);
		
		HttpSession session = request.getSession();

		User user = (User) session.getAttribute("userKey");
		int id = user.getUserId();
		contact.setRefId(id);

		Contact c = service.createContact(id, contact);
		session.setAttribute("contactKey", c);
		RequestDispatcher rd = request.getRequestDispatcher("addcontact.jsp");
		rd.forward(request, response);
	}

}
