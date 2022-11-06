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
				<a
					href="<c:url value="/blog">
					<c:param name="action" value="register" />
				</c:url>"><button
						class="btn btn-outline-light btn-lg">
						<i class="fa-solid fa-user-plus p-2"></i>Start! it's free
					</button> </a> <a
					href="<c:url value="/blog">
					<c:param name="action" value="login" />
				</c:url>"><button
						class="btn btn-outline-light btn-lg">
						<i class="fa-solid fa-circle-user fa-spin p-2"></i>Login
					</button> </a>
			</div>
		</div>
	</div>

	<!-- Cards -->


	<div>
		<div class="row">
			<c:choose>
				<c:when test="${not empty posts }">
					<c:forEach items="${posts }" var="post">
						<div class="col-md-6 mt-2">
							<div class="card">
								<img class="card-img-top" src="images/blog.png" alt="Blog image">
								<div class="card-body">
									<h2>${post.title }</h2>
									<p class="text-truncate">${post.content }</p>
								</div>

								<div class="card-footer primary-background text-center">
									<a
										href="<c:url value="/post">
										<c:param name="action" value="read" />
										<c:param name="categoryId" value="${post.id }" />
									</c:url>"
										class="btn btn-outline-light btn-small">Read More...</a> <a
										href="#" class="btn btn-outline-light btn-small"><span><i
											class="fa fa-thumbs-o-up"></i>10</span></a> <a href="#"
										class="btn btn-outline-light btn-small"><span><i
											class="fa fa-commenting-o"></i>20</span></a>

								</div>
							</div>
						</div>
					</c:forEach>
				</c:when>
				<c:otherwise>
					<h2>No posts to display</h2>
				</c:otherwise>

			</c:choose>
		</div>
	</div>
	</div>
	</div>
</body>
</html>