package controllor;

import java.util.List;

import model.AccountLog;
import service.IAccountLog;

public class AccountControllor {
	private IAccountLog iAccountLog;
	private List<AccountLog> accountLogs;
	
	public void getAccountLogs() throws Exception{
		accountLogs=iAccountLog.getAllAccountLogs();
	}

}
