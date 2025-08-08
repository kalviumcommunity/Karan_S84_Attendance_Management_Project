 package com.school;
 class Student {
    private String name;
     private int studentId;
    private static int nextStudentIdCounter = 1;
    public Student(String name){
        this.studentId = nextStudentIdCounter++;
        this.name = name;
    }
    public int getId(){
        return studentId;
    }
    public String  getName(){
        return name;
    }
    public void displayDetails(){
        System.out.println("Student ID : " + this.studentId + ", Name: " + this.name); 
    }
}
