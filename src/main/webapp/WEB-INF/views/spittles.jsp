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
<%-- <%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%> --%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<!-- <!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"> -->
<html>
  <head>
    <%-- <base href="<%=basePath%>"> --%>
    
    <title>My \hahahaha</title>

  </head>
  
  <body>
    <c:forEach items="${spittleList}" var="spittle">
    	<li id="spittle_<c:out value = "spittle.id" />">
    		<div>
    			<c:out value="${spittle.id}"></c:out>,
    			<c:out value="${spittle.message}"></c:out>
    		</div>
    		<div>
    			<span><c:out value="${spittle.time}" /></span>
    			
    			<span>
    				<c:out value="${spittle.latitude}" />,
    				<c:out value="${spittle.longitude}" />
    			</span>
    		</div>
    </c:forEach>
  </body>
</html>
