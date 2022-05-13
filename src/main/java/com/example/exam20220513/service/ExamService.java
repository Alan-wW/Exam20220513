package com.example.exam20220513.service;

import com.example.exam20220513.entity.Exam;
import org.springframework.stereotype.Service;

/**
 * @Author: 邢彬
 * @Date: 2022/05/13/08:56
 * @Description:
 */
public interface ExamService {
    int deleteByPrimaryKey(Integer id);

    int insert(Exam record);

    int insertSelective(Exam record);

    Exam selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Exam record);

    int updateByPrimaryKey(Exam record);
}
