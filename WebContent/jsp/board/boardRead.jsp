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
				<p>&nbsp;
					<p />
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
											<p>${vo.boardtitle }</p>
											<br>
											<hr>
										</div>
									</div>
									<div class="row">
										<div class="col-md-12" align="center">
											<P>CONTENT</p>
											<textarea cols=150 rows="15" id="content" name="content"></textarea>
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
								</div>
							</div>
						</div>
					</div>
					<div class="row mb-3">
						<div class="col-md-12" align="center">
							<div class="card">
								<div class="card-body">
									<P>DATE</p>
									<input type="date" id="wdate" name="wdate" style="border: none">
								</div>
							</div>
						</div>
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