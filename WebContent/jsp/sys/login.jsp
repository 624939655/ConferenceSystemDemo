<%@page import="java.util.Collection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@ %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<center>
    <%
    String username=request.getParameter("username");
    String password=request.getParameter("password");
    if("".equals(username)&&"".equals(password)){
    	session.setAttribute("","");
    	//insert logon log 插入登陆的日志
    	session.invalidate();
    	//最后登录的时间
    	session.getLastAccessedTime();
    	System.out.print(session.getLastAccessedTime());
    	//登出的时间。来计算在系统中的时间
    	
    	
         //统计一共有多少实体
    	//application.setAttribute(arg0, arg1);
    	//设置初始化参数
    	//application.setInitParameter(arg0, arg1)
    	
    	request.getRequestDispatcher("").forward(request, response);
    }else{
    	response.sendRedirect("");
    	response.getStatus();
    	//Collection []collections=response.getHeaderNames();
    
    }
    
    //注销  将获取的到的额session对象销毁
    session.invalidate();
    %>
</center>

</body>
</html>