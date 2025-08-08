PART-03
In this part ,
 I  pulled the latest changes on my main branch , and then created and checked out a new branch PART-03.

Modified Student.java:
Added a private static int nextStudentIdCounter initialized to 1.
Removed the setDetails method.
Added a public constructor Student(String name) that initializes studentId using nextStudentIdCounter++ and name using the parameter.
Modified Course.java:
Add a private static int nextCourseIdCounter initialized to 101.
Change the courseId field from String to int.
Remove the setDetails method.
Add a public constructor Course(String courseName) that initializes courseId using nextCourseIdCounter++ and courseName using the parameter.
Update the displayDetails() method to print the int courseId (e.g., prefixed with "C").
Modify Main.java:
Update the creation of Student and Course objects to use their new constructors.
Include code to create a few more instances to demonstrate that the auto-ID generation is working correctly.





Modify Student.java: Make fields private, add public getters for studentId and name.
Modify Course.java: Make fields private, add public getters for courseId and courseName.
Create src/com/school/AttendanceRecord.java:
Define private fields: studentId (int), courseId (int), status (String).
Create a constructor AttendanceRecord(int studentId, int courseId, String status) that initializes these fields.
In the constructor, add validation for status: if not "Present" or "Absent" (case-insensitive), set status to "Invalid" and print a warning.
Add public getters for all fields.
Add a public void displayRecord() method.
Modify Main.java:
Add imports for java.util.ArrayList and java.util.List.
Create an ArrayList<AttendanceRecord> called attendanceLog.
Create a few AttendanceRecord objects (using getStudentId() and getCourseId() from your student/course objects), including one with an invalid status to test validation. Add them to attendanceLog.
Loop through attendanceLog and call displayRecord() for each.