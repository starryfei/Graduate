<%@page import="org.springframework.expression.spel.ast.FunctionReference"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
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
success
welcom:  ${name} and ${pwd }<br>${status}
<form method="post" action="doUpload" enctype="multipart/form-data">  
<input type="file" name="file"/>  
<input type="hidden" value="${status}" name="s" id="s" >
<button type="submit" onclick="test()">提交</button>
</body>
</html>