<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% String context = request.getContextPath(); %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://"
            + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
%>
<head <base href="<%=basePath%>"></base>>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>enjoy</title>


<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/bootstrap.min.css">
<link rel="stylesheet" href="css/MyOwn.css">
<script type="text/javascript">
function login(){
	var name = document.getElementById("name").value;
	var pwd = document.getElementById("pwd").value;
	if(name==""||pwd==""){
		alert("请输入用户名和密码");
	}
}

</script>
</head>
<body>

		<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
		<div class="navbar-header"></div>

	</nav>
	<div class="login-page  center-block">
		<div class="center-container">
			<h2 class="color text-center">登录系统</h2>
			<form class="form-horizontal center-block" role="form"
				action="login.action">
				<div class="form-group ">
					<label class="col-sm-2 control-label">用户名</label>
					<div class="col-sm-8">
						<input type="text" class="form-control col-lg-sm" id="name"
							name="username" placeholder="用户名">
					</div>
				</div>
				<div class="form-group">
					<label for="inputPassword3" class="col-sm-2 control-label">密码</label>
					<div class="col-sm-8">
						<input type="password" class="form-control" id="inputPassword3"
							name="pwd" placeholder="密码">
					</div>
				</div>
				<div class="form-group">
					<div class="col-sm-offset-2 col-sm-10">
						<div class="checkbox col-sm-5">
							<label> <input type="checkbox"> 记住密码
							</label>
						</div>
						<a class=" col-sm-4 control-label" href="register.html">新用户注册</a>
					</div>
				</div>
				<div class="form-group ">
					<div class="col-sm-8 col-sm-offset-2">
						<button type="submit" class="btn btn-primary btn-block" id="btn">登录</button>
					</div>
				</div>
			</form>
		</div>
	</div>
</body>
</html>