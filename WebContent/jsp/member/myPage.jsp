<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<jsp:include page="../menu/head.jsp" />
<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<link rel="dns-prefetch" href="https://fonts.gstatic.com">
<link href="https://fonts.googleapis.com/css?family=Raleway:300,400,600"
	rel="stylesheet" type="text/css">
<link rel="stylesheet" href="css/style.css">
<link rel="icon" href="Favicon.png">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
<title>Insert title here</title>
</head>
<body>
	<div class="container">
	<div align="center">
		<p>&nbsp;
		<p />
		<p>&nbsp;
		<p />
		<h1 style="font-size: 30px; font-weight: bold">MyPage</h1>
	</div>
		<section class="main-content  py-4 mb-5">
			<div class="container">
				<div class="row">
					<div class="col-md-12">
					<br>
					<br>
						<hr>
						<br>
						<h5>이름: ${name }</h5>
						<h5>아이디: ${id}</h5>
						<h5>비밀번호: ${password}</h5>
						<h5>수강중인 강좌:</h5>
						<c:if test="${vo.eduState eq 1}">
						<c:forEach var="vo" items="${list }">
							<div class="fuck">
								<div class="card" style="width: 18rem; height: 25rem"
									onclick="location.href='/SemiColon/EduRead.do?id=${vo.eduNumber}'">
									<img class="card-img-top" src="images/${vo.eduImg}"
										alt="Card image cap">
									<div class="card-body">
										<h5 class="card-title" style="height: 60px">${vo.eduTitle }</h5>
										<h5 class="card-text">${vo.eduLecturer }</h5>
										<h5 class="card-text">난이도 : ${vo.eduDifficulty }</h5>
										<a href="#" class="btn btn-primary">$ ${vo.eduPrice }</a>
									</div>
								</div>
								&nbsp;
							</div>
						</c:forEach>
						</c:if>
					</div>
				</div>
			</div>
		</section>
	</div>
</body>
<jsp:include page="../menu/footer.jsp" />
</html>