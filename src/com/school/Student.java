 package com.school;
 class Student {
    String name;
    int studentId;
    private static int nextStudentIdCounter = 1;
    public Student(String name){
        this.studentId = nextStudentIdCounter++;
        this.name = name;
    }
    public void displayDetails(){
        System.out.println("Student ID : " + this.studentId + ", Name: " + this.name); 
    }
}
