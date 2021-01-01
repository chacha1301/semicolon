<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<jsp:include page="/jsp/menu/head.jsp" />

<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
div.padding {
	padding-left: 5%;
}

div.input-group>.form-control {
	position: relative;
	-ms-flex: 1 1 auto;
	flex: 1 1 auto;
	width: 92%;
	margin-bottom: 0;
}
textarea {
	border: 1px solid #999999;
	width: 100%;
	margin: 5px 0;
	padding: 3px;
}
</style>
<script
	src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
<link
	href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
</head>
<body>
	<div class="padding">
		<div align="left">
			<p>&nbsp;
			<p />
			<p>&nbsp;
			<p />
			<h1 style="font-size: 30px; font-weight: bold">Edit</h1>
		</div>
	</div>
	<form id="frm" name="frm" action="/SemiColon/BoardEdit.do"
		method="post">

		<div class="col-md-10 col-md-offset-1">
			<div class="panel panel-default panel-table">
				<div class="panel-heading">
					<P style="font-size: 20px; font-weight: bold">
						TITLE: <input type="text" id="bTitle" name="bTitle">
					</P>

				</div>
				<div class="panel-body">
					<P style="font-size: 20px; font-weight: bold">CONTENT</p>
					<h4>
						<textarea id="bContent" name="bContent" rows="10" cols=>${vo.boardcontent }</textarea>
					</h4>
				</div>
				<div class="panel-footer">
					<h4 style="font-size: 20px; font-weight: bold">WRITER & DATE :
						&nbsp;&nbsp;${vo.memberid }&nbsp;&nbsp;(${vo.boarddate })</h4>
				</div>
			</div>
		<div>
			<input type="hidden" id="id" name="id" value="${vo.boardnumber}">
			<button type="submit" class="btn btn-sm btn-primary2 btn-create">수
				정</button>
			&nbsp;&nbsp;
			<button type="reset" class="btn btn-sm btn-primary2 btn-create">취
				소</button>
			&nbsp;&nbsp;
			<button type="button"
				onclick="location.href='/SemiColon/BoardList.do'"
				class="btn btn-sm btn-primary2 btn-create">목록보기</button>
		</div>
		</div>
	</form>

</body>
</html>