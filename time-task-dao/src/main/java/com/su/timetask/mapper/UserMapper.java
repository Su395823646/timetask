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
public interface UserMapper {

	void insertUser(UserDao userDao);
}
