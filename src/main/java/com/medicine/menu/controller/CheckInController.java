package com.medicine.menu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/checkIn")
public class CheckInController {
    private String prefix = "/menu/checkIn";

    /**
     * 返回[进行签到]
     * @return
     */
    @RequestMapping("/main")
    public String main(){
        System.err.println("RUN CHECKIN CONTROLLER");
        return prefix + "/checkIn";
    }
}
