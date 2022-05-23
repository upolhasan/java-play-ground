package upol.functraining.streamstuff;

import java.util.concurrent.ThreadLocalRandom;

public class ParallelAverage {
  public static void main(String[] args) {
    long start = System.nanoTime();
    ThreadLocalRandom.current().doubles(4_000_000_000L, -Math.PI, +Math.PI)
        .parallel()
        .boxed()
        .reduce(new Average(0, 0), (a, d) -> a.include(d), (a1, a2) -> a1.merge(a2))
        .get()
        .ifPresent(v -> System.out.println("Average is " + v));
    long time = System.nanoTime() - start;
    System.out.println("Time was " + (time / 1_000_000_000.0));
  }
}
