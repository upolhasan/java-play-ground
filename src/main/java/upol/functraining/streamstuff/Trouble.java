package upol.functraining.streamstuff;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Stream;

interface ExFunction<A, R> {
  R apply(A a) throws Throwable;
  static <A, R> Function<A, Optional<R>> wrap(ExFunction<A, R> op) {
    return a -> {
      try {
        return Optional.of(op.apply(a));
      } catch (Throwable throwable) {
        return Optional.empty();
      }
    };
  }
}

public class Trouble {

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
    Stream.of("a.txt", "b.txt", "c.txt")
        .flatMap(fn -> getFileAsStream(fn))

//        .map(ExFunction.wrap(fn -> Files.lines(Paths.get(fn))))
//        .peek(opt -> { if (!opt.isPresent()) System.out.println("Oops, file problem");})
//        .filter(Optional::isPresent)
//        .flatMap(Optional::get)

        .forEach(System.out::println);

    // map method?? "Functor"
    // flatMap method?? "Monad"
  }
}