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
import com.hsbc.model.beans.User;
import com.hsbc.model.service.ContactService;
import com.hsbc.model.service.UserService;
import com.hsbc.model.util.Type;
import com.hsbc.model.util.UserFactory;

/**
 * Servlet implementation class DeleteProfile
 */
@WebServlet("/DeleteProfile")
public class DeleteProfile extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		
		
		UserService service = (UserService)UserFactory.getInstance(Type.SERVICE);
		ContactService serviceContact = (ContactService)UserFactory.getInstance(Type.CSERVICE);

		HttpSession session = request.getSession();
		User user = (User) session.getAttribute("userKey");
		int id =   user.getUserId(); 
		serviceContact.deleteAll(id);
		service.deleteUser(id);
			
		session.invalidate();
			
		RequestDispatcher rd = request.getRequestDispatcher("deleteuser.jsp");
		rd.forward(request, response);
		
	}

	
}
