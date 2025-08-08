PART-03
In this part ,
 I  pulled the latest changes on my main branch , and then created and checked out a new branch PART-03.

Modified Student.java:
Added a private static int nextStudentIdCounter initialized to 1.
Removed the setDetails method.
Added a public constructor Student(String name) that initializes studentId using nextStudentIdCounter++ and name using the parameter.
Modified Course.java:
Added a private static int nextCourseIdCounter initialized to 101.
Changed the courseId field from String to int.
Removed the setDetails method.
Added a public constructor Course(String courseName) that initializes courseId using nextCourseIdCounter++ and courseName using the parameter.
Updated the displayDetails() method to print the int courseId (e.g., prefixed with "C").
Modified Main.java:
Updated the creation of Student and Course objects to use their new constructors.
Included code to create a few more instances to demonstrate that the auto-ID generation is working correctly.




PART-04:
Modified Student.java: Made fields private, added public getters for studentId and name.
Modified Course.java: Made fields private, added public getters for courseId and courseName.
Created src/com/school/AttendanceRecord.java:
Defined private fields: studentId (int), courseId (int), status (String).
Created a constructor AttendanceRecord(int studentId, int courseId, String status) that initializes these fields.
In the constructor, I added validation for status: if not "Present" or "Absent" (case-insensitive), set status to "Invalid" and print a warning.
Added public getters for all fields.
Added a public void displayRecord() method.
Modified Main.java:
Added imports for java.util.ArrayList and java.util.List.
Created an ArrayList<AttendanceRecord> called attendanceLog.
Created a few AttendanceRecord objects (using getStudentId() and getCourseId() from your student/course objects), including one with an invalid status to test validation. Add them to attendanceLog.
Looped through attendanceLog and called displayRecord() for each.