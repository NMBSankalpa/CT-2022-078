import java.util.Scanner;

class Course {

    private String courseName;
    private String courseCode;
    private Lecturer lecturer;

    public String getCourseName(){
        return  courseName;
    }
    public String getCourseCode(){
        return  courseCode;
    }
    public Lecturer getLecturer(){
        return lecturer;
    }

    public void setCourseName(String courseName){
          this.courseName = courseName;
    }
    public void setCourseCode(String courseCode){
          this.courseCode = courseCode;
    }
    public void setLecturer(Lecturer lecturer){
          this.lecturer = lecturer;
    }

}

class Lecturer {

    private String lectureName;
    private String courseTeaching;

    public String getLectureeName(){
        return lectureName;
    }
    public String getCourseTeaching(){
        return courseTeaching;
    }

    public void setLectureeName(String lectureeName){
         this.lectureName = lectureeName;
    }
    public void setCourseTeaching(String courseTeaching){
         this.courseTeaching = courseTeaching;
    }
}

class Student {

    private String studentName;
    private String degreeName;
    private String courseFollowing;

    public String getStudentName(){
        return studentName;
    }
    public String getDegreeName(){
        return degreeName;
    }
    public String getCourseFollowing(){
        return courseFollowing;
    }

    public void setStudentName(String studentName){
         this.studentName = studentName;
    }
    public void setDegreeName(String degreeName){
         this.degreeName = degreeName;
    }
    public void setCourseFollowing(String courseFollowing){
         this.courseFollowing = courseFollowing;
    }
}

class Q5 {
    static void main() {
        Course course = new Course();
        Lecturer lecturer = new Lecturer();
        Student student = new Student();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Lecturer Name: ");
        String Lname = scanner.next();
        lecturer.setLectureeName(Lname);
        System.out.println("Enter Course Teaching: ");
        String course_Teach = scanner.next();
        lecturer.setCourseTeaching(course_Teach);

        System.out.println("Enter Course Name: ");
        String Course_name= scanner.next();
        course.setCourseName(Course_name);
        System.out.println("Enter Course Code: ");
        String Course_code= scanner.next();
        course.setCourseCode(Course_code);

        System.out.println("Enter Student Name: ");
        String Student_name= scanner.next();
        student.setStudentName(Student_name);
        System.out.println("Enter Degree Name: ");
        String Degree_name= scanner.next();
        student.setDegreeName(Degree_name);
        System.out.println("Enter Course Following: ");
        String course_follow= scanner.next();
        student.setCourseFollowing(course_follow);

        System.out.println("Lecturer name: " + lecturer.getLectureeName());
        System.out.println("Course Teaching: " + lecturer.getCourseTeaching());
        System.out.println("Course Name: " + course.getCourseName());
        System.out.println("Course Code: " + course.getCourseCode());
        System.out.println("Student Name: " + student.getStudentName());
        System.out.println("Degree Name: " + student.getDegreeName());
        System.out.println("Course Following: " + student.getCourseFollowing());
    }




}