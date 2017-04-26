<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html lang="zh-cn">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
<meta name="renderer" content="webkit">
<title></title>
<link rel="stylesheet" href="css/pintuer.css">
<link rel="stylesheet" href="css/admin.css">
<link href="css/bootstrap.min.css" rel="stylesheet" media="screen">
 <link href="css/bootstrap-datetimepicker.min.css" rel="stylesheet" media="screen">
<script src="js/jquery.js"></script>
<script src="js/pintuer.js"></script>
</head>
<body>
<div class="panel admin-panel">
  <div class="panel-head"><strong><span class="icon-pencil-square-o"></span> 发布最新公告</strong></div>
  <div class="body-content">
    <form method="post" class="form-x" action="addNew">      
      <div class="form-group">
        <div class="label">
          <label>标题：</label>
        </div>
        <div class="field">
          <input type="text" name="title" class="input" style="width: 25%; float: left; value="" />
          <div class="tipss"><font color="red">*必填项</font></div>
        </div>
      </div>
      <div class="form-group">
        <div class="label">
          <label>公告内容：</label>
        </div>
        <div class="field">
          <textarea name="content"  style="width: 50%; float: left; class="input"></textarea>
          <div class="tipss"><font color="red">*必填项</font></div>
        </div>
      </div>
      <div class="form-group">
        <div class="label">
          <label>发布时间：</label>
        </div>
        <div class="field">
         <div class="input-group date form_datetime col-md-5" data-date="1979-09-16T05:25:07Z" data-date-format=" yyyy-mm-dd HH:ii" data-link-field="dtp_input1">
                    <input class="form-control" size="16" name="time" type="text" value="" readonly>
                    <span class="input-group-addon"><span class="icon-remove"></span></span>
					<span class="input-group-addon"><span class="glyphicon glyphicon-th" ></span></span>
                </div>
          <div class="tips"><input type="hidden" id="dtp_input1" value="" /><br/></div>
        </div>
      </div>
      <div class="form-group">
        <div class="label">
          <label></label>
        </div>
        <div class="field">
          <button class="button bg-main icon-check-square-o" type="submit"> 提交</button>
        </div>
      </div>
    </form>
  </div>
</div>
<script type="text/javascript" src="js/jquery.js" charset="UTF-8"></script>
<script type="text/javascript" src="js/bootstrap.min.js"></script>
<script type="text/javascript" src="js/bootstrap-datetimepicker.js" charset="UTF-8"></script>
<script type="text/javascript">
    $('.form_datetime').datetimepicker({
    	language: 'zh-CN',
        weekStart: 1,
        todayBtn:  1,
		autoclose: 1,
		todayHighlight: 1,
		startView: 2,
		forceParse: 0,
        showMeridian: 1
    });
    </script>
</body>
</html>