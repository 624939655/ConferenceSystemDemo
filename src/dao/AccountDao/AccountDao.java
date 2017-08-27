package dao.AccountDao;

import java.util.List;
import java.util.Map;

import model.Account;

public interface AccountDao {
	public List<Account> queryAllAccount()throws Exception;
	
	public Map<String,String> queryAccountByName(String name)throws Exception; 

}
