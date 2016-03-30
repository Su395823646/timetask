/**
 * 
 */
package com.su.test;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;

import com.su.timetask.dao.domain.Employee;
import com.su.timetask.dao.domain.TotalRoute;
import com.su.timetask.dao.domain.UserDao;
import com.su.timetask.mapper.EmployeeMapper;
import com.su.timetask.mapper.TotalRouteMapper;
import com.su.timetask.mapper.UserMapper;

/**
 * @author Administrator
 * 
 */
@ContextConfiguration(locations = { "/test-dao.xml" })
public class EmployeeTest extends AbstractTransactionalJUnit4SpringContextTests {

	@Autowired
	private EmployeeMapper employeeMapper;
	@Autowired
	private TotalRouteMapper totalRouteMapper;
	@Autowired
	private UserMapper userMapper;

	@Test
	public void insert() {
			Employee employee = new Employee();
			employee.setAge("12");
			employee.setName("suzhi");
			employee.setSex("man");
			employee.setRoleId(12);
			employee.setTel("135444444444");
			employeeMapper.insert(employee);
	}

	@Test
	public void insertTotal() {
		TotalRoute totalRoute = new TotalRoute();
		totalRoute.setAcrossnode("assss");
		totalRoute.setEndpoint("end");
		totalRoute.setRouteId(11);
		totalRoute.setRoutenum("routename");
		totalRoute.setId(9);

		try {
			totalRouteMapper.insert(totalRoute);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void userInsert() {
		try {
			UserDao userDao = new UserDao();
			userMapper.insertUser(userDao);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public UserMapper getUserMapper() {
		return userMapper;
	}

	public void setUserMapper(UserMapper userMapper) {
		this.userMapper = userMapper;
	}

}
