package com.bones.mapper;

import com.bones.pojo.StuCurriculum;
import com.bones.pojo.StuCurriculumExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StuCurriculumMapper {
    long countByExample(StuCurriculumExample example);

    int deleteByExample(StuCurriculumExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(StuCurriculum record);

    int insertSelective(StuCurriculum record);

    List<StuCurriculum> selectByExample(StuCurriculumExample example);

    StuCurriculum selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") StuCurriculum record, @Param("example") StuCurriculumExample example);

    int updateByExample(@Param("record") StuCurriculum record, @Param("example") StuCurriculumExample example);

    int updateByPrimaryKeySelective(StuCurriculum record);

    int updateByPrimaryKey(StuCurriculum record);

    void updateCourseGradeIsNull(String courseName, String stuId);
}