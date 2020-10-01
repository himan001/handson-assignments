package com.hsbc.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.hsbc.model.beans.User;
import com.hsbc.model.service.UserService;
import com.hsbc.model.util.Type;
import com.hsbc.model.util.UserFactory;


@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("pass");
		String phoneNo = request.getParameter("phone");
		String dob = request.getParameter("dob");
		Long phone = Long.parseLong(phoneNo);
		UserService service = (UserService)UserFactory.getInstance(Type.SERVICE);
		
		
		User user = new User();
		user.setName(username);
		user.setPassword(password);
		user.setPhone(phone);
		user.setDob(dob);
			
		User u = service.createUser(user);
			
		HttpSession session = request.getSession();
		session.setAttribute("userKey", u);
		RequestDispatcher rd = request.getRequestDispatcher("registersuccess.jsp");
		rd.forward(request, response);
	}

}
