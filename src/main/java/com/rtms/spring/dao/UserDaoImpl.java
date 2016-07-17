package com.rtms.spring.dao;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.rtms.entity.user.User;

@Repository("userDao")
@Transactional(propagation=Propagation.REQUIRED)
public class UserDaoImpl extends AbstractDao implements UserDao {

	public User getUserByLoginID(final String loginID) {
		final String queryString = "select u from User u where u.loginID=:loginID";
		Query query = getSession().createQuery(queryString);
		query.setString("loginID", loginID);
		return (User) query.uniqueResult();
	}
}
