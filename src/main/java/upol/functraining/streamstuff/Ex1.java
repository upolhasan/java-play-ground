package upol.functraining.streamstuff;

import java.util.Arrays;
import java.util.List;
import upol.functraining.superiterable.Student;

public class Ex1 {

  public static void main(String[] args) {

    List<Student> roster = Arrays.asList(
        Student.of("Fred", 3.4, "Math", "Physics", "Chemistry"),
        Student.of("Jim", 2.8, "Art"),
        Student
            .of("Sheila", 3.8, "Math", "Physics", "Astrophysics", "Quantum Mechanics")
    );

    // SuperIterable<Student> students = new SuperIterable<>(roster);

    // print all students
    System.out.println("================");
    roster.stream().forEach(System.out::println);
    // print names of all students
    System.out.println("================");
    roster.stream().map(Student::getName).forEach(System.out::println);
    //print name has grade for all "smart" students
    System.out.println("================");
    roster.stream().filter(student -> student.getGpa() > 3.0).map(Student::getName).forEach(
        System.out::println);
    //print all courses taken by all students
    System.out.println("================");
    //roster.stream().flatMap(student -> student.getCourses().stream()).forEach(System.out::println);

  }

}
