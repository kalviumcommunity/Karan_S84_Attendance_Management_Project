package com.school;
// Add a private static int nextCourseIdCounter initialized to 101.
// Change the courseId field from String to int.
// Remove the setDetails method.
// Add a public constructor Course(String courseName) that initializes courseId using nextCourseIdCounter++ and courseName using the parameter.
// Update the displayDetails() method to print the int courseId (e.g., prefixed with "C").
class Course {
    int courseId;
    String name;
    private static int nextCourseIdCounter = 101;
    public Course(String name){
        this.name = name;
        this.courseId = nextCourseIdCounter++;
    }
    public void displayDetails(){
        System.out.println("Course ID: C" + this.courseId + " , Name: " + this.name);
    }
} 