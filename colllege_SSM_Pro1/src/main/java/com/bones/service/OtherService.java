package com.bones.service;


import com.bones.mapper.StudentMapper;
import com.bones.pojo.Student;
import com.bones.pojo.StudentExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wanghu
 * @discrption：
 * @create 2021-05-13 15:17
 */
@Service
public class OtherService {

    @Autowired
    private StudentMapper studentMapper;

    public List<String> getAllMajors() {
        List<String> majors = studentMapper.selectAllMajors();
        return majors;
    }

    public List<String> getClassesByMajor(String major) {
        return studentMapper.getClassesByMajor(major);
    }

    public List<String> getStudentIdsByClass(String className,ArrayList<String> list) {
        StudentExample example = new StudentExample();
        example.createCriteria().andClassNameEqualTo(className).andIdIn(list);
        List<Student> students = studentMapper.selectByExample(example);
        ArrayList<String> ids = new ArrayList<>();
        for(Student student:students){
            ids.add(student.getId());
        }
        return ids;
    }
}
