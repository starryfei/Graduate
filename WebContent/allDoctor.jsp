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
  <div class="panel-head"><strong class="icon-reorder"> 医生信息</strong></div>
   <select name="s_istop" id="s_istop"  class="input" style="width:100px; line-height:17px;display:inline-block">
            <option value="3">科室</option>
            <option value="2">医生姓名</option>
            <option value="1">医生编号</option>
          </select>
          <input type="text" placeholder="请输入搜索关键字" name="keywords" id="keywords" class="input" style="width:250px; line-height:17px;display:inline-block" />
          <a href="javascript:void(0)" class="button border-main icon-search" onclick="changesearch()" > 搜索</a>
      </ul>
  </div>
  <table class="table table-hover text-center">
    <tr>
      <th width="10%">医生工号</th>
      <th width="10%">医生名字</th>
      <th width="10%">所属科室</th>
      <th width="10%">联系方式</th>
      <th width="25%">医生信息</th>
      <th width="15%">邮箱</th>
    </tr>
 
     <c:forEach items="${PageInfo.list}" var="alldoctor">
    <tr>
       <td>${alldoctor.dNumber}</td>
       <td>${alldoctor.cName}</td>
       <td>${alldoctor.dName}</td>
       <td>${alldoctor.dTel}</td>
       <td>${alldoctor.dInfo}</td>
       <td>${alldoctor.dEmail}</td>
      <td><div class="button-group">
      <a class="button border-main" href="javascript:void(0)" onclick="update(${alldoctor.dNumber})"><span class="icon-edit"></span> 修改</a>
      <a class="button border-red" href="javascript:void(0)" onclick="del(${alldoctor.dNumber})"><span class="icon-trash-o"></span> 删除</a>
      </div></td>
    </tr>
     </c:forEach> 
     <tr>
        <td colspan="8"><div class="pagelist"> <a href="./getAllDoctor?pageNum=${PageInfo.prePage}&pageSize=${PageInfo.pageSize}">上一页</a> 
         <c:forEach items="${PageInfo.navigatepageNums}" var="nav">
                        <c:if test="${nav == PageInfo.pageNum}">
                          <span class="current">${nav}</span>
                        </c:if>
                        <c:if test="${nav != PageInfo.pageNum}">
                            <a href="./getAllDoctor?pageNum=${nav}&pageSize=${PageInfo.pageSize}">${nav}</a>
                        </c:if>
                    </c:forEach>
                    <c:if test="${PageInfo.hasNextPage}">
        <a href="./getAllDoctor?pageNum=${PageInfo.lastPage}&pageSize=${PageInfo.pageSize}">下一页</a>
        </c:if>
      </tr>
  </table>
  <%--  <table class="gridtable" style="width:100%;text-align: center;">
                <tr>
                    <c:if test="${PageInfo.hasPreviousPage}">
                        <td><a href="./getAllDoctor?pageNum=${PageInfo.prePage}&pageSize=${PageInfo.pageSize}">前一页</a></td>
                    </c:if>
                    <c:forEach items="${PageInfo.navigatepageNums}" var="nav">
                        <c:if test="${nav == PageInfo.pageNum}">
                            <td style="font-weight: bold;">${nav}</td>
                        </c:if>
                        <c:if test="${nav != PageInfo.pageNum}">
                            <td><a href="./getAllDoctor?pageNum=${nav}&pageSize=${PageInfo.pageSize}">${nav}</a></td>
                        </c:if>
                    </c:forEach>
                    <c:if test="${PageInfo.hasNextPage}">
                        <td><a href="./getAllDoctor?pageNum=${PageInfo.nextPage}&pageSize=${PageInfo.pageSize}">下一页</a></td>
                    </c:if>
                </tr>
            </table>
             --%>
          <%--   <c:if test="${PageInfo!=null}">
            <table class="gridtable" style="width:100%;">
                <tr>
                    <th colspan="2">分页信息</th>
                </tr>
                <tr>
                    <th style="width: 300px;">当前页号</th>
                    <td>${PageInfo.pageNum}</td>
                </tr>
                <tr>
                    <th>页面大小</th>
                    <td>${PageInfo.pageSize}</td>
                </tr>
                <tr>
                    <th>起始行号(>=)</th>
                    <td>${PageInfo.startRow}</td>
                </tr>
                <tr>
                    <th>终止行号(<=)</th>
                    <td>${PageInfo.endRow}</td>
                </tr>
                <tr>
                    <th>总结果数</th>
                    <td>${PageInfo.total}</td>
                </tr>
                <tr>
                    <th>总页数</th>
                    <td>${PageInfo.pages}</td>
                </tr>
                <tr>
                    <th>第一页</th>
                    <td>${PageInfo.firstPage}</td>
                </tr>
                <tr>
                    <th>前一页</th>
                    <td>${PageInfo.prePage}</td>
                </tr>
                <tr>
                    <th>下一页</th>
                    <td>${PageInfo.nextPage}</td>
                </tr>
                <tr>
                    <th>最后一页</th>
                    <td>${PageInfo.lastPage}</td>
                </tr>
                <tr>
                    <th>是否为第一页</th>
                    <td>${PageInfo.isFirstPage}</td>
                </tr>
                <tr>
                    <th>是否为最后一页</th>
                    <td>${PageInfo.isLastPage}</td>
                </tr>
                <tr>
                    <th>是否有前一页</th>
                    <td>${PageInfo.hasPreviousPage}</td>
                </tr>
                <tr>
                    <th>是否有下一页</th>
                    <td>${PageInfo.hasNextPage}</td>
                </tr>
            </table>
         </c:if> --%>
</div>
<script type="text/javascript">
function del(id){
	if(confirm("您确定要删除吗?")){
		if(id != ""){ 
	    	window.location.href = "Ddelete?dNumber="+id+"";
	    	 } 
	}
}
function update(id){
	if(id!="")
		window.location.href = "getById?dNumber="+id+"";
}
function changesearch(){
	var chose = document.getElementById("s_istop").value;
	var info = document.getElementById("keywords").value;
	/* alert(chose+"  "+info) */
	window.location.href = "findDoctor?info="+info+"&chose="+chose+"&pageNum="+${PageInfo.pageNum}+"&pageSize="+${PageInfo.pageSize};
	
}
</script>

</body></html>