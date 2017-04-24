package com.hsyd.dao;

import com.hsyd.model.Reportmake;
import com.hsyd.model.ReportmakeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ReportmakeMapper {
    int countByExample(ReportmakeExample example);

    int deleteByExample(ReportmakeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Reportmake record);

    int insertSelective(Reportmake record);

    List<Reportmake> selectByExampleWithBLOBs(ReportmakeExample example);

    List<Reportmake> selectByExample(ReportmakeExample example);

    Reportmake selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Reportmake record, @Param("example") ReportmakeExample example);

    int updateByExampleWithBLOBs(@Param("record") Reportmake record, @Param("example") ReportmakeExample example);

    int updateByExample(@Param("record") Reportmake record, @Param("example") ReportmakeExample example);

    int updateByPrimaryKeySelective(Reportmake record);

    int updateByPrimaryKeyWithBLOBs(Reportmake record);
}