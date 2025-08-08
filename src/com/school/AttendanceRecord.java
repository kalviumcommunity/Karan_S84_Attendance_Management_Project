package com.school;

public class AttendanceRecord {
 private int studentId;
 private int courseId;
 private String status;

 AttendanceRecord(int studentId , int courseId , String status){
    this.studentId = studentId;
    this.courseId = courseId;
   if(status.equals("Present") || status.equals("Absent")) this.status = status;
   else{  
    this.status = "Invalid";
    System.out.println("Warning : Invalid attendance status provided . Set to Invalid");
}
 }
public int getStudentId() {
    return studentId;
}

public int getCourseId(){
    return courseId;
}
public String getStatus(){
    return status;
}

    public void displayRecord(){
        System.out.println("Attendance:  StudentID " + getStudentId() + " in  " + "CourseID- " + getCourseId() + " " + "status: " + status);
    }
}
