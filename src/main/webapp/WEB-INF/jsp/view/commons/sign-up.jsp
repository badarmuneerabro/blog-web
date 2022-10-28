<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Xee-Blog-Registration</title>
</head>
<body>

	<main class="primary-background p-5 banner-background">
		<div class="container">
			<div col="col-md-6 offset-md-3">
				<div class="card">
					<div class="card-header text-center primary-background text-white">
						<i class="fa-solid fa-user-plus fa-3x"></i>
						<p>Register here</p>
					</div>

					<div class="card-body">

						<form action="blog" method="POST">
							<div class="form-group">
								<label for="username">Username</label> <input name="username"
									type="text" class="form-control" id="username"
									aria-describedby="emailHelp" placeholder="Enter Username">
							</div>
							
							<div class="form-group">
								<label for="exampleInputEmail1">Email address</label> <input name="email"
									type="email" class="form-control" id="exampleInputEmail1"
									aria-describedby="emailHelp" placeholder="Enter email">
								<small id="emailHelp" class="form-text text-muted">We'll
									never share your email with anyone else.</small>
							</div>


							<div class="form-group">
								<label for="exampleInputPassword1">Password</label> <input name="password"
									type="password" class="form-control" id="exampleInputPassword1"
									placeholder="Password">
							</div>
							
							<div class="form-group">
								<label for="gender">Select Gender</label><br>
								<input type="radio" class="" name="gender" value="male" id="gender">Male
								<input type="radio" class="" name="gender" value="female" id="gender">Female
							</div>
							
							<div class="form-group">
								<textarea name="about" class="form-control" placeholder="Enter something about you" rows="5"></textarea>
							</div>
							<div class="form-check">
								<input type="checkbox" class="form-check-input" name="check"
									id="exampleCheck1"> <label class="form-check-label"
									for="exampleCheck1">Agree terms and conditions</label>
							</div>
							<c:if test="${ not boxChecked }"><strong>Please Check the box</strong></c:if>
							<br>
							<button type="submit" class="btn btn-primary">Submit</button>
						</form>

					</div>
				</div>
			</div>
		</div>
	</main>
</body>
</html>