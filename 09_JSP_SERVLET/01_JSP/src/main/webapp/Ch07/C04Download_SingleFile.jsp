<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page import="java.io.*" %>

<% 
	String dirPath = pageContext.getServletContext().getRealPath("/")+"Ch07\\files\\";
	System.out.println("Real_Path : " + dirPath);

	
	//INPUTSTREAM
	InputStream fin = new FileInputStream(dirPath+"file1.pdf");
	
	//OUT 객체의 스트림을 제거
	out.clear();		//response outStream을 닫고 버터 초기화
	out=pageContext.pushBody(); //현재 페이지의 Body에 out 연결
	
	//RESPONSE HEADER 설정()
	response.setHeader("content-Type", "application/octet-stream;charset-utf-8");
	response.setHeader("Content-Disposition", "attachment; filename=file1.pdf");

	
	//OUTPUTSTREAM
	ServletOutputStream bout = response.getOutputStream();
	
	byte [] buff = new byte[4096];
	while(true){
		int data = fin.read(buff);
		if(data==-1)
			break;
		bout.write(buff,0,data);
		bout.flush();
	}
	bout.close();
	fin.close();
	
%>
    
    
    
    
    
    
    
    
    
    
    
    
    
    