package com.humanresources.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.humanresources.bean.Recruitment;
import com.humanresources.bean.RecruitmentEx;
import com.humanresources.bean.RecruitmentExample;

public interface RecruitmentMapper {
    int countByExample(RecruitmentExample example);

    int deleteByExample(RecruitmentExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Recruitment record);

    int insertSelective(Recruitment record);

    List<Recruitment> selectByExample(RecruitmentExample example);

    Recruitment selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Recruitment record, @Param("example") RecruitmentExample example);

    int updateByExample(@Param("record") Recruitment record, @Param("example") RecruitmentExample example);

    int updateByPrimaryKeySelective(Recruitment record);

    int updateByPrimaryKey(Recruitment record);
    
    List<RecruitmentEx> getAllList();
}