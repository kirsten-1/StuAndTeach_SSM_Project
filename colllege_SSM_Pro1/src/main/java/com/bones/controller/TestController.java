package com.bones.controller;

import com.bones.mapper.TestContentMapper;
import com.bones.pojo.QuesAndChoice;
import com.bones.pojo.StuCurriculum;
import com.bones.pojo.TestContent;
import com.bones.service.CurriculumService;
import com.bones.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class TestController {
    @Autowired
    private CurriculumService curriculumService;
    @Autowired
    private TestService testService;
    /**
     * 得到测试的课程的信息
     * @param coursename  课程名称
     * @return  返回类json格式的对象
     */
    @ResponseBody
    @RequestMapping("/getTestInfo")
    public StuCurriculum getTest(String coursename){
        List<StuCurriculum> courseList = curriculumService.getCourseByCourseName(coursename);
        courseList.forEach(System.out::println);
        StuCurriculum course = courseList.get(0);
        return course;
    }

    /**
     * 得到测试内容
     * @param courseid 课程id
     * @return  返回试题List
     */
    @ResponseBody
    @RequestMapping("/getTestContent")
    public List<QuesAndChoice> getTestContent(String courseid){
        List<TestContent> testContentList =  testService.getTestContent(courseid);
        List<QuesAndChoice> quesAndChoiceList = new ArrayList<>();
        for (TestContent testContent : testContentList) {
            quesAndChoiceList.add(new QuesAndChoice(testContent.getQuestion(),testContent.getChoicea(),testContent.getChoiceb()));
        }
        return quesAndChoiceList;
    }

    /**
     * 校验正确率
     * @param arr  前端的参数（学生的答案）
     * @param courseid  课程id
     * @return
     */
    @ResponseBody
    @RequestMapping("/getPoint")
    public Map getPoint(String arr,String courseid){
        Map<Integer,String> correctness = new HashMap<>();
        Map<String,Object> map = new HashMap<>();
        int pointSum = 0;
        List<TestContent> testContentList =  testService.getTestContent(courseid);
        String[] newArr = arr.split(",");
        for (int i = 0; i < 5; i++) {
           if ( newArr[i].equals("option1")&&testContentList.get(i).getAnswer().equals("A")){
               pointSum+=Integer.parseInt(testContentList.get(i).getPoint());
               System.out.println(pointSum);
               correctness.put(i,"正确");
           }else if(newArr[i].equals("option2")&&testContentList.get(i).getAnswer().equals("B")){
               pointSum+=Integer.parseInt(testContentList.get(i).getPoint());
               correctness.put(i,"正确");
            }else {
               correctness.put(i,"错误");
           }
        }
        map.put("correctness",correctness);
        map.put("pointSum",pointSum);
        return map;
    }
}
