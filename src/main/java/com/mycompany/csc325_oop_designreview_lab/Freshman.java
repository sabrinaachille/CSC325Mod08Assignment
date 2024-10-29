package com.mycompany.csc325_oop_designreview_lab;

import static java.lang.Character.getName;

public class Freshman extends Student {
    // Todo 7: Create two classes for Freshman and Senior
    // keyword "extends" Freshman acquires properties of Student and is a subclass/child of Student class

    // constructor 3 paras
    public Freshman(String name, short age, int credits) {
        super(name, age, credits);
    }

    // ToDo 10: Add a toString method for the Freshman class
    // toString overrides parent
    @Override
    public String toString(){
        return "Freshman name: " + getName() + ", age: " + getAge() + ", gpa: " + getGpa() + ", credits: " + getCredits() ;
    }

}
