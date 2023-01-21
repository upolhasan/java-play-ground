package upol.rxjava;

import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableEmitter;
import io.reactivex.rxjava3.core.ObservableOnSubscribe;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.operators.observable.ObservableCreate;

public class ObservableAndObserver {

  public static void main(String[] args) {

    Observable<Integer> source = new ObservableCreate<Integer>(new ObservableOnSubscribe<Integer>() {
      @Override
      public void subscribe(@NonNull ObservableEmitter<Integer> emitter) throws Throwable {
        try {
          emitter.onNext(10);
          emitter.onNext(17);
          emitter.onComplete();
        } catch (Throwable t) {
          emitter.onError(t);
        }
      }
    });

    Observer<Integer> observer = new Observer<Integer>() {
      @Override
      public void onSubscribe(@NonNull Disposable d) {
        System.out.println("Call from OnSubscribe");
      }

      @Override
      public void onNext(@NonNull Integer integer) {
        System.out.println("Call from onNext " + integer);
      }

      @Override
      public void onError(@NonNull Throwable e) {
        e.printStackTrace();

      }

      @Override
      public void onComplete() {
        System.out.println("Completed!");
      }
    };

    source.subscribe(observer);

  }

}
