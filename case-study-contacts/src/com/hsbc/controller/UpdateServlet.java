package com.hsbc.controller;

import java.io.IOException;
import java.util.Objects;

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
 * Servlet implementation class UpdateServlet
 */
@WebServlet("/UpdateServlet")
public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String phoneNo = request.getParameter("phone");
		String password = request.getParameter("pass");
		
		
		UserService service = (UserService)UserFactory.getInstance(Type.SERVICE);
		try {
	
			HttpSession session = request.getSession();
			User user = (User) session.getAttribute("userKey");
			int id =   user.getUserId(); 
			User user1 = null;
			
			if(phoneNo!=null && !phoneNo.isEmpty()) {
				long phone = Long.parseLong(phoneNo);
				 user1 = service.updatePhone(id, phone);
				 session.setAttribute("userKey", user1);
				 }
			
			if(password!=null && !password.isEmpty()) {
				user1 = service.updatePassword(id, password);
				session.setAttribute("userKey", user1);
				}
			
			RequestDispatcher rd = request.getRequestDispatcher("updatesuccess.jsp");
			rd.forward(request, response);
		}catch(AuthenticationException e) {	
			RequestDispatcher rd = request.getRequestDispatcher("updatefailure.jsp");
			request.setAttribute("err", e.getMessage());
			rd.forward(request, response);
			
		}
	}

}
