package com.humanresources.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.humanresources.bean.Interview;
import com.humanresources.bean.InterviewEx;
import com.humanresources.bean.InterviewExample;

public interface InterviewMapper {
    int countByExample(InterviewExample example);

    int deleteByExample(InterviewExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Interview record);

    int insertSelective(Interview record);

    List<Interview> selectByExample(InterviewExample example);

    Interview selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Interview record, @Param("example") InterviewExample example);

    int updateByExample(@Param("record") Interview record, @Param("example") InterviewExample example);

    int updateByPrimaryKeySelective(Interview record);

    int updateByPrimaryKey(Interview record);
    
    List<InterviewEx> findAllInterviews();
    
    List<InterviewEx> findmyInterviews(int userid);
}