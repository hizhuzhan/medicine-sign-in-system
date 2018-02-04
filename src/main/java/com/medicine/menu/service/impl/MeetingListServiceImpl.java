package com.medicine.menu.service.impl;

import com.medicine.menu.dao.MeetingListDao;
import com.medicine.menu.domain.MeetingListDO;
import com.medicine.menu.service.MeetingListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MeetingListServiceImpl implements MeetingListService {

    @Autowired
    private MeetingListDao sysMeetingListDao;

    @Override
    public List<MeetingListDO> listAll() {
        List<MeetingListDO> list = sysMeetingListDao.listAll();
        return list;
    }
}
