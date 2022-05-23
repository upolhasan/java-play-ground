package upol.functraining.superiterable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class SuperIterable<E> implements Iterable<E> {
  private Iterable<E> self;
  public SuperIterable(Iterable<E> self) {
    this.self = self;
  }

//  public void forEach(@Deprecated SuperIterable<E> this, Consumer<E> op) {
//  public void forEach(SuperIterable<E> this, Consumer<E> op) {
//    for (E s : this.self) {
//      op.accept(s);
//    }
//  }

  public SuperIterable<E> filter(SuperIterable<E> this, Predicate<E> crit) {
    List<E> rv = new ArrayList<>();
    for (E s : this.self) {
      if (crit.test(s)) {
        rv.add(s);
      }
    }
    return new SuperIterable<>(rv);
  }

  public <F> SuperIterable<F> map(SuperIterable<E> this, Function<E, F> op) {
    List<F> rv = new ArrayList<>();
//    for (E e : this.self) {
//      F f = op.apply(e);
//      rv.add(f);
//    }
    self.forEach(e -> rv.add(op.apply(e)));
    return new SuperIterable<>(rv);
  }

  public <F> SuperIterable<F> flatMap(SuperIterable<E> this, Function<E, SuperIterable<F>> op) {
    List<F> rv = new ArrayList<>();
//    for (E e : this.self) {
//      SuperIterable<F> manyf = op.apply(e);
//      for (F f : manyf) {
//        rv.add(f);
//      }
//    }
    self.forEach(e -> op.apply(e).forEach(f -> rv.add(f)) );
    return new SuperIterable<>(rv);
  }

  @Override
  public Iterator<E> iterator() {
    return self.iterator();
  }
}