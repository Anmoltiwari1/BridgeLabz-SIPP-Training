public class Course {
    String courseName;
    int duration;  // in months
    double fee;
    static String instituteName = "GLA University";

    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    public void displayCourseDetails() {
        System.out.println("Course: " + courseName + ", Duration: " + duration + " months, Fee: ₹" + fee);
        System.out.println("Institute: " + instituteName);
    }

    public static void updateInstituteName(String name) {
        instituteName = name;
    }
}
