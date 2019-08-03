package com.humanresources.mapper;

import com.humanresources.bean.Attendancestatus;
import com.humanresources.bean.AttendancestatusExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AttendancestatusMapper {
    int countByExample(AttendancestatusExample example);

    int deleteByExample(AttendancestatusExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Attendancestatus record);

    int insertSelective(Attendancestatus record);

    List<Attendancestatus> selectByExample(AttendancestatusExample example);

    Attendancestatus selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Attendancestatus record, @Param("example") AttendancestatusExample example);

    int updateByExample(@Param("record") Attendancestatus record, @Param("example") AttendancestatusExample example);

    int updateByPrimaryKeySelective(Attendancestatus record);

    int updateByPrimaryKey(Attendancestatus record);
}