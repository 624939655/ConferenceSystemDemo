package Util;


import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

public class JDBCUtil {
	//
	private static String driver;
	//数据库地址
	private static String url;
	//数据库用户名
	private static String root;
	//数据库密码
	private static String admin;
	
	private  Connection connection;
	private  PreparedStatement pstmt;
	private  ResultSet resultSet;
	/**
	 * 初始化连接数据库
	 */
	//newInstance().在静态块中实例化
	/*static{
		     try {
				Class.forName(driver).newInstance();
			    connection=DriverManager.getConnection(url,root,admin);
			} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}*/
	
	static{
		try{
			//通过当前类获取类的加载器
			ClassLoader classLoader=JDBCUtil.class.getClassLoader();
			//通过类加载器的方法获得一个输入流
			InputStream iStream=classLoader.getResourceAsStream("db.properties");
			//创建 properties对象
			Properties properties=new Properties();
			//加载
			properties.load(iStream);
			driver=properties.getProperty("driver");
			url=properties.getProperty("url");
			admin=properties.getProperty("admin");
			root=properties.getProperty("root");
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	
	public JDBCUtil(){
		try {
			Class.forName(driver);
			System.out.println("数据库连接成功!");
			connection=DriverManager.getConnection(url,root,admin);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/**
	 * 
	 *
	 *11:24:14 PM
	 *@method:  获取数据库的连接
	 *@return Connection
	 */
	public Connection getConnection(){
		return connection;
	}
	
	/*public  Connection getConnection(){
		
		try {
			connection=DriverManager.getConnection(url,root,admin);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return connection;
	}*/
	/**
	 * 释放数据库资源
	 *
	 *10:30:22 PM
	 *@method:  release void
	 */
	public void release(){
		if(resultSet!=null){
			try {
				resultSet.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(pstmt!=null){
			try {
				pstmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(connection!=null){
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	/**
	 * 增 删  改 查 
	 *
	 *11:38:39 PM
	 *@method:  updateByPreparedStatement
	 *@param sql
	 *@param params
	 *@return boolean
	 * @throws SQLException 
	 */
	public boolean updateByPreparedStatement(String sql,List<Object> params) throws SQLException{
		 
		boolean flag=false;
		 pstmt=connection.prepareStatement(sql);
		 int index=1;
		 
		 if(params!=null&&!params.isEmpty()){
			 for(int i=0;i<params.size();i++){
				 pstmt.setObject(index++,params.get(i));
			 }
		 }
		 flag=pstmt.execute();									
		return flag;		
	}	
	/**
	 * 查询信息,单条返回
	 *
	 *12:17:25 AM
	 *@method:  findSingleResult
	 *@param sql
	 *@param params
	 *@return
	 *@throws SQLException Map<String,Object>
	 */
	
	public  Map<String,Object> findSingleResult(String sql,List<Object> params) throws SQLException{
		
	    Map<String,Object>map=new HashMap<String, Object>();
	    
	    int index=1;
	    pstmt=connection.prepareStatement(sql);
		//判断 params是否为空
	    if(params!=null&&!params.isEmpty()){
	    	for(int i=0;i<params.size();i++){
	    		pstmt.setObject(index++,params.get(i));
	    	}
	    }
	    resultSet=pstmt.executeQuery();
	    //从元素数据中获取列信息
	    ResultSetMetaData metaData=resultSet.getMetaData();
	    //列数
	    int cols_len=metaData.getColumnCount();
	    while(resultSet.next()){
	    	for(int i=0;i<cols_len;i++){
	    		String cols_name=metaData.getColumnName(i+1);
	    		Object cols_value=resultSet.getObject(cols_name);//
	    		System.out.println("获取成功");
	    		if(cols_value==null){
	    			cols_name="";
	    		}
	    		map.put(cols_name,cols_value );
	    	}   	
	    	
	    }
		return map;
		
	}
	/**
	 * 查询多个数据记录
	 *
	 *9:30:01 AM
	 *@method:  findMoreResult
	 *@param sql
	 *@param params
	 *@return
	 *@throws SQLException List<Map<String,Object>>
	 */
	public  List<Map<String,Object>> findMoreResult(String sql,List<Object> params) throws SQLException{
		
		List<Map<String,Object>> list=new ArrayList<Map<String,Object>>();
		int index=1;
		pstmt=connection.prepareStatement(sql);
		if(params!=null&&!params.isEmpty()){
			for(int i=0;i<params.size();i++){
				pstmt.setObject(index++,params.get(i));
			}
		}
		resultSet=pstmt.executeQuery();
		ResultSetMetaData resultSetMetaData=resultSet.getMetaData();
		int cols_len=resultSetMetaData.getColumnCount();
		System.out.println(cols_len);
		while(resultSet.next()){
			Map<String,Object> map=new HashMap<String,Object>();
			for(int i=0;i<cols_len;i++){
				String cols_name=resultSetMetaData.getColumnName(i+1);
				Object cols_value=resultSet.getObject(cols_name);
				
	    		if(cols_value==null){
	    			cols_name="";
	    		}
	    		map.put(cols_name,cols_value);
			}
			list.add(map);
			
		}
		return list;		
   }
}
