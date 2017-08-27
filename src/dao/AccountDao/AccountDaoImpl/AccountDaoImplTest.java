package dao.AccountDao.AccountDaoImpl;

import static org.junit.Assert.*;

import java.util.Map;

import org.junit.Test;

public class AccountDaoImplTest {

	@Test
	public void testQueryAccountByName() throws Exception {
		AccountDaoImpl accountDaoImpl=new AccountDaoImpl();
		Map<String,String>map=accountDaoImpl.queryAccountByName("XYZY");
		
		
		System.out.println("123");
	}

}
