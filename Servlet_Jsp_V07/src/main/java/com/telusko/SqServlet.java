package com.telusko;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SqServlet extends HttpServlet{
	public void service(HttpServletRequest req,HttpServletResponse rep) throws IOException {
		
		// fetching the request object
		int k = (int) req.getAttribute("k");
		
		// square of a number
		k = k *k;
		// calling the server
		PrintWriter out = rep.getWriter();
		out.println("result is:"+" "+k);
	}

}
