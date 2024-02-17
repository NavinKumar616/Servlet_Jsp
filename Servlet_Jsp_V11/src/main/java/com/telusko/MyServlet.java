package com.telusko;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet{
	public void service(HttpServletRequest req,HttpServletResponse reps) throws IOException {
		PrintWriter out = reps.getWriter();
		out.print("hi"+" "); 
		
		//ServletContext
		//if u have multiple servlets which will share the same value go for servlet context
//		ServletContext ctx = getServletContext();
//		String str = ctx.getInitParameter("name");
//		out.println(str);
		
		//ServletConfig
		//if u have different value for different servlet go for servlet config
		ServletConfig cg = getServletConfig();
		String str = cg.getInitParameter("name");
		out.println(str);
	}

}
