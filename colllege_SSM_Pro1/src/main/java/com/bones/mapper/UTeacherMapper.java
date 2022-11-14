package com.bones.mapper;


import com.bones.pojo.UTeacher;
import com.bones.pojo.UTeacherExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UTeacherMapper {
    long countByExample(UTeacherExample example);

    int deleteByExample(UTeacherExample example);

    int deleteByPrimaryKey(String id);

    int insert(UTeacher record);

    int insertSelective(UTeacher record);

    List<UTeacher> selectByExample(UTeacherExample example);

    UTeacher selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") UTeacher record, @Param("example") UTeacherExample example);

    int updateByExample(@Param("record") UTeacher record, @Param("example") UTeacherExample example);

    int updateByPrimaryKeySelective(UTeacher record);

    int updateByPrimaryKey(UTeacher record);
}