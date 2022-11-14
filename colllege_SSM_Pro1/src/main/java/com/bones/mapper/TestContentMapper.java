package com.bones.mapper;

import com.bones.pojo.TestContent;
import com.bones.pojo.TestContentExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TestContentMapper {
    long countByExample(TestContentExample example);

    int deleteByExample(TestContentExample example);

    int insert(TestContent record);

    int insertSelective(TestContent record);

    List<TestContent> selectByExample(TestContentExample example);

    int updateByExampleSelective(@Param("record") TestContent record, @Param("example") TestContentExample example);

    int updateByExample(@Param("record") TestContent record, @Param("example") TestContentExample example);
}