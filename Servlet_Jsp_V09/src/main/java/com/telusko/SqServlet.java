package com.telusko;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SqServlet extends HttpServlet{
	public void service(HttpServletRequest req,HttpServletResponse rep) throws IOException {
		
		// fetching the request object
		int k = Integer.parseInt(req.getParameter("k"));
		
		// square of a number
		k = k *k;
		// calling the server
		PrintWriter out = rep.getWriter();
		out.println("result is:"+" "+k);
		
		// it will print on console 
//		System.out.println("sq is called");
	}

}
