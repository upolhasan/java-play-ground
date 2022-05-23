package upol.functraining.collectors;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PrideAndPrejudiceLab {
  /*
   * create a "concordance" for the book Pride And Prejudice
   * i.e. a table of word frequency
   * the : 4507
   * wickham : 194
   *
   * the most frequent 200 words in descending order of frequency
   *
   * Read the file. java.nio.file.Files -- read a file as a Stream<String>
   * separate into "words" (ignore "don't" 'don't she said') ...
   * java.util.regex.Pattern -- "\\W+" (capital W is "non word characters")
   * flatMap requires a function that returns STREAM
   * sometimes creates "" -- get rid of these :)
   * "assemble a map" word, number of occurences
   * the word IS the key... how can you create a "classifier" (key extractor)
   * that returns its own argument  ...  x -> x  Function.identity()
   * value must be the count of occurences, (not a list of the words).
   *
   * Map<String, Long> map.forEach((k, y) -> sout...)
   *
   * Hand up at this point!!!
   *
   * get a stream from the map???
   * order descending by value
   * chop off the first 200 entries
   * print them all nice and pretty.
   *
   */

  public static Stream<String> getFileAsStream(String fn) {
    try {
      return Files.lines(Paths.get(fn));
    } catch (IOException fnfe) {
//      throw new RuntimeException(fnfe);
      System.out.println("There was a problem");
      return Stream.empty();
    }
  }

  public static void main(String[] args) {

    Pattern pattern = Pattern.compile("\\W+");

   getFileAsStream("PrideAndPrejudice.txt")
        .flatMap(ln -> pattern.splitAsStream(ln))
       .map(String::toLowerCase)
        .filter(s -> !s.isEmpty())
        .collect(Collectors.groupingBy(s -> s, Collectors.counting()));
   // System.out.println(the);

  }

}