package upol.leetcode.easy;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

class IterativeInOrderTraversalTest {

  TreeNode root;
  IterativeInOrderTraversal traversal;

  @BeforeEach
  void setUp(){
    root = new TreeNode(1);
    traversal = new IterativeInOrderTraversal();
  }

  @Test
  public void testWith7Nodes(){

//            1
//        2       3
//      4   5   6   7
    // -> 4 2 5 1 6 3 7

    root.left = new TreeNode(2);
    root.right = new TreeNode(3);
    root.left.left = new TreeNode(4);
    root.left.right = new TreeNode(5);
    root.right.left = new TreeNode(6);
    root.right.right = new TreeNode(7);

    List<Integer> expected = new ArrayList<>(Arrays.asList(4,2,5,1,6,3,7));
    assertIterableEquals(expected, traversal.traverse(root));


  }

}