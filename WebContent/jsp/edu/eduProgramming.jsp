<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<jsp:include page="/jsp/menu/head.jsp" />

<head>
<meta charset="UTF-8">
<title>프로그래밍</title>
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
	<input type="hidden" id="programming" name="programming"
		value="${vo.eduSubject}">

	<div class="banner_section layout_padding">
		<div class="fashion_section">
			<div id="main_slider" class="carousel slide" data-ride="carousel">
				<div class="carousel-inner">
					<div class="carousel-item active">
						<div class="container">
							<h1 class="fashion_taital">신규 강좌</h1>
							<div class="fashion_section_2">
								<div class="row">
									<div class="row row-cols-1 row-cols-md-3 g-4">
										<c:forEach var="vo" items="${list }">
											<div class="col">
												<div class="card h-100">
													<img src="images/lecturer/interviewGuide.jpg"
														class="card-img-top" alt="...">
													<div class="card-body">
														<h5 class="card-title">Card title</h5>
														<p class="card-text">${vo.eduLecturer}</p>
													</div>
													<div class="card-footer">
														<div class="buy_bt">
															<a href="#">Buy Now</a>
															<p class="price_text">
																Price <span style="color: #262626;">$ 30</span>
															</p>
														</div>
													</div>
												</div>
											</div>
										</c:forEach>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
				<a class="carousel-control-prev" href="#main_slider" role="button"
					data-slide="prev"> <i class="fa fa-angle-left"></i>
				</a> <a class="carousel-control-next" href="#main_slider" role="button"
					data-slide="next"> <i class="fa fa-angle-right"></i>
				</a>
			</div>
		</div>
	</div>







	<c:forEach var="vo" items="${list }">
		<div class="col">
			<div class="card h-100">
				<img src="images/lecturer/excel.jpg" class="card-img-top" alt="...">
				<div class="card-body">
					<p class="card-text">${vo.eduLecturer}</p>
					<p class="card-text">${vo.eduDifficulty}</p>

				</div>
				<div class="card-footer">
					<div class="buy_bt">
						<a href="#">${vo.eduTitle}</a>
						<p class="price_text">
							Price <span style="color: #262626;">$ ${vo.eduPrice }</span>
						</p>
					</div>
				</div>
			</div>
		</div>
	</c:forEach>
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