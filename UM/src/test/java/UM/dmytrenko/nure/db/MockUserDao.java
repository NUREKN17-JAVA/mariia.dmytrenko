package UM.dmytrenko.nure.db;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import UM.dmytrenko.nure.User;
import UM.dmytrenko.nure.db.ConnectionFactory;
import UM.dmytrenko.nure.db.DatabaseException;
import UM.dmytrenko.nure.db.UserDao;

public class MockUserDao implements UserDao {
	
	private long id = 0;
	private Map users = new HashMap();
	
	@Override
	public User create(User user) throws DatabaseException {
		Long currentId = new Long(++id);
		user.setId(currentId);
		users.put(currentId, user);
		return null;
	}

	@Override
	public void update(User user) throws DatabaseException {
		Long currentId = user.getId();
		users.remove(currentId);
		users.put(currentId, user);
		
	}

	@Override
	public void delete(User user) throws DatabaseException {
		Long currentId = user.getId();
		users.remove(currentId);
	}

	@Override
	public User find(Long id) throws DatabaseException {
		
		return (User) users.get(id);
	}

	@Override
	public Collection findAll() throws DatabaseException {
		
		return users.values();
	}

	@Override
	public void setConnectionFactory(ConnectionFactory connectionFactory) {
		// TODO Auto-generated method stub

	}

}
