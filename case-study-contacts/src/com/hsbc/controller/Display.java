package com.hsbc.controller;

import java.io.IOException;
import java.util.List;

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
import com.hsbc.model.service.UserService;
import com.hsbc.model.util.Type;
import com.hsbc.model.util.UserFactory;


@WebServlet("/Display")
public class Display extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ContactService service = (ContactService)UserFactory.getInstance(Type.CSERVICE);

		HttpSession session = request.getSession();
		User user = (User) session.getAttribute("userKey");
		int id = user.getUserId();
		
		List<Contact> contact = service.getAllcontact(id);
		session.setAttribute("contactListKey",contact);
		RequestDispatcher rd = request.getRequestDispatcher("displaysuccess.jsp");
		rd.forward(request, response);
			
		
	
	}
	
	
}
