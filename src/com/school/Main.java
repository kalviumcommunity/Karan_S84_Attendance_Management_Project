package com.school;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        
        Student s1 = new Student("Sir-Jadeja");
        
        Student s2 = new Student("Viv-Siraj-Official");
    
       Course c1 = new Course("OOPS");
    
       Course c2 = new Course("AI-M.L");

       Course [] arr1 = {c1 , c2};
       Student [] arr2 = {s1 , s2};
    //    System.out.println("Registered Students: ");
    //    for(Student s : arr2) s.displayDetails();
    //    System.out.println("Course Details: ");
    //    for(Course c : arr1) c.displayDetails();

        ArrayList<AttendanceRecord> attendanceLog = new ArrayList<>();
        attendanceLog.add(new AttendanceRecord(s1.getId() , c1.getId() , "Present"));
        attendanceLog.add(new AttendanceRecord(s2.getId() , c2.getId() , "Late"));
        attendanceLog.add(new AttendanceRecord(s1.getId(), c2.getId() ,   "Absent" ));
        for(AttendanceRecord record : attendanceLog) record.displayRecord();
    }
}