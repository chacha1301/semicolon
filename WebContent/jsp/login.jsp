<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<jsp:include page="/mainBanner.jsp" />

<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
	<link rel="dns-prefetch" href="https://fonts.gstatic.com">
	<link href="https://fonts.googleapis.com/css?family=Raleway:300,400,600" rel="stylesheet" type="text/css">
	<link rel="stylesheet" href="css/style.css">
	<link rel="icon" href="Favicon.png">
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
	<title>login.jsp</title>
</head>

<body>
	<main class="login-form">
		<div class="cotainer">
			<div class="row justify-content-center">
				<div class="col-md-6">
					<div class="card">
						<div class="card-header">LOGIN</div>
						<div class="card-body">
							<form action="" method="">
								<div class="form-group row">
									<label for="email_address" class="col-md-4 col-form-label text-md-right">ID
									</label>
									<div class="col-md-6">
										<input type="text" id="email_address" class="form-control"
											name="email-address" required autofocus>
									</div>
								</div>

								<div class="form-group row">
									<label for="password"
										class="col-md-4 col-form-label text-md-right">Password</label>
									<div class="col-md-6">
										<input type="password" id="password" class="form-control"
											name="password" required>
									</div>
								</div>
								<div class="col-md-6 offset-md-4">
									<button type="submit" class="btn btn-primary">
										LOGIN</button>
									<a href="signup.jsp" class="btn btn-link"> 아직 세미콜론 회원이 아니신가요? </a>
								</div>
						</div>
						</form>
					</div>
				</div>
			</div>
		</div>
		</div>

	</main>

</body>

</html>