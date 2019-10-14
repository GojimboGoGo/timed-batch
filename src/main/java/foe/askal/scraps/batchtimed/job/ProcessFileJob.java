package foe.askal.scraps.batchtimed.job;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ProcessFileJob implements Job {

    private static final Logger LOG = LoggerFactory.getLogger(ProcessFileJob.class);

    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        String jobName = (String) jobExecutionContext.getMergedJobDataMap().get("name");
        LOG.info("Ran {}!", jobName);
    }
}
