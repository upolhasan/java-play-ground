package upol.leetcode.easy;

public class SymmetricTree {

  /*

                1
            /     \
           2        2     => true
          / \     /   \
         3   4   4      3



                1
              /   \
             2      2     => false
              \       \
                3      3




   */




  public boolean isSymmetric(TreeNode root){

    if ( root.left == null && root.right == null ) return true;



    return false;
  }

//  private boolean helper(TreeNode root){
//    if ( root == null ) return false;
//
//    if ( root)
//
//    return  false;
//
//  }

}
