/**
 * 
 */
package com.su.timetask.mapper;

import org.springframework.stereotype.Component;

import com.su.timetask.dao.domain.UserDao;

/**
 * @author Administrator
 *
 */
@Component
public class UserMapperImpl implements UserMapper{

	public void insertUser(UserDao userDao) {
		System.out.println("user insert");
	}

}
