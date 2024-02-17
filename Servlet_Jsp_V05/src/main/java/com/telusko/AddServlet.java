package com.telusko;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet{
	
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException {
		// fetch two values from client
		int i = Integer.parseInt(request.getParameter("num1"));
		int j = Integer.parseInt(request.getParameter("num2"));
		
		int k = i+j;
		// print in our console
//		System.out.println("result is:"+" "+k);
		
		// calling the server
		PrintWriter out = response.getWriter();
		// output on our client page
		out.println("result is:"+" "+k);
		
	}

}
