<%-- <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
	<head>
		<title>spittr</title>
<!-- 		<link rel ="stylesheet"
				type="text/css"
				href
		> -->
		
	</head>
	<body>
		<h1>Welcome to Spittr</h1>
	</body>
</html> --%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'home.jsp' starting page</title>

  </head>
  
  <body>
    <h1>Welcome to Spittr</h1>
  </body>
</html>
