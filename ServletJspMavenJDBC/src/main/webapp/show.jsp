<%@page import="com.krishna.webmodel.Alien"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%  Alien a11=(Alien)request.getAttribute("alien");
	out.print(a11.getAname());
%>
</body>
</html>