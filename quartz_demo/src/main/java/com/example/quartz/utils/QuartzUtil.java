package com.example.quartz.utils;

import com.example.quartz.request.Task;
import org.quartz.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.example.quartz.service.impl.QuartzJob;

@Component
public class QuartzUtil {

    @Autowired
    private Scheduler scheduler;

    /**
     * 新增定时任务
     * @param task
     * @throws SchedulerException
     */
    public void addTask(Task task) throws SchedulerException{
        TriggerKey triggerKey = TriggerKey.triggerKey(task.getTriggerName(),task.getTriggerGroup());
        Trigger trigger = scheduler.getTrigger(triggerKey);
        if (null == trigger){
            trigger = TriggerBuilder.newTrigger()
                    .withIdentity(triggerKey)
                    .withSchedule(CronScheduleBuilder.cronSchedule(task.getCronExpression()))
                    .build();

            JobDetail jobDetail = JobBuilder.newJob(QuartzJob.class)
                    .withIdentity(task.getTaskName(),task.getTaskGroup())
                    .build();
            scheduler.scheduleJob(jobDetail, trigger);
        }
    }

    /**
     * 暂停定时任务
     * @param task
     * @throws SchedulerException
     */
    public void pauseTask(Task task) throws SchedulerException{
        JobKey jobKey = JobKey.jobKey(task.getTaskName(), task.getTaskGroup());
        scheduler.pauseTrigger(new TriggerKey(task.getTriggerName(), task.getTriggerGroup()));
        scheduler.pauseJob(jobKey);
    }

    /**
     * 恢复任务
     * @param task
     * @throws SchedulerException
     */
    public void resumeJob(Task task) throws SchedulerException{
        TriggerKey triggerKey = TriggerKey.triggerKey(task.getTriggerName(), task.getTriggerGroup());
        scheduler.resumeTrigger(triggerKey);
    }

    /**
     * 删除定时任务
     * @param task
     * @throws SchedulerException
     */
    public void deleteTask(Task task) throws SchedulerException{
        TriggerKey triggerKey = TriggerKey.triggerKey(task.getTriggerName(), task.getTriggerGroup());
        scheduler.pauseTrigger(triggerKey);
        scheduler.unscheduleJob(triggerKey);
    }

    /**
     * 修改定时任务时间
     * @param task
     * @throws SchedulerException
     */
    public void modifyJobCorn(Task task) throws SchedulerException{
        TriggerKey triggerKey = TriggerKey.triggerKey(task.getTriggerName(), task.getTriggerGroup());
        // 获取trigger
        CronTrigger trigger = (CronTrigger) scheduler.getTrigger(triggerKey);
        // 表达式调度构建器
        CronScheduleBuilder scheduleBuilder = CronScheduleBuilder.cronSchedule(task.getCronExpression())
                .withMisfireHandlingInstructionDoNothing();
        // 按新的cronExpression表达式重新构建trigger
        trigger = trigger.getTriggerBuilder().withIdentity(triggerKey).withSchedule(scheduleBuilder)
                .withDescription(task.getDescription()).build();
        // 按新的trigger重新设置job执行
        scheduler.rescheduleJob(triggerKey,trigger);
    }

}
