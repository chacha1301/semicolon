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
											<P>TITLE</P>
											<h3>${vo.boardtitle }</h3>
											<br>
											<hr>
										</div>
									</div>
									<div class="row">
										<div class="col-md-12" align="center">
											<P>CONTENT</p>
											<h3>${vo.boardcontent }</h3>
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
									<P>WRITER</p>
									<h3>${vo.memberid }</h3>
								</div>
							</div>
						</div>
					</div>
					<div class="row mb-3">
						<div class="col-md-12" align="center">
							<div class="card">
								<div class="card-body">
									<P>DATE</p>
									<h3>${vo.boarddate }</h3>
								</div>
							</div>
						</div>
					</div>
					<div align="center">
						<p>&nbsp;
						<p />
						<button type="button" class="btn btn-sm btn-primary btn-create"
							onclick="location.href='/SemiColon/BoardList.do'">List</button>
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