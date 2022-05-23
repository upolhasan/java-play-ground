package upol.functraining.streamstuff;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class UseOptional {
  public static void main(String[] args) {
    Map<String, String> names = new HashMap<>();
    names.put("Fred", "Jones");
    String firstName = "Fred";

    String lastName = names.get(firstName);
    if (lastName != null) {
      String message = "Dear " + lastName.toUpperCase();
      System.out.println(message);
    }


    Optional.of(names)
        .map(m -> m.get(firstName))
        .map(l -> l.toUpperCase())
        .map(l -> "Dear " + l)
        .ifPresent(System.out::println);
  }
}