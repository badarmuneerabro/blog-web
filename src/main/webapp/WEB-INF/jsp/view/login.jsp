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
						</div>

						<div class="card-body">
							<form>
								<div class="form-group">
									<label for="exampleInputEmail1">Email address</label> <input
										type="email" class="form-control" id="exampleInputEmail1"
										aria-describedby="emailHelp" placeholder="Enter email">
									<small id="emailHelp" class="form-text text-muted">We'll
										never share your email with anyone else.</small>
								</div>
								<div class="form-group">
									<label for="exampleInputPassword1">Password</label> <input
										type="password" class="form-control"
										id="exampleInputPassword1" placeholder="Password">
								</div>
								<div class="form-check">
									<input type="checkbox" class="form-check-input"
										id="exampleCheck1"> <label class="form-check-label"
										for="exampleCheck1">Check me out</label>
								</div>
								<button type="submit" class="btn btn-primary">Submit</button>
							</form>
						</div>
					</div>
				</div>
			</div>
		</div>
	</main>
</body>
</html>