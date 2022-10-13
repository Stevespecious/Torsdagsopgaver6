import java.util.ArrayList;
public class Student extends Person {
    private final ArrayList<String> passedCourses;
    private final ArrayList<String> currentCourses;
    public Student(String name, ArrayList<String> passedCourses) {
        super(name);
        this.currentCourses = new ArrayList<>();
        this.passedCourses = passedCourses;
    }
    @Override
    public boolean addCourse(String course) {
        if(passedCourses.contains(course)) {
            return false;
        }
        currentCourses.add(course);
        return true;
    }
}
