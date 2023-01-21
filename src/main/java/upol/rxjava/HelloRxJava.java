package upol.rxjava;

import io.reactivex.rxjava3.core.Observable;
import java.util.List;

public class HelloRxJava {

  public static void main(String[] args) {

    Observable source = Observable.create(
        e -> {
          e.onNext("Hello");
          e.onNext("RxJava");
          e.onNext(100);
        }
    );

    source.subscribe(e -> System.out.println( "Observer 1 " + e));
    source.subscribe(e -> System.out.println( "Observer 2 " + e));

    // Create using just operator
  Observable<Integer> justObs = Observable.just(1, 2, 45);
  justObs.subscribe(System.out::println);

  // Create using fromIterable operator

    Observable<Integer> fromIterableObs = Observable.fromIterable(List.of(1,3,654, 7, 8));
    fromIterableObs.subscribe(System.out::println);

  }

}
