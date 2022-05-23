package upol.functraining.streamstuff;



import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;
import upol.functraining.superiterable.Student;

public class Lab1Solution {
  public static void main(String[] args) {
//Take a list of student
    List<Student> roster = Arrays.asList(
        Student.of("Fred", 3.4, "Math", "Physics"),
        Student.of("Jim", 2.8, "Art"),
        Student.of("Sheila", 3.8, "Math", "Physics", "Astrophysics", "Quantum Mechanics")
    );
//drawing streams (each time)
//- print all students
    roster.stream()
        .forEach(System.out::println);
    System.out.println("--------------------------");
//- print names of all students
    roster.stream()
//        .map(s -> s.getName())
        .map(Student::getName)
        .forEach(System.out::println);
    System.out.println("--------------------------");
//- print name has grade grade for all "smart" students
    roster.stream()
        .filter(s -> s.getGpa() > 3)
        .map(s -> s.getName() + " has grade " + s.getGpa())
        .forEach(System.out::println);
    System.out.println("--------------------------");
//- print all courses taken by all students
    roster.stream()
        .flatMap(s -> s.getCourses().stream())
        .forEach(System.out::println);
    System.out.println("--------------------------");
//- CHECK API for Stream
//- print all the courses, with no duplicates
    roster.stream()
        .flatMap(s -> s.getCourses().stream())
        .distinct()
        .forEach(System.out::println);
    System.out.println("--------------------------");
//- print all the courses in alphabetical order (no duplicates)
    roster.stream()
        .flatMap(s -> s.getCourses().stream())
        .distinct()
        .sorted()
        .forEach(System.out::println);
    System.out.println("--------------------------");
//- print "name takes course" for every student course pair
    Function<Student, Stream<String>> getStudentCoursePairs =
        s -> s.getCourses().stream().map(c -> s.getName() + " takes " + c);
    roster.stream()
        .flatMap(getStudentCoursePairs)
        .forEach(System.out::println);
    System.out.println("--------------------------");
  }
}