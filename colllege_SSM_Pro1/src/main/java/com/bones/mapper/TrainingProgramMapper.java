package com.bones.mapper;


import java.util.List;

import com.bones.pojo.TrainingProgram;
import com.bones.pojo.TrainingProgramExample;
import org.apache.ibatis.annotations.Param;

public interface TrainingProgramMapper {
    long countByExample(TrainingProgramExample example);

    int deleteByExample(TrainingProgramExample example);

    int deleteByPrimaryKey(Integer courseId);

    int insert(TrainingProgram record);

    int insertSelective(TrainingProgram record);

    List<TrainingProgram> selectByExample(TrainingProgramExample example);

    TrainingProgram selectByPrimaryKey(Integer courseId);

    int updateByExampleSelective(@Param("record") TrainingProgram record, @Param("example") TrainingProgramExample example);

    int updateByExample(@Param("record") TrainingProgram record, @Param("example") TrainingProgramExample example);

    int updateByPrimaryKeySelective(TrainingProgram record);

    int updateByPrimaryKey(TrainingProgram record);

    List<String> getCourseNamesByMajor(String major);
}