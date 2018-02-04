package com.medicine.menu.dao;

import com.medicine.menu.domain.MeetingListDO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MeetingListDao {
//    int deleteByPrimaryKey(String meetingId);
//
//    int insert(MeetingListDO record);
//
//    int insertSelective(MeetingListDO record);
//
//    MeetingListDO selectByPrimaryKey(String meetingId);
//
//    int updateByPrimaryKeySelective(MeetingListDO record);
//
//    int updateByPrimaryKey(MeetingListDO record);

    /**
     * 获取所有数据：test
     * @return List<MeetingListDO>
     */
    List<MeetingListDO> listAll();
}
