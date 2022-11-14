package com.bones.service;

import com.bones.mapper.TestContentMapper;
import com.bones.pojo.TestContent;
import com.bones.pojo.TestContentExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestService {
    @Autowired
    private TestContentMapper testContentMapper;


    public List<TestContent> getTestContent(String courseid) {
        TestContentExample example = new TestContentExample();
        example.createCriteria().andCourseIdEqualTo(Integer.parseInt(courseid));
        return testContentMapper.selectByExample(example);
    }
}
