<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
    <meta http-equiv="pragma" content="no-cache">
    <meta http-equiv="cache-control" content="no-cache">
    <meta http-equiv="expires" content="0">    
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
    <meta http-equiv="description" content="This is my page">
    <!--
    <link rel="stylesheet" type="text/css" href="styles.css">
    -->
  </head>
  
  <body>
  <a href="./getDepart">diak</a>
    <table>
       <tr>
        <td>ID</td>
        <td>NAME</td>
        <td>AGE</td>
        <td>tel</td>
        <td>info</td>
       </tr>
       <c:forEach items="${users}" var="user">
       <tr>
       <td>${user.id}</td>
       <td>${user.name}</td>
       <td>${user.pwd}</td>
       <td>${user.tel}</td>
       <td>${user.info}</td>
       </tr>
       </c:forEach>
         <c:forEach items="${department}" var="department">
       <tr>
       <td>${department.cNumber}</td>
       <td>${department.dName}</td>
       <td>${department.dDec}</td>
       <td>dd</td>
       <td>dd</td>
       </tr>
       </c:forEach>
    </table>
  </body>
</html>