package upol.collections;

/*

- ArrayList: Resizable array implementation of the List interface. It provides constant time O(1) performance for most operations like adding, removing and getting elements.
- LinkedList: Doubly linked list implementation of the List interface. It is better suited for frequent insertions and deletions, but has poor random access performance.
- Vector: Synchronized version of ArrayList. It provides thread-safety, but is relatively slower compared to ArrayList.
- Stack: Subclass of Vector that implements a LIFO (last-in-first-out) stack.
- CopyOnWriteArrayList: Thread-safe implementation of the List interface. It creates a new copy of the underlying array every time an element is added, modified, or removed, which makes it expensive for large lists but provides high concurrency and thread safety.
- ImmutableList: An immutable implementation of List interface. It doesn't allow any modifications to the list once it has been created.

*/

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListRunner {

  public static void main(String[] args) {
    final List<String> cat = List.of("Cat", "Bat", "Rat");
    final List<String> animals = new ArrayList<>();
    final List<String> animalsVector = new Vector<>();
    final List<String> animalsLinkedList = new LinkedList<>();
  }

}
