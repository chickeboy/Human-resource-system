package com.humanresources.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.humanresources.bean.Position;
import com.humanresources.bean.PositionExample;
import com.humanresources.bean.positionEx;

public interface PositionMapper {
    int countByExample(PositionExample example);

    int deleteByExample(PositionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Position record);

    int insertSelective(Position record);

    List<Position> selectByExample(PositionExample example);

    Position selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Position record, @Param("example") PositionExample example);

    int updateByExample(@Param("record") Position record, @Param("example") PositionExample example);

    int updateByPrimaryKeySelective(Position record);

    int updateByPrimaryKey(Position record);
    
    List<Position> findPositions(int departmentid);
    
    Position findPosition(positionEx positionEx);
    
    List<positionEx> findAllPosition();
}