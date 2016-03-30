/**
 * 
 */
package org.apache.myfaces.service.schedule;

import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Administrator
 *
 */
public class AutoMatchingTask {

	 private static final Logger logger = LoggerFactory.getLogger(AutoMatchingTask.class);

	    private static ExecutorService es = Executors.newSingleThreadExecutor();

	    private boolean start;

	    public void setStart(boolean start) {
	        this.start = start;
	    }

	    public void autoMatching() {
	    	System.out.println("-----------------"+new Date());
	    }
}
