package org.apache.myfaces.service.impl;

import java.util.Date;

import org.apache.myfaces.service.TimeTaskService;

public class TimeTaskServiceImpl implements TimeTaskService{

	public void PrintHello() {
		Date time = new Date();
		System.out.println(time);
	}

}
