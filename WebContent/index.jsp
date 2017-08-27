<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login</title>

<script type="text/javascript">

function check1(){
	if(document.ThisForm.name.value=="")
		{
		alert("请输入用户名");
		document.ThisForm.name.focus();
		return false;
		}
	if(document.ThisForm.password.value==""){
		alert("请输入密码");
		document.ThisForm.password.focus();
		return false;
	}
	return true;
}
</script>
</head>
<body>
<form action="login" method="post" name="ThisForm" onsubmit="return check1()">
用户名: <input type="text" name="username"><br>
密码: <input type="password" name="password"><br>
<input type="submit" name="submit"  value="登录" >&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="reset"  name="reset"   value="重置" ><br/>
</form>
<div>
${username}
</div>
</body>
</html>