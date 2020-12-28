<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="viewport" content="initial-scale=1, maximum-scale=1">
<title>Semicolon</title>
<link rel="stylesheet" type="text/css"
	href="<%=request.getContextPath()%>/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css"
	href="<%=request.getContextPath()%>/css/style.css">
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/css/responsive.css">
<link rel="icon" href="<%=request.getContextPath()%>/images/fevicon.png"
	type="image/gif" />
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/css/jquery.mCustomScrollbar.min.css">
<link rel="stylesheet"
	href="https://netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css">
<link
	href="https://fonts.googleapis.com/css?family=Poppins:400,700&display=swap"
	rel="stylesheet">
<link rel="stylesheet" type="text/css"
	href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
<link
	href="https://fonts.googleapis.com/css?family=Great+Vibes|Poppins:400,700&display=swap&subset=latin-ext"
	rel="stylesheet">
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/css/owl.carousel.min.css">
<link rel="stylesoeet"
	href="<%=request.getContextPath()%>/css/owl.theme.default.min.css">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/fancybox/2.1.5/jquery.fancybox.min.css"
	media="screen">
</head>

<body>
	<div class="cotainer">
		<div class="banner_bg_main">
			<!-- header top section start -->
			<div class="container">
				<div class="header_section_top">
					<div class="row">
						<div class="col-sm-12">
							<div class="custom_menu">
								<ul>
									<li><a href="/SemiColon/index.jsp">HOME</a></li>
									<li><a href="/SemiColon/jsp/edu/eduMain.jsp">EDU</a></li>
									<li><a href="/SemiColon/BoardList.do">COMMUNITY</a></li>
								</ul>
							</div>
						</div>
					</div>
				</div>
			</div>
			<!-- header top section start -->
			<!-- logo section start -->
			<div class="logo_section" align="center">
				<div class="container">
					<div class="row">
						<div class="col-sm-12">
							<div class="logo">
								<a href="/SemiColon/index.jsp"><img
									src="<%=request.getContextPath()%>/images/icon.png"></a>
							</div>
						</div>
					</div>
				</div>
			</div>
			<!-- logo section end -->
			<!-- header section start -->
			<div class="header_section">
				<div class="container">
					<div class="containt_main">
						<div id="mySidenav" class="sidenav">
							<a href="javascript:void(0)" class="closebtn"
								onclick="closeNav()">&times;</a> <a href="index.jsp">Home</a> <a
								href="fashion.html">EDU</a> <a href="/SemiColon/BoardList.do">COMMUNITY</a>
						</div>
						<span class="toggle_icon" onclick="openNav()"><img
							src="<%=request.getContextPath()%>/images/toggle-icon.png"></span>
						<div class="dropdown">
							<button class="btn btn-secondary dropdown-toggle" type="button"
								id="dropdownMenuButton" data-toggle="dropdown"
								aria-haspopup="true" aria-expanded="false">강의들</button>
							<div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
								<a class="dropdown-item" href="/SemiColon/EduListServ.do"
									id="develope" name="develope">개발 · 프로그래밍</a> <a
									class="dropdown-item" href="#" id="network" name="network">보안
									· 네트워크</a> <a class="dropdown-item" href="#" name="database">데이터베이스</a>
								<a class="dropdown-item" href="#" name="skill">업무 스킬</a> <a
									class="dropdown-item" href="#" name="career">커리어</a> <a
									class="dropdown-item" href="#" name="life">라이프</a>
							</div>
						</div>
						<div class="main">
							<!-- Another variation with a button -->
							<div class="input-group">
								<input type="text" class="form-control"
									placeholder="원하는 강좌를 입력해주세요.">
								<div class="input-group-append">
									<button class="btn btn-secondary" type="button"
										style="background-color: #f26522; border-color: #f26522">
										<i class="fa fa-search"></i>
									</button>
								</div>
							</div>
						</div>
						<div class="header_box">
							<div class="login_menu">
								<ul>
									<c:if test="${auth eq null }">
										<li><a
											href="<%=request.getContextPath()%>/jsp/member/signUp.jsp">
												<i class="fa fa-shopping-cart" aria-hidden="true"></i> <span
												class="padding_10">SIGNUP</span>
										</a></li>
									</c:if>
									<c:if test="${auth eq null }">
										<li><a
											href="<%=request.getContextPath()%>/jsp/member/login.jsp">
												<i class="fa fa-user" aria-hidden="true"></i> <span
												class="padding_10">LOGIN</span>
										</a></li>
									</c:if>
									<c:if test="${auth ne null }">
										<li><a href="/SemiColon/Logout.do"> <i
												class="fa fa-user" aria-hidden="true"></i> <span
												class="padding_10">LOGOUT</span></a></li>
									</c:if>
									<li><c:if test="${auth ne null }">
											<span class="padding_10"></span>
											<span></span>
										</c:if></li>
								</ul>
							</div>
						</div>
					</div>
				</div>
			</div>
			<!-- header section end -->
			<!-- banner section start -->
			<div class="banner_section layout_padding">
				<div class="container">
					<div id="my_slider" class="carousel slide" data-ride="carousel">
						<div class="carousel-inner">
							<div class="carousel-item active">
								<div class="row">
									<div class="col-sm-12">
										<h1 class="banner_taital">
											Get Upgrade <br>Your IT skills
										</h1>
										<div class="buynow_bt">
											<a href="#">Buy Now</a>
										</div>
									</div>
								</div>
							</div>
							<div class="carousel-item">
								<div class="row">
									<div class="col-sm-12">
										<h1 class="banner_taital">
											WakeUp <br>Your Potential
										</h1>
										<div class="buynow_bt">
											<a href="#">Buy Now</a>
										</div>
									</div>
								</div>
							</div>
							<div class="carousel-item">
								<div class="row">
									<div class="col-sm-12">
										<h1 class="banner_taital">
											Be An Expert <br> From Now On
										</h1>
										<div class="buynow_bt">
											<a href="#">Buy Now</a>
										</div>
									</div>
								</div>
							</div>
						</div>
						<a class="carousel-control-prev" href="#my_slider" role="button"
							data-slide="prev"> <i class="fa fa-angle-left"></i>
						</a> <a class="carousel-control-next" href="#my_slider" role="button"
							data-slide="next"> <i class="fa fa-angle-right"></i>
						</a>
					</div>
				</div>
			</div>
			<!-- banner section end -->
		</div>
	</div>

	<script>
		function openNav() {
			document.getElementById("mySidenav").style.width = "250px";
		}

		function closeNav() {
			document.getElementById("mySidenav").style.width = "0";
		}
	</script>

</body>

</html>