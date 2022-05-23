package upol.functraining;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import jdk.nashorn.internal.objects.annotations.Function;

@FunctionalInterface
interface CriterionOfStudent{
  boolean test (Student s);
}

class SmartStudent implements CriterionOfStudent{

  @Override
  public boolean test(Student s) {
    return s.getGpa() > 3.0;
  }
}

class EnthusiasticStudent implements CriterionOfStudent{

  @Override
  public boolean test(Student s) {
    return s.getCourses().size() > 2;
  }
}

public class School {
  /*
  create several students...
  - print all the students
  - print all the "smart" students
   */

  public static <E> void showAll( Iterable<E> ls){
    for (E s:ls
    ) {
      System.out.println("> " + s );
    }
  }

  // Gang of four design pattern: Command,
  // Functional programming one example of "Higher order Function"
public static List<Student> getByStudentsCriterion(Iterable<Student> students,
    Predicate<Student> criterionOfStudent){
    List<Student> studentList = new ArrayList<>();

    for (Student student: students){
      if (criterionOfStudent.test(student)){
        studentList.add(student);
      }
    }
    return studentList;
}

//  public static List<Student> getAllSmart(Iterable<Student> ls, double threshold) {
//    List<Student> rv = new ArrayList<>();
//    for (Student s : ls) {
//      if (s.getGpa() > threshold) {
//        rv.add(s);
//      }
//    }
//    return rv;
//  }
//
//  public static List<Student> getAllEnthusiastic(Iterable<Student> ls, int threshold) {
//    List<Student> rv = new ArrayList<>();
//    for (Student s : ls) {
//      if (s.getCourses().size() > threshold) {
//        rv.add(s);
//      }
//    }
//    return rv;
//  }

  public static void main(String[] args) {
    List<Student> roster = Arrays.asList(
        Student.of("Fred", 3.4, "Math", "Physics"),
        Student.of("Jim", 2.8, "Art"),
        Student.of("Sheila", 3.8, "Math", "Physics", "Astrophysics", "Quantum Mechanics"),
        Student.of("Steve", 3.6, "Math", "Physics"),
        Student.of("Shawn", 3.2, "Math", "English", "Chemistry")
    );

//    showAll(getAllSmart(roster, 3.0));
//    System.out.println("-------------------");
//    showAll(getAllEnthusiastic(roster, 2));
    //showAll(getByStudentsCriterion(roster, new SmartStudent()));
    //System.out.println("-------------------");
    //showAll(getByStudentsCriterion(roster, new EnthusiasticStudent()));
    System.out.println("--------- Smart Students ----------");
    showAll(getByStudentsCriterion(roster, (Student s) -> s.getGpa() > 3.0 ));
    System.out.println("------- Names greater than 5 characters ------------");
    showAll(getByStudentsCriterion(roster, (Student s) -> s.getName().length()>5 ));
    System.out.println("-------- Names starting with S -----------");
    showAll(getByStudentsCriterion(roster, (Student s) -> s.getName().startsWith("S") ));
    System.out.println("------ Names not starting with S -------------");
    showAll(getByStudentsCriterion(roster, (Student s) -> ! s.getName().startsWith("S") ));
    System.out.println("------- Enthusiastic students ------------");
    showAll(getByStudentsCriterion(roster, (Student s) -> s.getCourses().size() > 2 ));
  }
}