<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>upload</title>
</head>
<body>
<form method="post" action="upload" enctype="multipart/form-data">
<input type="file" name="file1" /><br/>
<input type="submit" value="上传"/>
</form>
<div id="info">
${messsage}
</div>
</body>
</html>