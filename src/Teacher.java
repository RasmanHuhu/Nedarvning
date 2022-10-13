import java.util.ArrayList;

public class Teacher extends Person {

    public Teacher(String name, ArrayList<String> canTeach) {
        super(name);
        this.canTeach = canTeach;
    }

    ArrayList<String> canTeach;
    ArrayList<String> currentCourses;

    @Override
    public boolean AddCourse(String course) {
        for (String c : canTeach) {
            if (c.equalsIgnoreCase(course)) {
                System.out.println(name + " can't teach this course");
                currentCourses.add(course);
                return true;
            }

        }
        return false;
    }
}
