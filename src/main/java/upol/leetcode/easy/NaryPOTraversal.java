package upol.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class NaryPOTraversal {

  public List<Integer> preOrderTraverse( Node root ){

    List<Integer> output = new ArrayList<>();
    traverse(root, output);
    return output;

  }

  private void traverse(Node root, List<Integer> output) {

    if ( root == null ) return;;
    output.add(root.val);

    for (int i=0; root.children != null &&i < root.children.size(); i++){
      traverse(root.children.get(i), output);
    }
  }

}
