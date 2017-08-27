package service;

import java.util.List;

import model.AccountLog;

public interface IAccountLog {
	public List<AccountLog>  getAllAccountLogs()throws Exception;

}
