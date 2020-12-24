<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<jsp:include page="/jsp/menu/head.jsp" />
<head>
	<meta charset="UTF-8">
	<title>loginResult.jsp</title>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
</head>
<body>
	<div align="center">
		<c:if test="${auth ne null }">
			<h3>${vo.memberName } 님 환영합니다.</h3>
		</c:if>
	</div>	
</body>
<jsp:include page="/jsp/menu/footer.jsp" />

</html>