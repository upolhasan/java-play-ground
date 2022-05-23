package upol.functraining.collectors;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import upol.functraining.Student;

public class Ex1 {
  public static String getLetterGrade(Student s) {
    double gpa = s.getGpa();
    if (gpa > 3.6) return "A";
    if (gpa > 3.2) return "B";
    return "D";
  }
  public static void main(String[] args) {
    List<Student> roster = Arrays.asList(
        Student.of("Fred", 3.4, "Math", "Physics"),
        Student.of("Jim", 2.8, "Art"),
        Student.of("Jimmy", 2.8, "Art"),
        Student.of("James", 2.8, "Art"),
        Student.of("Sheila", 3.8, "Math", "Physics", "Astrophysics", "Quantum Mechanics")
    );

    Map<String, Long> map = roster.stream()
        .collect(Collectors.groupingBy(s -> getLetterGrade(s),
            Collectors.counting()));

    map.entrySet().stream()
        .forEach(e -> System.out.println("Students with grade " + e. getKey()
        + " : number " + e.getValue()));

    System.out.println("-----------------");
    roster.stream()
        .collect(Collectors.groupingBy(s -> getLetterGrade(s),
            Collectors.mapping(s -> s.getName(),
                Collectors.joining(", "))))
        .entrySet().stream()
        .forEach(e -> System.out.println("Students with grade " + e. getKey()
            + " : " + e.getValue()));
  }
}