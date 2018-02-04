package com.medicine.menu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/main")
public class MainController {
    private String prefix = "/menu/main";

    /**
     * 返回[首页]
     * @return
     */
    @RequestMapping("/main")
    public String main(){
        System.err.println("RUN MAIN CONTROLLER");
        return prefix + "/main";
    }
}
