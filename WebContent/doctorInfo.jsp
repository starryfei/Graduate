<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String context = request.getContextPath();
%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="zh-cn">

<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
<meta name="renderer" content="webkit">
<title>添加医生</title>
<link rel="stylesheet" href="css/pintuer.css">
<link rel="stylesheet" href="css/admin.css">
<script src="js/jquery.js"></script>
<script src="js/pintuer.js"></script>
<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/ie10-viewport-bug-workaround.css" rel="stylesheet">
<script src="js/jquery.min.js"></script>
<script src="js/transition.js"></script>
<script src="js/collapse.js"></script>
<script src="js/ie-emulation-modes-warning.js"></script>
<script type="text/javascript" src="js/dropdown.js"></script>
</head>
    
<body>
	<div class="panel admin-panel">
		<div class="panel-head">
			<strong><span class="icon-pencil-square-o"></span> 修改医生信息</strong>
		</div>
		<c:forEach items="${doctor}" var="doctor">
		<div class="body-content">
		
		
			<form method="post" class="form-x" action="updateDoctor" >
				<div class="form-group">
					<div class="label">
						<label>医生工号</label>
					</div>
					<div class="field">
						<input type="text" name="dNumber" readonly="readonly" value="${doctor.dNumber }" style= "width: 25%; float: left;" class="input"/>
						<div class="tipss"><font color="red">*必填项</font></div>
					</div>
				</div>
				<div class="form-group">
					<div class="label">
						<label>医生姓名：</label>
					</div>
					<div class="field">
						<input type="text" name="name" value="${doctor.name }"  style="width: 25%; float: left;" class="input" />
							<div class="tipss"><font color="red">*必填项</font></div>
					</div>
					
				</div>
				<div class="form-group">
					<div class="label">
						<label>所属科室编号：</label>
					</div>
					<div class="field">
					
						<%-- <select name="cNumber"  class="input w50">
								<c:forEach items="${department}" var="department">
								<option value="${department.cNumber }">${department.dName}</option>
							</c:forEach>
						</select>  --%>
						<input type="text" class="input" name="cNumber" value="${doctor.cNumber}"  style="width: 25%; float: left" type="text"  />
						<div class="tipss"><font color="red">*必填项</font></div>
					</div>
					</div>
					<div class="form-group">
						<div class="label">
							<label>医生描述：</label>
						</div>
						<div class="field">
							<textarea class="input" name="dInfo" value="" style="width: 50%; float: left" >${doctor.dInfo }</textarea>
							<div class="tips"></div>
						</div>
					</div>
					<div class="form-group">
						<div class="label">
							<label>职称：</label>
						</div>
						<div class="field">
							<input type="text" class="input" name="dResume" value="${doctor.dResume}"  style="width: 25%; float: left" type="text"  />
							<div class="tipss"><font color="red">*必填项</font></div>
						</div>
					</div>
					<div class="form-group">
						<div class="label">
							<label>联系方式：</label>
						</div>
						<div class="field">
						<!-- 	<input type="text" name="dTel"   class="input" style="width: 25%; float: left; value="${doctot.dTel}"/> -->
									<input type="text" class="input" name="dTel" value="${doctor.dTel}"  style="width: 25%; float: left;" class="input"  />
							<div class="tipss"><font color="red">*必填项</font></div>
						</div>
					</div>
					<div class="form-group">
						<div class="label">
							<label>email：</label>
						</div>
						<div class="field">
							<input type="text" class="input" name="dEmail"  style="width: 25%; float: left"" value="${doctor.dEmail }" />
							<div class="tipss"><font color="red">*必填项</font></div>
						</div>
					</div>
					<div class="field" align="center">
						<button class="button bg-main icon-check-square-o" type="submit">
							提交</button>
					</div>
				</div>
				</c:forEach>
			</form>
		</div>
	
</body>
</html>