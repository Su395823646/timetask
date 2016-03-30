/**
 * 
 */
package org.apache.myfaces.service.impl;


import static org.quartz.JobBuilder.newJob;
import static org.quartz.SimpleScheduleBuilder.simpleSchedule;
import static org.quartz.TriggerBuilder.newTrigger;

import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.Trigger;
import org.quartz.impl.StdSchedulerFactory;

/**
 * @author Administrator
 *
 */
public class HelloWordRunner {
	

	
	public static void main(String[] args) {
		HelloWordRunner  helloWordRunner = new HelloWordRunner();

		try {
			Scheduler scheduler = helloWordRunner.createScheduler();
			helloWordRunner.scheduleJob(scheduler);
			
			scheduler.start();
		} catch (SchedulerException e) {
			e.printStackTrace();
		}
	}
	
	public Scheduler createScheduler() throws SchedulerException{
		return StdSchedulerFactory.getDefaultScheduler();
	}
	
	private void scheduleJob(Scheduler scheduler) throws SchedulerException{
		JobDetail jobDetail = newJob(HelloWordJob.class).withIdentity("myJob","group1").build();
		
		 Trigger trigger = newTrigger().withIdentity("myTrigger","group1").startNow().withSchedule(simpleSchedule()
				 .withIntervalInSeconds(5).withRepeatCount(10)).build();
		 
		 scheduler.scheduleJob(jobDetail, trigger);
	}
	

}
