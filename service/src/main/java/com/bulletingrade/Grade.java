/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bulletingrade;


import org.springframework.stereotype.Component;

/**
 *
 * @author lyndenmarshall
 */
@Component
public class Grade {
    private String name;
    private int grade;

    
    public String getName() {
        return name;
    }

    
    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
    
    
}

