package upol.functraining;

import java.lang.reflect.Method;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class School2 {
  public static <E> void showAll(Iterable<E> ls) {
    for (E s : ls) {
      System.out.println("> " + s);
    }
  }

  // Build the factory of behaviours (combinators) - function calculate out of existing functions

  public static CriterionOfStudent negate( CriterionOfStudent crit){
    return s -> !crit.test(s);
  }

  public static CriterionOfStudent and (CriterionOfStudent first, CriterionOfStudent second){
    return s -> first.test(s) && second.test(s);
  }

  public static CriterionOfStudent or (CriterionOfStudent first, CriterionOfStudent second){
    return s -> first.test(s) || second.test(s);
  }


  public static List<Student> getAllByCriterion(Iterable<Student> ls, CriterionOfStudent crit) {
    List<Student> rv = new ArrayList<>();
    for (Student s : ls) {
      if (crit.test(s)) {
        rv.add(s);
      }
    }
    return rv;
  }

  public static void main(String[] args) {
    List<Student> roster = Arrays.asList(
        Student.of("Fred", 3.4, "Math", "Physics", "Chemistry"),
        Student.of("Jim", 2.8, "Art"),
        Student.of("Sheila", 3.8, "Math", "Physics", "Astrophysics", "Quantum Mechanics")
    );

    System.out.println("more smart than two----------------------");
    showAll(getAllByCriterion(roster, Student.getSmartCriterion(2.0) ));
    System.out.println("more smart than 3.0----------------------");
    showAll(getAllByCriterion(roster, Student.getSmartCriterion(3.0) ));
    System.out.println("more smart than 3.5----------------------");
    showAll(getAllByCriterion(roster, Student.getSmartCriterion(3.5) ));
    System.out.println("Less smart than 3.5----------------------");
    showAll(getAllByCriterion(roster, Student.getLessSmartCriterion(3.5) ));
    System.out.println("Enthusiastic Students----------------------");
    showAll(getAllByCriterion(roster, Student.getEnthusiasticCriterion(0) ));


    // Combinators
    System.out.println("-------- Combinators -------------------");
    System.out.println("-------- Students not smart than the current criterion -------------------");
    showAll(getAllByCriterion(roster, negate(Student.getSmartCriterion(3.5) )));
    System.out.println("----- Smart and enthusiastic ----------------------");
    showAll(getAllByCriterion(roster, and(Student.getSmartCriterion(3.5), Student.getEnthusiasticCriterion(2) )));
    System.out.println("----- Smart or enthusiastic ----------------------");
    showAll(getAllByCriterion(roster, or(Student.getSmartCriterion(3.5), Student.getEnthusiasticCriterion(0) )));
  }
}
