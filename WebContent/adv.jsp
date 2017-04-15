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
  <div class="panel-head"><strong class="icon-reorder"> 科室信息</strong></div>
  <div class="padding border-bottom">  
  <a href="page.html"><button type="button" class="button border-yellow"><span class="icon-plus-square-o"></span> 添加内容</button></a>
  </div>
  <table class="table table-hover text-center">
    <tr>
      <th width="10%">科室编号</th>
      <th width="15%">名称</th>
      <th width="20%">描述</th>
      <!-- <th width="10%">排序</th> -->
      <th width="15%">操作</th>
    </tr>
     <c:forEach items="${department}" var="department">
    <tr>
    
       <td>${department.cNumber}</td>
       <td>${department.dName}</td>
       <td>${department.dDec}</td>
      
      <td><div class="button-group">
      <a class="button border-main" href="#add"><span class="icon-edit"></span> 修改</a>
      <a class="button border-red" href="javascript:void(0)" onclick="return del(1,1)"><span class="icon-trash-o"></span> 删除</a>
      </div></td>
    </tr>
     </c:forEach>
  </table>
</div>
<script type="text/javascript">
function del(id,mid){
	if(confirm("您确定要删除吗?")){
	
	}
}
</script>

</body></html>