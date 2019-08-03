package com.humanresources.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.humanresources.bean.Resume;
import com.humanresources.bean.ResumeExample;

public interface ResumeMapper {
    int countByExample(ResumeExample example);

    int deleteByExample(ResumeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Resume record);

    int insertSelective(Resume record);

    List<Resume> selectByExample(ResumeExample example);

    Resume selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Resume record, @Param("example") ResumeExample example);

    int updateByExample(@Param("record") Resume record, @Param("example") ResumeExample example);

    int updateByPrimaryKeySelective(Resume record);

    int updateByPrimaryKey(Resume record);
    
    List<Resume> fingAllList();
    
    List<Resume> findResumeByUserName(String username);
    
    int deleteByResume(Resume resume);
}