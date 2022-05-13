package com.example.exam20220513.service.impl;

import com.example.exam20220513.entity.Exam;
import com.example.exam20220513.mapper.ExamMapper;
import com.example.exam20220513.service.ExamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: 邢彬
 * @Date: 2022/05/13/08:57
 * @Description:
 */
@Service
public class ExamServiceImpl implements ExamService {

    @Autowired
    private ExamMapper mapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
       return mapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Exam record) {
        return mapper.insert(record);
    }

    @Override
    public int insertSelective(Exam record) {
        return mapper.insertSelective(record);
    }

    @Override
    public Exam selectByPrimaryKey(Integer id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Exam record) {
        return mapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Exam record) {
        return mapper.updateByPrimaryKey(record);
    }
}
