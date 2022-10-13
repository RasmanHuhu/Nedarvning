import java.util.ArrayList;

public class Student extends Person {

    public Student(String name, ArrayList<String> passedCourses) {
        super(name);
        this.passedCourses = passedCourses;
    }

    ArrayList<String> passedCourses;
    ArrayList<String> currentCourses;

    @Override
    public boolean AddCourse(String course) {
        for (String p : passedCourses) {
            if (p.equalsIgnoreCase(course)) {
                System.out.println(name + " has already passed this course");
                return false;
            }

        }
        currentCourses.add(course);
        System.out.println(name + " has been added to " + course);
        return true;
    }
}
