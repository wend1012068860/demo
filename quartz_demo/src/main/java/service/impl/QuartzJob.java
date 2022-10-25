package service.impl;

import org.quartz.DisallowConcurrentExecution;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.PersistJobDataAfterExecution;
import org.springframework.scheduling.quartz.QuartzJobBean;

import java.util.Date;

@DisallowConcurrentExecution
@PersistJobDataAfterExecution
public class QuartzJob extends QuartzJobBean {

    @Override
    protected void executeInternal(JobExecutionContext jobExecutionContext) throws JobExecutionException {

        try {
            Thread.sleep(2000);
            System.out.println("instanceId : " + jobExecutionContext.getScheduler().getSchedulerInstanceId());
            System.out.println("taskName : " + jobExecutionContext.getJobDetail().getKey().getName());
            System.out.println("execute time : " + new Date());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
