package com.hsyd.dao;

import com.hsyd.model.Bespeak;
import com.hsyd.model.BespeakExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BespeakMapper {
    int countByExample(BespeakExample example);

    int deleteByExample(BespeakExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Bespeak record);

    int insertSelective(Bespeak record);

    List<Bespeak> selectByExample(BespeakExample example);

    Bespeak selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Bespeak record, @Param("example") BespeakExample example);

    int updateByExample(@Param("record") Bespeak record, @Param("example") BespeakExample example);

    int updateByPrimaryKeySelective(Bespeak record);

    int updateByPrimaryKey(Bespeak record);
}