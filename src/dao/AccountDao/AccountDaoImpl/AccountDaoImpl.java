package dao.AccountDao.AccountDaoImpl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import Util.JDBCUtil;
import dao.AccountDao.AccountDao;
import model.Account;



public class AccountDaoImpl implements AccountDao{

	private final String queryAllAccountSql="select *from account order by ACC_ID";
	
	private final String queryAccountByNameSql="select *from account where ACC_NAME=?";
	private JDBCUtil jdbcUtil=null;

	/**
	 * 获取所用账户
	 */
	@Override
	public List<Account> queryAllAccount() throws Exception {
		jdbcUtil=new JDBCUtil();
		
		
		
		return null;
		
	}
		
		
	
	@Override
	public Map<String,String> queryAccountByName(String name) throws Exception {		
		jdbcUtil=new JDBCUtil();
		List<Object> params=new ArrayList<Object>();
		params.add("XYZY");	
		Map<String,Object> map=jdbcUtil.findSingleResult(queryAccountByNameSql, params);	
		Map<String,String> accountMap=new HashMap<>();
		System.out.println(map.get("ACC_NAME"));
		System.out.println(map.get("ACC_PASSWORD"));
		accountMap.put((String)map.get("ACC_NAME"),(String)map.get("ACC_PASSWORD"));	
		
		
		
		// TODO Auto-generated method stub   Aug 21, 2017
		return accountMap;
	}
	public static void main(String[] args) {
		AccountDaoImpl  a=new AccountDaoImpl();
		try {
			a.queryAccountByName("");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	

}
