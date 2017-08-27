package qq;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/login")
public class Login extends HttpServlet{
	public void service(HttpServletRequest request,HttpServletResponse response)throws ServletException, IOException{		
		response.setCharacterEncoding("utf-8");
		//获取用户名
		String username=request.getParameter("username");
		//获取密码
		String password=request.getParameter("password");
		System.out.println(username);
		System.out.println(password);
		request.setAttribute("username",username);
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}

}
