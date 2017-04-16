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
<script src="js/jquery.js"></script>
<script src="js/pintuer.js"></script>
</head>
<body>
<div class="panel admin-panel">
  <div class="panel-head"><strong><span class="icon-pencil-square-o"></span> 添加科室信息</strong></div>
  <div class="body-content">
    <form method="post" class="form-x" action="addDepart">      
      <div class="form-group">
        <div class="label">
          <label>科室编号：</label>
        </div>
        <div class="field">
          <input type="text" name="cNumber" class="input" style="width: 25%; float: left; value="" />
          <div class="tipss"><font color="red">*必填项</font></div>
        </div>
      </div>
      <div class="form-group">
        <div class="label">
          <label>科室名字：</label>
        </div>
        <div class="field">
         <input type="text" class="input"  name="dName" style="width: 25%; float: left; value="" />
          <div class="tipss"><font color="red">*必填项</font></div>
        </div>
      </div>
      <div class="form-group">
        <div class="label">
          <label>科室描述内容：</label>
        </div>
        <div class="field">
         <textarea name="dDec"  style="width: 50%; float: left; class="input"></textarea>
          <div class="tips"></div>
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
</body></html>