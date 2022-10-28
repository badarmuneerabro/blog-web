<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Xee-Blog-Login</title>

<style type="text/css">
	
</style>
</head>
<body>
	<main class="d-flex align-items-center primary-background banner-background" style="height: 80vh;">
		<div class="container">
			<div class="row">
				<div class="col-md-4 offset-md-4">
					<div class="card">
						<div class="card-header primary-background text-white text-center">
							<i class="fa-solid fa-circle-user fa-3x"></i><p>Login here</p>
							<c:if test="${loginFailed }">
								<p>Invalid credentials, try again.</p>
							</c:if>
						</div>

						<div class="card-body">
							<form action="login" method="POST">
								<div class="form-group">
									<label for="exampleInputEmail1">Email address</label> <input name="email"
										type="email" class="form-control" id="exampleInputEmail1"
										aria-describedby="emailHelp" placeholder="Enter email">
									<small id="emailHelp" class="form-text text-muted">We'll
										never share your email with anyone else.</small>
								</div>
								<div class="form-group">
									<label for="exampleInputPassword1">Password</label> <input name="password"
										type="password" class="form-control"
										id="exampleInputPassword1" placeholder="Password">
								</div>
								
								<div class="container text-center">
								<button type="submit" class="btn btn-primary">Submit</button>
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