import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<>();
        ArrayList<String> canTeach = new ArrayList<>();
        canTeach.add("Java 1.0");
        canTeach.add("Programming");

        ArrayList<String> passedCourses = new ArrayList<>();
        passedCourses.add("Java 1.0");
        passedCourses.add("Programming");

        persons.add(new Student("Christian", passedCourses));
        persons.add(new Student("Simone", passedCourses));
        persons.add(new Student("Tobias", passedCourses));

        persons.add(new Teacher("Tess", new ArrayList<>()));
        persons.add(new Teacher("Tobias", canTeach));
        persons.add(new Teacher("Jesper", canTeach));

        for (Person p : persons) {
            if (!p.addCourse("Java 1.0")) {
                if (p instanceof Student) {
                    System.out.println(p.getName() + " has already passed this course.");
                } else {
                    System.out.println(p.getName() + " cant teach in this subject.");
                }
            }
        }
    }
}