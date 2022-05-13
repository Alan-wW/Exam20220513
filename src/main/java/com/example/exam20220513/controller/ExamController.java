package com.example.exam20220513.controller;

import com.example.exam20220513.entity.Exam;
import com.example.exam20220513.service.ExamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: 邢彬
 * @Date: 2022/05/13/08:55
 * @Description:
 */
@RestController
@RequestMapping("/exam")
public class ExamController {
    @Autowired
    private ExamService examService;

    @GetMapping("/getExam/{id}")
    public Exam getExam(@PathVariable("id") Integer id){
        return examService.selectByPrimaryKey(id);
    }
}
