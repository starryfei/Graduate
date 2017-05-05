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
  <div class="panel-head"><strong><span class="icon-pencil-square-o"></span> 号源设置：</strong></div>
  <div class="body-content">
    <form method="post" class="form-x" action="addSch">    
      
      <c:forEach items="${department}" var="department">
      <input type="hidden" name="dNumber"  class="input" style="width: 25%; float: left" value="${department.dNumber}" />  
          <input type="hidden" class="input"  name="cNumber" style="width: 25%; float: left" value="${ department.cNumber}" />
        </c:forEach>
      <%-- <div class="form-group">
        <div class="label">
          <label>医生工号 </label>
        </div>
        <div class="field">
          <input type="hidden" name="dNumber"  class="input" style="width: 25%; float: left" value="<%=request.getParameter("doctorname") %>" />
          <div class="tipss"><font color="red">*必填项</font></div>
        </div>
      </div> --%>
      <!-- <div class="form-group">
        <div class="label">
          <label>所属科室</label>
        </div>
        <div class="field">
        
       
          <div class="tipss"><font color="red">*必填项</font></div>
        </div>
      </div> -->
      <div class="form-group">
        <div class="label">
          <label>挂号数量</label>
        </div>
        <div class="field">
      <input type="text" class="input"  name="total" style="width: 25%; float: left; value="" />
           <div class="tipss"><font color="red">*必填项</font></div>
        </div>
      </div>
       <div class="form-group">
        <div class="label">
          <label>挂号时间</label>
        </div>
        <div class="field">
         <div class='input-group date date form_datetime col-md-3' id='datetimepicker9'>
                <input type='text' class="form-control" id="start" name="sTime" />
                <span class="input-group-addon">
                    <span class="glyphicon glyphicon-calendar">
                    </span>
                </span>
            </div>
             
          <div class="tips"><font color="red">*起始时间</font></div>
           <div class='input-group date date form_datetime col-md-3' id='datetimepicker8'>
                <input type='text' class="form-control" id="end" name="eTime"/>
                <span class="input-group-addon">
                    <span class="glyphicon glyphicon-calendar">
                    </span>
                </span>
            </div>
            <div class="tips"><font color="red">*结束时间</font></div></div>
      </div>
       <div class="form-group">
        <div class="label">
          <label>挂号价格</label>
        </div>
        <div class="field">
         <input type="text" class="input"  name="price" style="width: 25%; float: left; value="" />
          <div class="tipss"><font color="red">*必填项</font></div>
        </div>
      </div>
      <div class="form-group">
        <div class="label">
          <label></label>
        </div>
        <div class="field">
          <button class="button bg-main icon-check-square-o" type="submit" > 提交</button>
        </div>
      </div>
    </form>
  </div>
</div>

<script type="text/javascript" src="js/jquery.js" charset="UTF-8"></script>
<script type="text/javascript" src="js/bootstrap.min.js"></script>
<script type="text/javascript" src="js/bootstrap-datetimepicker.js" charset="UTF-8"></script>
 <script type="text/javascript">
 $(function () {
     $('#datetimepicker9').datetimepicker({
         viewMode: 'years'
     });
 });	
 $(function () {
     $('#datetimepicker8').datetimepicker({
         viewMode: 'years'
     });
 });	

        </script>
      <!--   <script type="text/javascript">
        function getTime(){
       	 var start = document.getElementById("start").value;
       	 var end = document.getElementById("end").value;
       	 var time =start +"-"+ end;
       	 
       	 alert("时间为;"+time);
       	 
        }
        </script> -->
   
</body>

</html>