package upol.functraining.superiterable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Student {

  private String name;
  private double gpa;
  private List<String> courses;

  private Student() {}

  private Student(String name, double gpa, List<String> ls) {
    this.name = name;
    this.gpa = gpa;
    //this.courses = List.copyOf(ls); // creates (or reuses!!!) an unmodifiable (Java 10+)
    Collections.unmodifiableList(new ArrayList<>(ls));
  }

  public static Student of(String name, double gpa, String ... courses) {
    return new Student(name, gpa, Collections.unmodifiableList(new ArrayList<>(Arrays.asList((courses)))));
  }

  public String getName() {
    return name;
  }

  public double getGpa() {
    return gpa;
  }

  public List<String> getCourses() {
    return courses;
  }

  public Student withCourse(String course) {
    List<String> newCourses = new ArrayList<>(courses);
    newCourses.add(course);
    return new Student(name, gpa, newCourses);
  }

  @Override
  public String toString() {
    return "Student{" +
        "name='" + name + '\'' +
        ", gpa=" + gpa +
        ", courses=" + courses +
        '}';
  }
}
