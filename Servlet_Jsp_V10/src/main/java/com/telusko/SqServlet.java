package com.telusko;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SqServlet extends HttpServlet{
	public void service(HttpServletRequest req,HttpServletResponse rep) throws IOException {
		
		// reference 
		HttpSession session = req.getSession();
		
		// once u remove k , u cannot fetch the value
//		session.removeAttribute("k");
		
		// fetching the request object
		int k = (int)session.getAttribute("k");
		
		// square of a number
		k = k *k;
		// calling the server
		PrintWriter out = rep.getWriter();
		out.println("result is:"+" "+k);
		
		// it will print on console 
//		System.out.println("sq is called");
	}

}
