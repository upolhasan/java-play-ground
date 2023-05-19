package upol.leetcode.easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class NaryPOTraversalIterative {

  public List<Integer> preOrder(Node root) {

    List<Integer> output = new ArrayList<>();

    if ( root == null ) return output;
    Stack<Node> nodeStack = new Stack<>();

    nodeStack.push(root);

    while (!nodeStack.isEmpty()){
      Node current = nodeStack.pop();
      output.add(current.val);
      if ( current != null && current.children != null && ! current.children.isEmpty() ) {
        for (int i = current.children.size() - 1; i >= 0; i--) {
          nodeStack.push(current.children.get(i));
        }
      }
    }
    return output;
  }

}
