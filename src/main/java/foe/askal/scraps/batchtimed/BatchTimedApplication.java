package foe.askal.scraps.batchtimed;

import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.Trigger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class BatchTimedApplication {

	public static void main(String[] args) throws Exception {
		ApplicationContext applicationContext = SpringApplication.run(BatchTimedApplication.class, args);

		Scheduler scheduler = (Scheduler) applicationContext.getBean("sampleJobSchedulerFactory");

		JobDetail job = (JobDetail) applicationContext.getBean("sampleJobDetailFactory");
		job.getJobDataMap().put("name", "Hello World!");
		Trigger trigger = (Trigger) applicationContext.getBean("sampleTriggerFactory");

		scheduler.scheduleJob(job, trigger);
		scheduler.start();
	}

}
