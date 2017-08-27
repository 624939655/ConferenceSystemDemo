package dao.AccountLogDao.AccountLogDaoImpl;

import java.util.List;

import dao.AccountLogDao.AccountLogDao;
import model.AccountLog;

public class AccountLogDaoImpl implements AccountLogDao {
	private String queryAllAccountLogSql="select *from account_log  order by AL_ID";
	private String queryAllAccountByAL_IDSql="select *from account_log where AL_ID=?";
	private String deleteAccountByAL_IDSql="delete from employee where id=?";
	
	
	/**
	 * 查询所有Account
	 *
	 *10:53:47 AM
	 *@method:  queryAllAccount
	 *@return List<Account>
	 */
	@Override
	public List<AccountLog> queryAllAccountLog() throws Exception {
		// TODO Auto-generated method stub   Aug 17, 2017
		
		return null;
	}
	/**
	 * 通过AL_ID查询账户日志
	 *
	 *10:48:59 PM
	 *@method:  queryAllAccountByCondition
	 *@param aLog
	 *@return
	 *@throws Exception List<AccountLog>
	 */
	@Override
	public List<AccountLog> queryAllAccountByAL_ID(AccountLog aLog) throws Exception {
		// TODO Auto-generated method stub   Aug 17, 2017
		return null;
	}
	/**
	 * 通过AL_ID删除账户日志
	 *
	 *11:03:19 PM
	 *@method:  deleteAccountByAL_ID
	 *@param aLog
	 *@return
	 *@throws Exception boolean
	 */
	@Override
	public boolean deleteAccountByAL_ID(AccountLog aLog) throws Exception {
		// TODO Auto-generated method stub   Aug 17, 2017
		return false;
	}

}
