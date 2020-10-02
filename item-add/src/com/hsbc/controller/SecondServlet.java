package com.hsbc.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/display")
public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		HttpSession session = request.getSession();
		PrintWriter pw = response.getWriter();
		
		List<String> listItem  =  (List<String>) session.getAttribute("listItem");

		int size = listItem.size();
		
		RequestDispatcher rd = request.getRequestDispatcher("main.html");

		pw.print("<html><body>");
		pw.print("Item Count : "+ size);
		for(String item : listItem)
			pw.println("Item : " + item);
		
		pw.print("</body></html>");
		rd.include(request, response);

		
	}

}
