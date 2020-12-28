<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<jsp:include page="/jsp/menu/head.jsp" />
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<div>
		<h1>강의 상세 페이지 입니다.</h1>
		<div>
			<img width="18%" src="images/${vo.eduImg}"> <a>강의명:
				${vo.eduTitle}</a>
		</div>
		<div>

			<p>강사: ${vo.eduLecturer}</p>
			<p>조회수: ${vo.eduHit}</p>
			<p>키워드: ${vo.eduKeyword}</p>
		</div>
		<div>
			<h1>게시판 형식 추가===>강의소개,교육과정,수강후기게시판,새소식(🙈 아직 내용이 없습니다. 🙉)</h1>
			<h2>이 부분 다 하면 둥둥 떠다니는 배너 만들겁니다.</h2>
			<iframe width="98%" height="600" src="/SemiColon/EduDescript.do?id=${vo.eduNumber}" name="descriptTable" id="descriptTable"></iframe>
		</div>
	</div>


</body>
<jsp:include page="/jsp/menu/footer.jsp" />

</html>