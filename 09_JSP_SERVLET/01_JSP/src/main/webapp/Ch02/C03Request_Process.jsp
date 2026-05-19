<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
<%
	/*  
		request 내장객체 : 요청정보값 저장(Http Request Protocol의 구조형태)
		HttpServletRequest 클래스로 생성된 객체
		
	*/
	
	/* 문자셋 설정 */
	request.setCharacterEncoding("UTF-8");
	response.setContentType("text/html; charset=UTF-8");
	//
	String username = request.getParameter("username");
	String password = request.getParameter("password");
	String bgColor = request.getParameter("bgcolor");
	System.out.printf("%s %s %s \n",username,password,bgColor);
%>

    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor=<%=bgColor%> >
	
	<h1>C02 Process File</h1>
	
	username : <%=username %><br/>
	passowrd : <%=password %><br/>
	bgcolor : <%=bgColor %><br/>

</body>
</html>