package com.qfedu.controller;

import com.qfedu.entity.NewStudent;
import com.qfedu.entity.ScoreResult;
import com.qfedu.service.NewStudentInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * @ProjectName:echarsTest
 * @author:卢卫振
 * @date:2020/9/23 20:05
 * Description:
 */
@Controller
public class EchartController {
    @Autowired
    private NewStudentInfoService newStudentInfoService;
    @RequestMapping("/hello.do")
    @ResponseBody
    public List<NewStudent> geetStudent(){
        List<NewStudent> allStudent = newStudentInfoService.getAllStudent();
        return allStudent;
    }

    @RequestMapping("/getData.do")
    @ResponseBody
    public List<ScoreResult> getData(){
        List<NewStudent> allStudent = newStudentInfoService.getAllStudent();
        List<ScoreResult> results = new ArrayList<>();
        for (NewStudent newstudent : allStudent) {
            ScoreResult scoreResult = new ScoreResult(newstudent.getScore(), newstudent.getName());
            results.add(scoreResult);
        }
        return results;
    }
}
