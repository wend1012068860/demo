package controller;

import org.quartz.SchedulerException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import utils.QuartzUtil;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/quartz")
public class QuartzController {

    @Autowired
    private QuartzUtil quartzUtil;

    @RequestMapping(value = "/addTask", method = RequestMethod.GET)
    public void addTask() throws SchedulerException {
        quartzUtil.addTask();
        System.out.println("success");
    }

    @RequestMapping(value = "/addTask2", method = RequestMethod.GET)
    public void addTask2() throws SchedulerException {
        quartzUtil.addTask2();
        System.out.println("success");
    }
}
