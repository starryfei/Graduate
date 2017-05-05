<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String context = request.getContextPath();
%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>首页</title>

    <!-- Bootstrap core CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="css/blog.css" rel="stylesheet">

    <!-- Just for debugging purposes. Don't actually copy these 2 lines! -->
    <!--[if lt IE 9]><script src="../../assets/js/ie8-responsive-file-warning.js"></script><![endif]-->
    <script src="js/ie-emulation-modes-warning.js"></script>

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
  </head>

  <body>

    <div class="container">

      <div class="blog-header">
        <h4 class="blog-post-title sidebar-module sidebar-module-inset">预约挂号后台管理中心</h4>
      </div>

      <div class="row">
	
        <div class="col-sm-8 blog-main">
		<c:forEach items="${PageInfo.list}" var="allNew">
          <div class="blog-post">
            <h3 >${allNew.title }</h3>
            <p>&nbsp;&nbsp;${allNew.content }</p>
            <p align="right">&nbsp;---${allNew.time} by <a href="#">admininstor</a></p>
            <hr>
</div>
</c:forEach>
          <nav>
           <%-- <c:forEach items="${PageInfo.navigatepageNums}" var="nav"> --%>
            <ul class="pager">
            
              <li><a href="./getAllNew?pageNum=${PageInfo.prePage}&pageSize=${PageInfo.pageSize}">上一页</a></li>
              <li><a href="./getAllNew?pageNum=${PageInfo.lastPage}&pageSize=${PageInfo.pageSize}">下一页</a></li>
         
            </ul>
          </nav>

        </div><!-- /.blog-main -->

        <div class="col-sm-3 col-sm-offset-1 blog-sidebar">
          <div class="sidebar-module sidebar-module-inset">
            <h4>最新公告</h4>
            <p>暂无最新公告</p>
          </div>

      </div>

    </div><!-- /.container -->

    <div class="blog-footer">
      <p>预约挂号系统  by <a href="https://starryfei.github.io">秦亚飞</a>.</p>
      <p>
        <a href="#">回到顶部</a>
      </p>
    </div>


    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="js/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/docs.min.js"></script>
    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <script src="js/ie10-viewport-bug-workaround.js"></script>
  </body>
</html>