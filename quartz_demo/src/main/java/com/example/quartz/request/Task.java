package com.example.quartz.request;

import java.io.Serializable;

/**
 * @authoer:WangMengqiang
 * @createDate:2022/10/27
 * @description:
 */
public class Task implements Serializable {


    private static final long serialVersionUID = -5712692344539774860L;
    /**
     * 任务名称
     */
    private String taskName;

    /**
     * 任务组名
     */
    private String taskGroup;

    /**
     * 触发器名称
     */
    private String triggerName;

    /**
     *触发器组名
     */
    private String triggerGroup;

    /**
     *描述
     */
    private String description;

    /**
     *cron表达式
     */
    private String cronExpression;

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getTaskGroup() {
        return taskGroup;
    }

    public void setTaskGroup(String taskGroup) {
        this.taskGroup = taskGroup;
    }

    public String getTriggerName() {
        return triggerName;
    }

    public void setTriggerName(String triggerName) {
        this.triggerName = triggerName;
    }

    public String getTriggerGroup() {
        return triggerGroup;
    }

    public void setTriggerGroup(String triggerGroup) {
        this.triggerGroup = triggerGroup;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCronExpression() {
        return cronExpression;
    }

    public void setCronExpression(String cronExpression) {
        this.cronExpression = cronExpression;
    }

    @Override
    public String toString() {
        return "Task{" +
                "taskName='" + taskName + '\'' +
                ", taskGroup='" + taskGroup + '\'' +
                ", triggerName='" + triggerName + '\'' +
                ", triggerGroup='" + triggerGroup + '\'' +
                ", description='" + description + '\'' +
                ", cronExpression='" + cronExpression + '\'' +
                '}';
    }
}
