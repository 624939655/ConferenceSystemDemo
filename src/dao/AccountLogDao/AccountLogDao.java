package dao.AccountLogDao;

import java.util.List;

import model.AccountLog;

public interface AccountLogDao {
	
	/**
	 * 查询所有用户日志
	 *
	 *10:47:32 PM
	 *@method:  queryAllAccountLog
	 *@return
	 *@throws Exception List<AccountLog>
	 */
	public List<AccountLog> queryAllAccountLog()throws Exception;
	
	/**
	 * 通过AL_ID查询账户日志
	 *
	 *10:48:59 PM
	 *@method:  queryAllAccountByCondition
	 *@param aLog
	 *@return
	 *@throws Exception List<AccountLog>
	 */
	public List<AccountLog> queryAllAccountByAL_ID(AccountLog aLog)throws Exception;
	/**
	 * 通过AL_ID删除账户日志
	 *
	 *11:03:19 PM
	 *@method:  deleteAccountByAL_ID
	 *@param aLog
	 *@return
	 *@throws Exception boolean
	 */
	public boolean deleteAccountByAL_ID(AccountLog aLog)throws Exception; 
	
	
	

}
