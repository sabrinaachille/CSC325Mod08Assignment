/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author MoaathAlrajab
 */
public class Student extends Human{
    // ToDo 1: Make this class a child of Human
    // keyword "extends" Student acquires properties of Human and is a subclass/child of Human class

    // ToDo 6: Fix the constructor of the Student class
    // declare credits variable
    protected int credits;
    // credits setter
    public void setCredit(int credit){
        this.credits = credit;
    }
    // credits getter
    public int getCredits() {
        return credits;
    }
    // constructor that takes three paras, two inherited from Human and the Student's credits variable
    public Student(String name, short age, int credits) {
        // initialize name and age from Human
        super(name, age);
        // initialize credit
        this.credits = credits;
    }

    // ToDo 2: Fix the resulting errors
    // constructor that takes two paras inherited from Human
    public Student(String name, short age) {
        super(name, age);
    }
    // implementation of address getter, abstract method in Human must be declared in Student
    @Override
    public String getAddress() {
        return address;
    }
    // implementation of address setter, abstract method in Human must be declared in Student
    @Override
    public void setAddress(String address) {
        this.address = address;
    }

    // ToDo 3: Add a field for GPA and create a setter and a getter
    // declare gpa variable
    protected float gpa;
    // gpa setter
    public void setGpa(float gpa){
        this.gpa = gpa;
    }
    // gpa getter
    public float getGpa(){
        return gpa;
    }

    // ToDo 9: Add a toString method for the Student class
    // toString returns information about the Student
    public String toString(){
        return "Student name: " + getName() + ", age: " + getAge() + ", gpa: " + getGpa() + ", credits: " + getCredits() ;
    }

    // ToDo 4: Add comments to your code
    // Here I updated the Student class with constructors, getters, setter
}
