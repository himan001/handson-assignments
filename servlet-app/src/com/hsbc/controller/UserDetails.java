package com.hsbc.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class UserDetails
 */
@WebServlet("/user")
public class UserDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost method call");	
		PrintWriter pw = response.getWriter();
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		
		HttpSession session = request.getSession();
		
		session.setAttribute("key1", firstName);
		session.setAttribute("key2", lastName);

		
		RequestDispatcher rd = request.getRequestDispatcher("contact.html");
		pw.print("<html><body>");
		pw.print("First Name : " + firstName);
		pw.print("<br>Last Name : " + lastName);
		pw.print("</body></html>");
		rd.include(request, response);
		
	}

}
