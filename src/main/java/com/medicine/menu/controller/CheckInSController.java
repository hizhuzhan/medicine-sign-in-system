package com.medicine.menu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/checkInS")
public class CheckInSController {
    private String prefix = "/menu/checkInStatus";

    /**
     * 返回[首页]
     * @return
     */
    @RequestMapping("/main")
    public String main(){
        System.err.println("RUN CHECKINSTATUS CONTROLLER");
        return prefix + "/checkInS";
    }
}
