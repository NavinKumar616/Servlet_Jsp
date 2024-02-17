package com.telusko;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AddServlet extends HttpServlet{
	
	public void service(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException {
		// fetch two values from client
		int i = Integer.parseInt(request.getParameter("num1"));
		int j = Integer.parseInt(request.getParameter("num2"));
		
		int k = i+j;
		
		HttpSession session = request.getSession(); // HttpSession -> is an Interface.
		session.setAttribute("k",k);
		
		// this servlet which is add servlet  is sending a  response to a client
		// by saying hey client just go to SqServlet
		// now client will send a new request to a SqServlet 
		response.sendRedirect("sq");
		
		// we r request dispatching from one server to another server
//		RequestDispatcher rd = request.getRequestDispatcher("sq"); // url
//		rd.forward(request, response);
		
	}

}
