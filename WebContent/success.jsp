<%@page import="org.springframework.expression.spel.ast.FunctionReference"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<script type="text/javascript">
function test(){
	var sta= document.getElementById("s").value;
	alert(sta);
	if(sta =="success"){
		alert("上传成功");
	}else
		alert("上传失败");
	
}
</script>
</head>
<body>
  <c:if test="${PageInfo!=null}">
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
         </c:if>
</body>
</html>