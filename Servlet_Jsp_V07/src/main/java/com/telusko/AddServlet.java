package com.telusko;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet{
	
	public void service(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException {
		// fetch two values from client
		int i = Integer.parseInt(request.getParameter("num1"));
		int j = Integer.parseInt(request.getParameter("num2"));
		
		int k = i+j;
		
		// set an attribute AddServlet to SqServlet
		// setting the data to the request object
		request.setAttribute("k",k); // key,value
		
		// we r request dispatching from one server to another server
		RequestDispatcher rd = request.getRequestDispatcher("sq"); // url
		rd.forward(request, response);
		
	}

}
