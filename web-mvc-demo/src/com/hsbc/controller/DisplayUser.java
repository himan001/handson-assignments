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
import com.hsbc.model.service.UserService;
import com.hsbc.model.util.Type;
import com.hsbc.model.util.UserFactory;

/**
 * Servlet implementation class DisplayUser
 */
@WebServlet("/DisplayUser")
public class DisplayUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String userId = request.getParameter("user");		
		int id = Integer.parseInt(userId);
		UserService service = (UserService)UserFactory.getInstance(Type.SERVICE);
		
		try {
		User user = service.getUser(id);

		HttpSession session = request.getSession();
		session.setAttribute("userKey", user);
		RequestDispatcher rd = request.getRequestDispatcher("displayusersuccess.jsp");
		rd.forward(request, response);
		}catch(AuthenticationException e) {
			RequestDispatcher rd = request.getRequestDispatcher("displayuserfailure.jsp");
			request.setAttribute("err", e.getMessage());
			rd.include(request, response);
		}
	
	}

}
