<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%

	/* String username = request.getParameter("username");
	String password = request.getParameter("password");
	
	System.out.println("현재위치 : 04.jsp");
	
	Object ob1 = request.getAttribute("02");
	System.out.println("02 : " + ob1); 
	Object ob2 = request.getAttribute("03");
	System.out.println("03 : " + ob2);  */
 
	//Forward 03.jsp
	//request.getRequestDispatcher("./04.jsp").forward(request, response);
	
%>  
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>04.JSP PAGE</h1>
	<%-- 
	USERNAME : <%=username %><br/>
	PASSWORD : <%=password %><br/> 
	--%>

	USERNAME : ${username } <br/>
	PASSWORD : ${password } <br/>
	

</body>
</html>