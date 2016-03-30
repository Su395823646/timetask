/**
 * 
 */
package org.apache.myfaces.service.impl;

import static org.quartz.JobBuilder.newJob;
import static org.quartz.TriggerBuilder.newTrigger;
import static org.quartz.CronScheduleBuilder.cronSchedule;

import org.quartz.CronTrigger;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.impl.StdSchedulerFactory;



/**
 * @author Administrator
 *
 */
public class CronTriggerRunner {

	private Scheduler scheduler;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CronTriggerRunner cronTriggerRunner = new CronTriggerRunner();
		
		try {
			cronTriggerRunner.createScheduler();
			cronTriggerRunner.scheduleJob2(cronTriggerRunner.getScheduler());
			cronTriggerRunner.start();
			
		} catch (SchedulerException e) {
			e.printStackTrace();
		}

	}
	
	private void start(){
		if(null != scheduler){
			try {
				if(scheduler.isStarted()){
					System.out.print("has started!");
				}
				scheduler.start();
			} catch (SchedulerException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void createScheduler() throws SchedulerException{
		scheduler = StdSchedulerFactory.getDefaultScheduler();
	}
	
	private void scheduleJob(Scheduler scheduler) throws SchedulerException{
		JobDetail jobDetail = newJob(HelloWordJob.class)
				.withIdentity("myjob1", "group1").build();
		CronTrigger trigger = newTrigger()
				.withIdentity("myTrigger1", "group1")
				.withSchedule(cronSchedule("0/5 * * * * ?")).build();
		
		scheduler.scheduleJob(jobDetail,trigger);
	}
	
	private void scheduleJob2(Scheduler scheduler) throws SchedulerException{
		JobDetail jobDetail = newJob(HelloWordJob.class)
				.withIdentity("myjob2", "group1").build();
		CronTrigger trigger = newTrigger()
				.withIdentity("myTrigger2", "group1")
				.withSchedule(cronSchedule("0/1 * * * * ?")).build();
		
		scheduler.scheduleJob(jobDetail,trigger);
	}
	
	private void stop(){
		if(null != scheduler){
			try {
				if(!scheduler.isShutdown()){
					scheduler.shutdown(true);
				}
			} catch (SchedulerException e) {
				e.printStackTrace();
			}
		}
	}

	public Scheduler getScheduler() {
		return scheduler;
	}

	public void setScheduler(Scheduler scheduler) {
		this.scheduler = scheduler;
	}

	
}
