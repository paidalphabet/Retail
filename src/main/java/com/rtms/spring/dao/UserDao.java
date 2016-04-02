package com.rtms.spring.dao;

import com.rtms.entity.user.User;


public interface UserDao extends BaseDao {

	public User getUserByLoginID(final String loginID);
}
