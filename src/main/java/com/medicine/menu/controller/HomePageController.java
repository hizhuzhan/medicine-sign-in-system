package com.medicine.menu.controller;

import com.medicine.menu.dao.MenuDao;
import com.medicine.menu.domain.MenuDO;
import com.medicine.menu.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/homePage")
public class HomePageController {
    private String prefix = "";

    @Autowired
    private MenuService sysMenuService;

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
    public List<MenuDO> menuList(){
        return sysMenuService.getAllMenu();
    }
}
