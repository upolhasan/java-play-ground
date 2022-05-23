package upol.functraining.superiterable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;


public class School {

//  public static <E> void showAll(Iterable<E> ls) {
//    for (E s : ls) {
//      System.out.println("> " + s);
//    }
//  }

  public static <E> void forEach(Iterable<E> ls, Consumer<E> op) {
    for (E s : ls) {
      op.accept(s);
    }
  }

  public static <E> List<E> filter(Iterable<E> ls, Predicate<E> crit) {
    List<E> rv = new ArrayList<>();
    for (E s : ls) {
      if (crit.test(s)) {
        rv.add(s);
      }
    }
    return rv;
  }

  public static void main(String[] args) {
    List<Student> roster = Arrays.asList(
        Student.of("Fred", 3.4, "Math", "Physics"),
        Student.of("Jim", 2.8, "Art"),
        Student.of("Sheila", 3.8, "Math", "Physics", "Astrophysics", "Quantum Mechanics")
    );

//    forEach(filter(roster, s -> s.getGpa() > 3), s -> System.out.println("Gosh, the item is " + s));
    filter(roster, s -> s.getGpa() > 3)
        .forEach(s -> System.out.println("Gosh, the item is " + s));

    SuperIterable<Student> sis = new SuperIterable<>(roster);

    System.out.println("---------------------------");
    sis
        .filter(s -> s.getGpa() > 3)
        .map(s -> "> " + s.getName() + " scored " + s.getGpa())
        .forEach(System.out::println);
//        .forEach(s -> System.out.println("> " + s));
//    for(Student s : sis) {
//      System.out.println(">> " + s);
//    }

    System.out.println("---------------------------");
    SuperIterable<String> sistr = new SuperIterable<>(Arrays.asList("Fred", "Jim", "Sheila"));
    sistr
        .filter(s -> s.length() > 3)
        .forEach(System.out::println);

/*
  1) create superiterable with student data
  For every solution, start with theSuperIterable...
  end with .forEach(System.out::println)
  2) print students
  3) print names of all students with their grades
  4) print name+grade of all students with gpa < 3.5
  5) create a superiterable containing Strings
  6) print all long strings
  7) print all short strings in upper case
 */
    System.out.println("---------------------------");
    sis
        .flatMap(s -> new SuperIterable<>(s.getCourses()))
        .forEach(System.out::println);
  }
}
