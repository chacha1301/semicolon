<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<jsp:include page="/jsp/menu/head.jsp" />
</head>
<body>
	<div>
		<h1>여기에 컨트롤러 만들어서 리스트 가져와서 뿌려주는데</h1>
	</div>

	<div class="banner_section layout_padding">
		<div class="fashion_section">
			<div id="main_slider" class="carousel slide" data-ride="carousel">
				<div class="carousel-inner">
					<div class="carousel-item active">
						<div class="container">
							<h1 class="fashion_taital">신규강좌</h1>
							<div class="fashion_section_2">
								<div class="row">
									<div class="row row-cols-1 row-cols-md-3 g-4">
										<c:forEach var="vo" items="${list }">
											<div class="fuck">
												<div class="card" style="width: 18rem;">
													<img class="card-img-top" src="images/${vo.eduImg}"
														alt="Card image cap">
													<div class="card-body">
														<h5 class="card-title">${vo.eduTitle }</h5>
														<h5 class="card-text">${vo.eduLecturer }</h5>
														<h5 class="card-text">${vo.eduDifficulty }</h5>
														<a href="#" class="btn btn-primary">$ ${vo.eduPrice }</a>
													</div>
												</div>
												&nbsp;
											</div>
										</c:forEach>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
<jsp:include page="/jsp/menu/footer.jsp" />
</html>