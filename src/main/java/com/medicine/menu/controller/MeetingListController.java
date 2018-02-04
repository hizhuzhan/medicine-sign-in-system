package com.medicine.menu.controller;

import com.medicine.menu.dao.MeetingListDao;
import com.medicine.menu.domain.MeetingListDO;
import com.medicine.menu.service.MeetingListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/meetList")
public class MeetingListController {
    private String prefix = "/menu/meetingList";

    @Autowired
    private MeetingListService sysMeetingListService;

    /**
     * 返回[添加会议]
     * @return
     */
    @RequestMapping("/main")
    public String main(){
        System.err.println("RUN MEETINLIST CONTROLLER");
        return prefix + "/meetList";
    }

    @RequestMapping("/list")
    public String list(){
        List<MeetingListDO> list = sysMeetingListService.listAll();
        return "";
    }

    @RequestMapping("/add")
    public String add(){
        return prefix + "/add";
    }
}
