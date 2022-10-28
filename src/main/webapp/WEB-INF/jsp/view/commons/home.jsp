<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Xee-Blog-home</title>
<style type="text/css">
	
</style>
</head>
<body>

	<!-- Banner -->
	<div class="container-fluid p-0 m-0 banner-background">
		<div class="jumbotron primary-background text-white">
			<div class="container">
				<h3 class="display-3">Welcome to Xee-Blog</h3>
				<p>Welcome to technical blog, world of technology.</p>
				<a href="<c:url value="/blog">
					<c:param name="action" value="register" />
				</c:url>"><button class="btn btn-outline-light btn-lg">
					<i class="fa-solid fa-user-plus p-2"></i>Start! it's free
				</button>
				</a>
				<a href="<c:url value="/blog">
					<c:param name="action" value="login" />
				</c:url>"><button class="btn btn-outline-light btn-lg">
					<i class="fa-solid fa-circle-user fa-spin p-2"></i>Login
				</button>
				</a>
			</div>
		</div>
	</div>

	<!-- Cards -->

	<div class="container">
		<div class="row mb-2">
			<div class="col-md-4">
				<div class="card">
					<div class="card-body">
						<h5 class="card-title">Java Programming</h5>
						<p class="card-text">Some quick example text to build on the
							card title and make up the bulk of the card's content.</p>
						<a href="#" class="btn btn-primary">Go somewhere</a>
					</div>
				</div>
			</div>
			<div class="col-md-4">
				<div class="card">
					<div class="card-body">
						<h5 class="card-title">Java Programming</h5>
						<p class="card-text">Some quick example text to build on the
							card title and make up the bulk of the card's content.</p>
						<a href="#" class="btn btn-primary">Go somewhere</a>
					</div>
				</div>
			</div>
			<div class="col-md-4">
				<div class="card">
					<div class="card-body">
						<h5 class="card-title">Java Programming</h5>
						<p class="card-text">Some quick example text to build on the
							card title and make up the bulk of the card's content.</p>
						<a href="#" class="btn btn-primary">Go somewhere</a>
					</div>
				</div>
			</div>
		</div>
		
		<div class="row">
			<div class="col-md-4">
				<div class="card">
					<div class="card-body">
						<h5 class="card-title">Java Programming</h5>
						<p class="card-text">Some quick example text to build on the
							card title and make up the bulk of the card's content.</p>
						<a href="#" class="btn btn-primary">Go somewhere</a>
					</div>
				</div>
			</div>
			<div class="col-md-4">
				<div class="card">
					<div class="card-body">
						<h5 class="card-title">Java Programming</h5>
						<p class="card-text">Some quick example text to build on the
							card title and make up the bulk of the card's content.</p>
						<a href="#" class="btn btn-primary">Go somewhere</a>
					</div>
				</div>
			</div>
			<div class="col-md-4">
				<div class="card">
					<div class="card-body">
						<h5 class="card-title">Java Programming</h5>
						<p class="card-text">Some quick example text to build on the
							card title and make up the bulk of the card's content.</p>
						<a href="#" class="btn btn-primary">Go somewhere</a>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>