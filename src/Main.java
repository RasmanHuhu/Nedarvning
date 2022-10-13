import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Person> person = new ArrayList<>();
        ArrayList<String> courses = new ArrayList<>();
        ArrayList<String> courses2 = new ArrayList<>();
        courses.add("Java 1.0");
        courses2.add("Philosophy");

            //Gemmer disse objekter i arraylisten ovenover
        person.add(new Student("Rasmus", courses));
        person.add(new Student("Nicolaj", courses));
        person.add(new Teacher("Signe", courses2));
        person.add(new Teacher("Tess", courses));

        for (Person p : person) {
            p.AddCourse("Java 1.0");
            //p.AddCourse("Philosophy");
        }
    }
}