package com.medicine.menu.dao;

import com.medicine.menu.domain.MenuDO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MenuDao {
    List<MenuDO> getAllMenu();
}
