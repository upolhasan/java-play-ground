package upol.leetcode.easy;

import java.util.List;

public class Node {
  // Definition for a Node.

    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
      val = _val;
    }

    public Node(int _val, List<Node> _children) {
      val = _val;
      children = _children;
    }

}
