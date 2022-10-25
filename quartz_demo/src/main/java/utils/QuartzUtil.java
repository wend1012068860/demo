package utils;

import org.quartz.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import service.impl.QuartzJob;

import java.util.Date;

@Component
public class QuartzUtil {

    @Autowired
    private Scheduler scheduler;

    public Date addTask() throws SchedulerException{
        TriggerKey triggerKey = TriggerKey.triggerKey("trigger1","group1");
        Trigger trigger = scheduler.getTrigger(triggerKey);
        if (null == trigger){
            trigger = TriggerBuilder.newTrigger()
                    .withIdentity(triggerKey)
                    .withSchedule(CronScheduleBuilder.cronSchedule("0/10 * * * * ?"))
                    .build();

            JobDetail jobDetail = JobBuilder.newJob(QuartzJob.class)
                    .withIdentity("job1","group1")
                    .build();
            return scheduler.scheduleJob(jobDetail,trigger);
        }
        return new Date();
    }

    public Date addTask2() throws SchedulerException{
        TriggerKey triggerKey = TriggerKey.triggerKey("trigger2","group2");
        Trigger trigger = scheduler.getTrigger(triggerKey);
        if (null == trigger){
            trigger = TriggerBuilder.newTrigger()
                    .withIdentity(triggerKey)
                    .withSchedule(CronScheduleBuilder.cronSchedule("0/10 * * * * ?"))
                    .build();

            JobDetail jobDetail = JobBuilder.newJob(QuartzJob.class)
                    .withIdentity("job2","group2")
                    .build();
            return scheduler.scheduleJob(jobDetail,trigger);
        }
        return new Date();
    }

}
