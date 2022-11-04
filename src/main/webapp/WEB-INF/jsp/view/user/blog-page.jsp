<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Xee-Blog|${post.title }</title>

<style>
	.post-title{
		font-weight: 100px;
		font-size: 30px;
	}
	
	.post-content{
		font-weight: 100px;
		font-size: 25px;
	}
	
	.post-date{
		font-style: italic;
		font-weight: bold;
	}
	
	.post-user-info{
		font-size: 20px;
		font-weight: 100;
	}
</style>
</head>
<body>
	<div class="container">
		<div class="row my-6">
			<div class="col-md-8 offset-md-2">

				<div class="card">
					<div class="card-header primary-background text-white">
						<h4 class="post-title">${post.title }</h4>
						<img class="card-img-top my-2" alt="Blog image" src="images/blog.png">
					</div>

					<div class="card-body">
					
					<div class="row my-3">
						<div class="col-md-8">
							<p class="post-user-info"><a href="#">${post.user.username }</a></p>
						</div>
						<div class="col-md-4">
							<time class="post-date">${post.date }</time>
						</div>
					</div>
						<p class="post-content">${post.content }</p>
						<br>
						<div>
						<pre class="post-code">
							${post.code }
						</pre>
						</div>
					</div>

					<div class="card-footer primary-background">
						<a href="#" class="btn btn-outline-light btn-small"><span><i
								class="fa fa-thumbs-o-up"></i>10</span></a> <a href="#"
							class="btn btn-outline-light btn-small"><span><i
								class="fa fa-commenting-o"></i>20</span></a>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>