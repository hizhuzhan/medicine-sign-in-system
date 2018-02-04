package com.medicine.menu.controller;

import com.medicine.menu.dao.MenuDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/homePage")
public class HomePageController {
    private String prefix = "";


    @Autowired
    private MenuDao sysMenuDao;

    /**
     * 返回 <主页面>
     * @return
     */
    @RequestMapping("")
    public String main(){
        System.err.println("RUN HOMEPAGE CONTROLLER");
        return prefix + "/homePage";
    }


    /**
     * 获取菜单列表
     * @return json格式
     */
    @RequestMapping("/menuList")
    @ResponseBody
    public Object menuList(){
        return sysMenuDao.getALlMenu();
    }
}
