package ss;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Util.md5Util;
import dao.AccountDao.AccountDao;
import dao.AccountDao.AccountDaoImpl.AccountDaoImpl;
import model.Account;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/Login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	//private List<Account>accounts;
	//private AccountDao accountDao;
	//public  Map<String,String>map;
	/*public LoginServlet() throws Exception{
		this.accountDao=new AccountDaoImpl();
		map=accountDao.queryAccountByName("XYZY");
	}*/
     
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setCharacterEncoding("utf-8");
		//获取用户名
		String username=request.getParameter("username");
		//获取密码
		String password=request.getParameter("password");
		
		
		request.setAttribute("username",username);
		request.getRequestDispatcher("index.jsp").forward(request, response);
		/*try {
			//map=accountDao.queryAccountByName(username);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    //遍历数据库中的所有账户
		System.out.println(map.get("ACC_NAME"));
		System.out.println(map.get("ACC_PASSWORD"));
		
	    if (username.equals(map.get("ACC_NAME"))&&(md5Util.MD5(password).equals(map.get("ACC_PASSWORD")))) {
	    	
	    	request.getSession().setAttribute("username", username);
				 	
			response.sendRedirect("welcome.jsp");
			
	    }*/
			
		
		
	}
	
	

}
