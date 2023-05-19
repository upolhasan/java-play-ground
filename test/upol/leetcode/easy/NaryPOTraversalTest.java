package upol.leetcode.easy;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class NaryPOTraversalTest {

  NaryPOTraversal naryPOTraversal;
  @BeforeEach
  void setup(){

    naryPOTraversal = new NaryPOTraversal();
  }

  @Test
  void test1(){
//
//            1
//          / |  \
//        2    3   4
//          /    \
//          5     6
//

    Node node6 = new Node(6);
    Node node5 = new Node(5);
    Node node4 = new Node(4);
    Node node3 = new Node(3, Arrays.asList(node5, node6));
    Node node2 = new Node(2);
    Node node1 = new Node(1, Arrays.asList(node2, node3, node4));

    List<Integer> expected =Arrays.asList(1,2,3,5,6,4);
    assertIterableEquals(expected, naryPOTraversal.preOrderTraverse(node1) );

  }

}