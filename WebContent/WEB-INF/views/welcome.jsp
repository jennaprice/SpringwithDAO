<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!-- let's add tag srping:url -->
<!--<spring:url value="/resources/crunchify.css" var="crunchifyCSS" />
<spring:url value="/resources/crunchify.js" var="crunchifyJS" /> -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>
<link href="resources/crunchify.css" rel="stylesheet" />
<script src="resources/crunchify.js"></script>
<!-- Finish adding tags -->
<title>Welcome</title>
</head>
<body>

<h2>Checkout this font color. Loaded from 'crunchify.css' file under '/WebContent/resources/' folder</h2>
 
		<div id="crunchifyMessage"></div>
<!--  <table> 
<tr> 
		<td>Product ID, ProductName, Supplier ID </td>
	</tr>
<c:forEach items="${message}" var="list"> 
	<tr> 
		<td> <c:out value="${list}"> </c:out> </td>
	</tr>

</c:forEach>
</table>
-->
</body>
</html>