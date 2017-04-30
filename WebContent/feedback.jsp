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
  <div class="panel-head"><strong class="icon-reorder"> 反馈管理</strong></div>
        <ul class="search">
        <li>
          <button type="button"  class="button border-green" id="checkall"><span class="icon-check"></span> 全选</button>
          <button type="submit" class="button border-red" id="count"><span class="icon-all"></span> 批量统计</button>
        </li>
      </ul>
  </div>
  <table class="table table-hover text-center">
    <tr>
      <th width="5%">序号</th>
      <th width="10%">姓名</th>
      <th width="15%">反馈时间</th>
      <th width="50%">反馈内容</th>
      
    </tr>
     <c:forEach items="${PageInfo.list}" var="Feedback">
     <form>
     </form>
    <tr>
       <td><input type="checkbox" name="id[]" value="1" />${Feedback.id}</td>
       <td>${Feedback.fname}</td>
       <td>${Feedback.ftime}</td>
       <td>${Feedback.message}</td>
       </tr>
   
     </c:forEach>
     <tr>
        <td colspan="8"><div class="pagelist"> <a href="./getFeedBack?pageNum=${PageInfo.prePage}&pageSize=${PageInfo.pageSize}">上一页</a> 
         <c:forEach items="${PageInfo.navigatepageNums}" var="nav">
                        <c:if test="${nav == PageInfo.pageNum}">
                          <span class="current">${nav}</span>
                        </c:if>
                        <c:if test="${nav != PageInfo.pageNum}">
                            <a href="./getFeedBack?pageNum=${nav}&pageSize=${PageInfo.pageSize}">${nav}</a>
                        </c:if>
                    </c:forEach>
                    <c:if test="${PageInfo.hasNextPage}">
        <a href="./getFeedBack?pageNum=${PageInfo.lastPage}&pageSize=${PageInfo.pageSize}">下一页</a>
        </c:if>
      </tr>
  </table>
</div>
<script type="text/javascript">

$("#checkall").click(function(){ 
  $("input[name='id[]']").each(function(){
	  if (this.checked) {
		  this.checked = false;
	  }
	  else {
		  this.checked = true;
	  }
  });
})

function DelSelect(){
	var Checkbox=false;
	 $("input[name='id[]']").each(function(){
	  if (this.checked==true) {		
		Checkbox=true;	
	  }
	});
	
}

</script>
</body></html>