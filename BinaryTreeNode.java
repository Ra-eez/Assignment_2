// Slightly changed version of Hussein Suleman's Binary Tree
// 03 April 2017
// Moegamat Ra-eez Stenekamp
package cs2001f.assignment.pkg2;

public class BinaryTreeNode<dataType>
{
   String data;
   String key;
   BinaryTreeNode<dataType> left;
   BinaryTreeNode<dataType> right;
   int height;
   
   public BinaryTreeNode ( String k, String d, BinaryTreeNode<dataType> l, BinaryTreeNode<dataType> r )
   {
      key = k;
      data = d;
      left = l;
      right = r;
      height = 0;
   }
 
   BinaryTreeNode<dataType> getLeft () { return left; }
   BinaryTreeNode<dataType> getRight () { return right; }
}
