<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>dev</title>

<%
	 String edusubject = request.getParameter("edusubject"); 
	%>
	<script>
	console.log("<%=edusubject%>");
	let category = "<%=edusubject%>";
	</script>
	<jsp:forward page="EduListServ.do" />
</head>
<jsp:include page="/jsp/menu/head.jsp" />
<body>
 <!-- Page Content -->
 <div class="row" id="data">
 </div>
 
</body>
<jsp:include page="/jsp/menu/footer.jsp" />
</html>