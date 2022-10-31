<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Xee-Blog-User</title>
</head>
<body>
	<c:out value="${user.username }" />
	<br>
	<c:out value="${user.email }" />
	<br>
	<c:out value="${user.profile }" />

	<!-- Dispalying profile modal -->

	<!-- Modal -->
	<div class="modal fade" id="profile-modal" tabindex="-1" role="dialog"
		aria-labelledby="exampleModalLabel" aria-hidden="true">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header primary-background text-center text-white">
					<h5 class="modal-title" id="exampleModalLabel">Xee-Blog</h5>
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
				</div>
				<div class="modal-body">
					<div class="container text-center">
						<img alt="Profile picture" class="img-fluid"
							src="images/${user.profile }" />
						<h5 class="modal-title" id="exampleModalLabel">${user.username }</h5>

						<div id="profile-details">
							<table class="table">
								<tbody>
									<tr>
										<th scope="row">ID</th>
										<td><c:out value="${user.id }" /></td>
									</tr>
									<tr>
										<th scope="row">Email</th>
										<td><c:out value="${user.email }" /></td>
									</tr>
									<tr>
										<th scope="row">Gender</th>
										<td><c:out value="${user.gender }" /></td>
									</tr>
									<tr>
										<th scope="row">About</th>
										<td><c:out value="${user.about }" /></td>
									</tr>
									<tr>
										<th scope="row">Member since</th>
										<td><c:out value="${user.date }" /></td>
									</tr>
								</tbody>
							</table>
						</div>

						<!-- Profile edit -->

						<div id="profile-edit" style="display: none;">
							<h3 class="mt-2">Please edit carefully</h3>
							<form action="profile" method="POST"
								enctype="multipart/form-data">
								<table class="table">
									<tr>
										<td>ID</td>
										<td><c:out value="${user.id }" /></td>
									</tr>

									<tr>
										<td>Email</td>
										<td><input type="email" value="${user.email }"
											name="email" /></td>
									</tr>

									<tr>
										<td>Username</td>
										<td><input type="text" value="${user.username }"
											name="username"></td>
									</tr>

									<tr>
										<td>Password</td>
										<td><input type="password" value="${user.password }"
											name="password" /></td>
									</tr>

									<tr>
										<td>Gender</td>
										<td><c:out value="${user.gender }" /></td>
									</tr>

									<tr>
										<td>About</td>
										<td><textarea class="form-control" rows="5" name="about">
											<c:out value="${user.about }" />
										</textarea></td>
									</tr>
									<tr>
										<td>Profile picture</td>
										<td><input type="file" name="image" /></td>
									</tr>

								</table>

								<div class="container">
									<button type="submit" class="btn btn-outline-primary">Save</button>
								</div>
							</form>
						</div>

					</div>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-secondary"
						data-dismiss="modal">Close</button>
					<button id="edit-profile-btn" type="button" class="btn btn-primary">Edit</button>
				</div>
			</div>
		</div>
	</div>

	<!-- Post Modal -->

	<!-- Modal -->
	<div class="modal fade" id="add-post-modal" tabindex="-1" role="dialog"
		aria-labelledby="exampleModalLabel" aria-hidden="true">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<h5 class="modal-title" id="exampleModalLabel">Post Details</h5>
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
				</div>
				<div class="modal-body">
					<form action="">
					
						<div class="form-group">
							<select class="form-control">
							<option selected disabled >---Select category---</option>
							<c:forEach items="${categories }" var="category">
								<option>${category.name }</option>
							</c:forEach>
						</select>
						</div>
						<div class="form-group">
							<input type="text" placeholder="Title" class="form-control" />
						</div>
						
						<div class="form-group">
							<textarea class="form-control" style="height: 200px;" placeholder="Content"></textarea>
						</div>
						
						<div class="form-group">
							<textarea class="form-control" style="height: 200px;" placeholder="Code(if any)"></textarea>
						</div>
					</form>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-secondary"
						data-dismiss="modal">Close</button>
					<button type="button" class="btn btn-primary">Save changes</button>
				</div>
			</div>
		</div>
	</div>

	<script>
		$(document).ready(function() {
			let isEditVisible = false;
			$("#edit-profile-btn").click(function() {
				if (isEditVisible) {
					$("#profile-details").show();

					$("#profile-edit").hide();

					isEditVisible = false;

					$(this).text("Edit");
				} else {
					$("#profile-details").hide();

					$("#profile-edit").show();

					$(this).text("Back")
					isEditVisible = true;
				}
			})
		})
	</script>
</body>
</html>