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


@WebServlet("/contact")
public class ContactServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("doPost method call in 2nd servlet");	
		PrintWriter pw = response.getWriter();
		
	
		
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		
		String phoneNo = request.getParameter("phoneNo");
		String email = request.getParameter("email");
		
		HttpSession session = request.getSession();
		firstName = (String)session.getAttribute("key1");
		lastName = (String)session.getAttribute("key2");
		
		pw.print("<html><body>");
		
		pw.print("First Name : " + firstName );
		pw.print("<br>Last Number : " + lastName);
		pw.print("<br>Phone Number : " + phoneNo);
		pw.print("<br>Email : " + email);
		pw.print("</body></html>");
		
	}

}
