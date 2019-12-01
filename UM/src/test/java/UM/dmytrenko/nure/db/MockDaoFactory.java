package UM.dmytrenko.nure.db;

import com.mockobjects.dynamic.Mock;

import UM.dmytrenko.nure.db.DaoFactory;
import UM.dmytrenko.nure.db.UserDao;

public class MockDaoFactory extends DaoFactory {
	
	private Mock mockUserDao;
	
	public MockDaoFactory () {
		
		mockUserDao = new Mock(UserDao.class);
	}
	
	public Mock getMockUserDao() {
		return mockUserDao;
	}
	
	public UserDao getUserDao() {
		
		return (UserDao) mockUserDao.proxy();
	}

}
