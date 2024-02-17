<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="green">
	<% 
	// learning about exception handling in jsp
	// int o = 9/0; // we cannot divide by zero .So it will throw an error
	
	// will be use try - catch
	try{
		int o = 9/0;
	}
	catch(Exception e){
		out.println("Error"+" "+e.getMessage());
	}
	
	
	int i = Integer.parseInt(request.getParameter("num1"));
	int j = Integer.parseInt(request.getParameter("num2"));
	
	int k = i+j;
	// PrintWriter out = response.getWriter(); -> in jsp we dont need to create this object 
	out.println("result is:"+" "+k); // by default it will give implicit object this is -> out
	
	// learn about pageContext
	// USING THIS PAGE CONTEXT -> we can set and get the value.
	// by deafult the scope of page stays in a current page 
	// but what if u want to specify some scope and we can do that
	// pageContext.SESSION_SCOPE
	pageContext.setAttribute("name", "navin",pageContext.SESSION_SCOPE);
	
	%>
</body>
</html>