package com.example.exam20220513.entity;

import java.io.Serializable;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * exam
 * @author 
 */
@Data
@NoArgsConstructor
public class Exam implements Serializable {
    private Integer id;

    private String name;

    private static final long serialVersionUID = 1L;
}