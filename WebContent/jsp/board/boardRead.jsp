<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<jsp:include page="/jsp/menu/head.jsp" />

<head>
<meta charset="UTF-8">
<title>boardRead.jsp</title>
</head>

<body>
	<div align="center">
		<p>&nbsp;
		<p />
		<p>&nbsp;
		<p />
		<h1 style="font-size: 30px; font-weight: bold">QnA<span
									style="color: red; font-size: 30px;">?</span></h1>

	</div>

	<section class="main-content  py-4 mb-5">
		<div class="container">
			<div class="row">
				<div class="col-md-12">
					<div class="row mb-3">
						<div class="col-md-12">
							<div class="">
								<div class="card-body">
									<div class="row">
										<div class="col-md-12" align="center">
											<P style="font-size: 20px; font-weight: bold">TITLE</P>
											<h4>${vo.boardtitle }</h4>
											<br>
											<hr>
										</div>
									</div>
									<div class="row">
										<div class="col-md-12" align="center">
											<P style="font-size: 20px; font-weight: bold">CONTENT</p>
											<h4>${vo.boardcontent }</h4>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
					<div class="row mb-3">
						<div class="col-md-12" align="center">
							<div class="card">
								<div class="card-body">
									<P style="font-size: 20px; font-weight: bold">WRITER</p>
									<h4>${vo.memberid }</h4>
								</div>
							</div>
						</div>
					</div>
					<div class="row mb-3">
						<div class="col-md-12" align="center">
							<div class="card">
								<div class="card-body">
									<P style="font-size: 20px; font-weight: bold">DATE</p>
									<h4>${vo.boarddate }</h4>
								</div>
							</div>
						</div>
					</div>
					<div class="row mb-3">
						<div class="col-md-12" align="center">
							<div class="card">
								<div class="card-body">
									<textarea rows="5" cols=120 style="border: none"></textarea><br>
									<button type="button" class="btn btn-sm btn-primary2 btn-create" >&nbsp;답변쓰기&nbsp;</button>
								</div>
							</div>
						</div>
					</div>
					<div align="center">
						<p>&nbsp;
						<p />
						<button type="button" class="btn btn-sm btn-primary btn-create"
							onclick="location.href='/SemiColon/BoardList.do'">&nbsp;&nbsp;List&nbsp;&nbsp;</button>
					</div>
				</div>
			</div>
		</div>
	</section>
	<div align="center">
		<p>&nbsp;
		<p />
		<p>&nbsp;
		<p />
		<p>&nbsp;
		<p />
		<p>&nbsp;
		<p />
	</div>
</body>
<jsp:include page="/jsp/menu/footer.jsp" />

</html>