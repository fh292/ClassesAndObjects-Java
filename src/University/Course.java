package University;
//Create a Java Class for Course:
public class Course {

    //Add Course Properties:
    String courseName;
    String instructor;
    int numberOfStudents;

    //Create a Constructor for the Course Class:
    Course(String courseName, String instructor, int numberOfStudents) {
        this.courseName = courseName;
        this.instructor = instructor;
        this.numberOfStudents = numberOfStudents;
    }

    //Implement Getters and Setters
    public String getCourseName() {
        return courseName;
    }
    public void setCourseName(String newCourseName) {
        courseName = newCourseName;
    }

    public String getInstructor() {
        return instructor;
    }
    public void setInstructor(String newInstructor) {
        instructor = newInstructor;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }
    public void setNumberOfStudents(int newNumberOfStudents) {
        numberOfStudents = newNumberOfStudents;
    }

    //Override the toString Method:
    public String toString() {
        return "Course Name: "+ courseName + ", Instructor: " + instructor + ", Number of Students: " + numberOfStudents;
    }

}
