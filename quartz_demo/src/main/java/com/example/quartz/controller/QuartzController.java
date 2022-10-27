package com.example.quartz.controller;

import com.example.quartz.request.Task;
import com.example.quartz.response.Response;
import org.quartz.SchedulerException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.example.quartz.utils.QuartzUtil;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/quartz")
public class QuartzController {

    @Autowired
    private QuartzUtil quartzUtil;

    @RequestMapping(value = "/addTask", method = RequestMethod.POST)
    public Response addTask(@RequestBody Task task) throws SchedulerException {
        quartzUtil.addTask(task);
        System.out.println("success");
        return new Response("0000","success","success");
    }

    @RequestMapping(value = "/pauseTask", method = RequestMethod.POST)
    public Response pauseTask(@RequestBody Task task) throws SchedulerException {
        quartzUtil.pauseTask(task);
        System.out.println("success");
        return new Response("0000","success","success");
    }

    @RequestMapping(value = "/resumeJob", method = RequestMethod.POST)
    public Response resumeJob(@RequestBody Task task) throws SchedulerException {
        quartzUtil.resumeJob(task);
        System.out.println("success");
        return new Response("0000","success","success");
    }

    @RequestMapping(value = "/deleteTask", method = RequestMethod.POST)
    public Response deleteTask(@RequestBody Task task) throws SchedulerException {
        quartzUtil.deleteTask(task);
        System.out.println("success");
        return new Response("0000","success","success");
    }

    @RequestMapping(value = "/modifyJobCorn", method = RequestMethod.POST)
    public Response modifyJobCorn(@RequestBody Task task) throws SchedulerException {
        quartzUtil.modifyJobCorn(task);
        System.out.println("success");
        return new Response("0000","success","success");
    }
}
