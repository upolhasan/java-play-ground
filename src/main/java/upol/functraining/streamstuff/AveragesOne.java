package upol.functraining.streamstuff;

import java.util.Optional;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

import java.util.Optional;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class Average {
  private double sum;
  private long count;
  // constructors, etc.

  public Average(double sum, long count) {
    this.sum = sum;
    this.count = count;
  }

  public Average(double sum) {
    this(sum, 1);
  }

  public double getSum() {
    return sum;
  }

  public long getCount() {
    return count;
  }

  public Average include(double d) {
    return new Average(this.sum + d, this.count + 1);
  }

  public Average merge(Average other) {
    return new Average(this.sum + other.sum, this.count + other.count);
  }

  public Optional<Double> get() {
    System.out.println("called Average.get()");
    if (count > 0) {
      return Optional.of(sum / count);
    } else {
      return Optional.empty();
    }
  }

  @Override
  public String toString() {
    return "Average{" +
        "sum=" + sum +
        ", count=" + count +
        '}';
  }
}
public class AveragesOne {
  /*
  create an "infinite" stream of numbers, 1, 2, ... 10
  chop stream off after 10 items
  add them up, and print the result (sum should be 55)
  hand up at this point!!!
  build an Average class (with sum and count)
  generate a stream of double values, in the range -PI to +PI
  ... ??? we want to "reduce" averages, how do we get to them?
  reduce to a single average for a finite segment of your dataset.
   */

  public static void main(String[] args) {
//    int [] count = { 1 };
//    IntStream.iterate(1, x -> x + 1)
//    IntStream.generate(() -> count[0]++)
    IntStream.range(1, 11)
//        .limit(10)
        .forEach(System.out::println);


    System.out.println("-----------------------------");
    // stream of random doubles.
//    Stream.generate(() -> Math.random() * 2 * Math.PI - Math.PI)
//        .map(d -> new Average(d))
    DoubleStream.generate(() -> Math.random() * 2 * Math.PI - Math.PI)
        .limit(0)
        .mapToObj(d -> new Average(d))
        .reduce(new Average(0, 0), Average::merge)
        .get()
        .ifPresent(System.out::println);
//        .reduce(new Average(0, 0), (a1, a2) -> a1.merge(a2));
//        .reduce(new Average(0, 0), (a1, a2) -> new Average(a1.getSum() + a2.getSum(), a1.getCount() + a2.getCount()));
//        .forEach(System.out::println);
    System.out.println("-----------------------------");
    DoubleStream.generate(() -> Math.random() * 2 * Math.PI - Math.PI)
        .limit(10_000)
        .mapToObj(d -> new Average(d))
        .reduce(Average::merge)
        .ifPresent(a -> System.out.println("The average is " + a.get().get()));

  }
}