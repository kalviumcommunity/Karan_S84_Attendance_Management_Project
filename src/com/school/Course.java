package com.school;
// Add a private static int nextCourseIdCounter initialized to 101.
// Change the courseId field from String to int.
// Remove the setDetails method.
// Add a public constructor Course(String courseName) that initializes courseId using nextCourseIdCounter++ and courseName using the parameter.
// Update the displayDetails() method to print the int courseId (e.g., prefixed with "C").
class Course {
    private int courseId;
    private String name;
    private static int nextCourseIdCounter = 101;
    public Course(String name){
        this.name = name;
        this.courseId = nextCourseIdCounter++;
    }
    public int  getId(){
        return courseId;
    }
    public String course(){
        return name;
    }
    public void displayDetails(){
        System.out.println("Course ID: C" + this.courseId + " , Name: " + this.name);
    }
} 