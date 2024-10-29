package com.mycompany.csc325_oop_designreview_lab;

import java.sql.SQLOutput;

public class Senior extends Student{
    // Todo 7: Create two classes for Freshman and Senior

    // constructor with 3 paras
    public Senior(String name, short age, int credits) {
        super(name, age, credits);
    }

    // ToDo 8: The senior class should have a minimum of 85 credits
    // credits setter with condition to ensure credit is at least 85 credits
    @Override
    public void setCredit(int credit){
        if(credit > 84){
            this.credits = credit;
        }
        else {
            System.out.println("Credit amount does not meet Senior level requirements.");
        }
    }

    // ToDo 11: Add a toString method for the Senior class
    // toString overrides parent
    @Override
    public String toString(){
        return "Senior name: " + getName() + ", age: " + getAge() + ", gpa: " + getGpa() + ", credits: " + getCredits() ;
    }
}
