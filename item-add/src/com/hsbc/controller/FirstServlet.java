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


@WebServlet("/add")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String itemName = request.getParameter("itemName");
		HttpSession session = request.getSession();
		PrintWriter pw = response.getWriter();

		List<String> listItem = null;
		
		if(session.getAttribute("listItem")==null) {
			listItem = new ArrayList<String>();
			listItem.add(itemName);

		}else {
			listItem = (List<String>) session.getAttribute("listItem");
			listItem.add(itemName);
		}
				
		session.setAttribute("listItem", listItem);
		int size = listItem.size();

		
		RequestDispatcher rd = request.getRequestDispatcher("main.html");

		pw.print("<html><body>");
		pw.print("Item Count : "+ size);
		pw.print("</body></html>");
		rd.include(request, response);
		
	
	}

}
