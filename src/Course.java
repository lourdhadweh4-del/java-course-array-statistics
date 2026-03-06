public class Course {

    String courseName;
    int credits;

    public Course(String courseName, int credits) {
        this.courseName = courseName;
        this.credits = credits;

        }

    void displayCourseInfo() {
        System.out.println("Course Name: "+ courseName);
        System.out.println("Credits for this course: "+ credits);

    }
}
