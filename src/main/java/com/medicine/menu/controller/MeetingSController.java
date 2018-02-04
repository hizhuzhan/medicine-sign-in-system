package com.medicine.menu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/meetingS")
public class MeetingSController {
    private String prefix = "/menu/meetingStatistics";

    /**
     * 返回[会议统计]
     * @return
     */
    @RequestMapping("/main")
    public String main(){
        System.err.println("RUN MEETIONGSTATISTICE CONTROLLER");
        return prefix + "/meetingS";
    }
}
