package com.telusko;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/sq")
public class SqServlet extends HttpServlet{
	public void service(HttpServletRequest req,HttpServletResponse rep) throws IOException {
		int k = 0;
		
		Cookie cookies[] = req.getCookies();
		
		for(Cookie c:cookies)
		{
			if(c.getName().equals("k")) {
				k = Integer.parseInt(c.getValue( ));
			}
		}
		
		// square of a number
		k = k *k;
		// calling the server
		PrintWriter out = rep.getWriter();
		out.println("result is:"+" "+k);
		
		// it will print on console 
//		System.out.println("sq is called");
	}

}
