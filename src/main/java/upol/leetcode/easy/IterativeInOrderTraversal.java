package upol.leetcode.easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

//      1
//  2      3
//4   5  7   8

public class IterativeInOrderTraversal {

  public List<Integer> traverse(TreeNode root){
    List<Integer> result = new ArrayList<>();
    Stack<TreeNode> unprocessed = new Stack<>();
    TreeNode current = root;

    while( current != null || !unprocessed.isEmpty() ){

      while (current!=null){
          unprocessed.push(current);
          current = current.left;
      }
      current = unprocessed.pop();
      result.add(current.val);
      current = current.right;
    }

    return result;
  }

}
