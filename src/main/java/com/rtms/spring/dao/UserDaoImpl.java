package com.rtms.spring.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.rtms.entity.user.User;

@Repository("userDao")
public class UserDaoImpl extends AbstractDao<Integer, User,User> implements UserDao {

	public User findById(long userID) {
		return (User) getObjectByID(User.class,userID);
	}

	public User findByID(long userID) {
		return (User) getObjectByID(User.class,userID);
	}

	public void saveUser(User employee) {
		persist(employee);
	}

	public void deleteUserByLoginID(final String loginID) {
		Query query = getSession().createSQLQuery("delete from User u where u.loginID = :loginID");
		query.setString("loginID", loginID);
		query.executeUpdate();
	}

	@SuppressWarnings("unchecked")
	public List<User> findAllUsers() {
		Criteria criteria = createEntityCriteria();
		return (List<User>) criteria.list();
	}

	public User findUserByLoginID(final String loginID) {
		Criteria criteria = createEntityCriteria();
		criteria.add(Restrictions.eq("ssn", loginID));
		return (User) criteria.uniqueResult();
	}

	public User getUserByLoginID(final String loginID) {
		final String queryString = "select u from User u where u.loginID=:loginID";
		Query query = getSession().createQuery(queryString);
		query.setString("loginID", loginID);
		return (User) query.uniqueResult();
	}
}
