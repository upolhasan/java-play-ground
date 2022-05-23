package upol.functraining;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Student {
  /*
  represent a student with name, grade (double gpa),
  courseS currently being taken : STRING!!!
   */
  private String name;
  private double gpa;
  private List<String> courses;

  private Student() {}

  private Student(String name, double gpa, List<String> ls) {
    this.name = name;
    this.gpa = gpa;
    //this.courses = List.copyOf(ls); // creates (or reuses!!!) an unmodifiable (Java 10+)
    this.courses = Collections.unmodifiableList(new ArrayList<>(ls));
  }

  public static Student of(String name, double gpa, String ... courses) {
    return new Student(name, gpa, Collections.unmodifiableList(new ArrayList<>(Arrays.asList((courses)))));
//    Student self = new Student();
//    // validate!!!
//    self.name = name;
//    self.gpa = gpa;
////    self.courses = Collections.unmodifiableList(new ArrayList<>(Arrays.asList(courses)));
//    self.courses = List.of(courses);
//    return self;
  }

  public static CriterionOfStudent getSmartCriterion(double v) {
    return (s) -> s.getGpa() > v;
  }

  public static CriterionOfStudent getLessSmartCriterion(double val){
    return s -> s.getGpa() < val;
  }

  public static CriterionOfStudent getEnthusiasticCriterion(int numOfCourses) {
    return s -> s.getCourses().size() > numOfCourses;
  }

  public String getName() {
    return name;
  }

  public double getGpa() {
    return gpa;
  }

  public List<String> getCourses() {
    return courses; // underlying courses is now unmodifiable / immutable
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
