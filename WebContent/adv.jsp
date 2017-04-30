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
<!--   <div class="padding border-bottom">  
  <a href="page.html"><button type="button" class="button border-yellow"><span class="icon-plus-square-o"></span> 添加内容</button></a>
 <ul class="search" style="padding-left:10px;">
  <select name="s_istop" id="s_istop" class="input"  style="width:100px; line-height:17px;display:inline-block">
            <option value="1">科室编号</option>
            <option value="2">科室名字</option>
          </select>
        <li>
          <input type="text" placeholder="请输入搜索关键字" name="keywords" id="keywords" class="input" style="width:250px; line-height:17px;display:inline-block" />
          <a href="javascript:void(0)" class="button border-main icon-search" onclick="changesearch()" > 搜索</a></li>
      </ul>
  </div> -->
   <div class="padding border-bottom">
    <!-- <button type="button" class="button border-yellow" onclick="window.location.href='#add'"><span class="icon-plus-square-o"></span> 添加分类</button> -->
   <select name="s_istop" id="s_istop"  class="input" style="width:100px; line-height:17px;display:inline-block">
            <option value="1">科室编号</option>
            <option value="2">科室名字</option>
          </select>
          <input type="text" placeholder="请输入搜索关键字" name="keywords" id="keywords" class="input" style="width:250px; line-height:17px;display:inline-block" />
          <a href="javascript:void(0)" class="button border-main icon-search" onclick="changesearch()" > 搜索</a>
      </ul>
  </div>
  <table class="table table-hover text-center">
    <tr>
      <th width="10%">科室编号</th>
      <th width="15%">名称</th>
      <th width="20%">描述</th>
      <th width="15%">操作</th>
    </tr>
     <c:forEach items="${PageInfo.list}" var="department">
    <tr>
    
       <td>${department.cNumber}</td>
       <td>${department.dName}</td>
       <td>${department.dDec}</td>
      
      <td><div class="button-group">
      <a class="button border-main" href="javascript:void(0)" onclick="update(${department.cNumber})"><span class="icon-edit"></span> 修改</a>
      <a class="button border-red" href="javascript:void(0)" onclick="del(${department.cNumber})"><span class="icon-trash-o"></span> 删除</a>
      </div></td>
    </tr>
     </c:forEach>
         <tr>
        <td colspan="8"><div class="pagelist"> <a href="./getDepart?pageNum=${PageInfo.prePage}&pageSize=${PageInfo.pageSize}">上一页</a> 
         <c:forEach items="${PageInfo.navigatepageNums}" var="nav">
                        <c:if test="${nav == PageInfo.pageNum}">
                          <span class="current">${nav}</span>
                        </c:if>
                        <c:if test="${nav != PageInfo.pageNum}">
                            <a href="./getDepart?pageNum=${nav}&pageSize=${PageInfo.pageSize}">${nav}</a>
                        </c:if>
                    </c:forEach>
                    <c:if test="${PageInfo.hasNextPage}">
        <a href="./getDepart?pageNum=${PageInfo.lastPage}&pageSize=${PageInfo.pageSize}">下一页</a>
        </c:if>
      </tr>
  </table>
</div>
<script type="text/javascript">
function del(id){
	if(confirm("您确定要删除吗?")){
		if(id != ""){ 
	    	window.location.href = "delByid?cNumber="+id+"";
	    	 } 
	}
}
function update(id){
	if(id!="")
		window.location.href = "updateByid?cNumber="+id+"";
}
function changesearch(){
	var chose = document.getElementById("s_istop").value;
	var info = document.getElementById("keywords").value;
	/* alert(chose+"  "+info) */
	window.location.href = "find?info="+info+"&chose="+chose+"&pageNum="+${PageInfo.pageNum}+"&pageSize="+${PageInfo.pageSize};
	
}
</script>

</body></html>