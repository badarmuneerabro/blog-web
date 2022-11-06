<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Xee-Blog-User</title>
</head>
<body>

	<main>
		<div class="container">
			<div class="row mt-3">
				<!-- first col -->
				<div class="col-md-3">
					<div class="list-group">
						<a onclick="activate(this)"
							href="<c:url value="/post">
							<c:param name="categoryId" value="0" />
						</c:url>"
							class="c-link list-group-item list-group-item-action active">All
							posts</a>
						<c:forEach items="${categories }" var="category">
							<a onclick="activate(this)"
								href="<c:url value="/post">
								<c:param name="categoryId" value="${category.id }" />
							</c:url>"
								class="c-link list-group-item list-group-item-action">
								${category.name }</a>
						</c:forEach>
					</div>

				</div>

				<!-- Second col -->
				<div class="col-md-9">
					<div class="row">
						<c:choose>
							<c:when test="${not empty posts }">
								<c:forEach items="${posts }" var="post">
									<div class="col-md-6 mt-2">
										<div class="card">
											<img class="card-img-top" src="images/blog.png"
												alt="Blog image">
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
	</main>

	<!-- Dispalying profile modal -->

	<!-- Modal -->






</body>
</html>