public class Student {

    String firstName;
    String lastName;
    int expectedGradYear;
    double studentGPA;
    String major;

    public Student(String firstName, String lastName, int expectedGradYear, double studentGPA, String major) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.expectedGradYear = expectedGradYear;
        this.studentGPA = studentGPA;
        this.major = major;
    }

    public int incrementExpectedGradYear(){
        return this.expectedGradYear = this.expectedGradYear + 1;
    }
}
