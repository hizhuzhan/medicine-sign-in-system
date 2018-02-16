package com.medicine.menu.service.impl;

import com.medicine.menu.dao.MenuDao;
import com.medicine.menu.domain.MenuDO;
import com.medicine.menu.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuServiceImpl implements MenuService {

    @Autowired
    private MenuDao sysMenuDao;

    @Override
    public List<MenuDO> getAllMenu() {
        List resList = sysMenuDao.getAllMenu();
        return resList;
    }
}
