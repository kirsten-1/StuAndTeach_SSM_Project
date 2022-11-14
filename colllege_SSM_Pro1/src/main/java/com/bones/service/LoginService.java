package com.bones.service;


import com.bones.mapper.StudentMapper;
import com.bones.mapper.UStudentMapper;
import com.bones.mapper.UTeacherMapper;
import com.bones.mapper.UtSecretaryMapper;
import com.bones.pojo.Student;
import com.bones.pojo.UStudent;
import com.bones.pojo.UTeacher;
import com.bones.pojo.UtSecretary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author wanghu
 * @discrption：
 * @create 2021-05-08 20:49
 */
@Service
public class LoginService {

    @Autowired
    private UStudentMapper uStudentMapper;
    @Autowired
    private UTeacherMapper uTeacherMapper;
    @Autowired
    private UtSecretaryMapper utSecretaryMapper;
    @Autowired
    private StudentMapper studentMapper;

    public UStudent getUserInfo(String id) {
        return uStudentMapper.selectByPrimaryKey(id);
    }

    public Student getUsernameById(String id) {
        return studentMapper.selectByPrimaryKey(id);
    }

    public UTeacher getTeacherInfo(String id) {
        return uTeacherMapper.selectByPrimaryKey(id);
    }

    public UtSecretary getSecretaryInfo(String id) {
        return utSecretaryMapper.selectByPrimaryKey(id);
    }
}
