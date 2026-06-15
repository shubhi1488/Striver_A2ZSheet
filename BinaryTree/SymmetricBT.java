package BinaryTree;
import java.util.*;
public class SymmetricBT {
    private static boolean isSymmetricHelp(TreeNode left,TreeNode right){
        if(left==null || right==null) return (left==right);
        if(left.data!=right.data) return false;
        return isSymmetricHelp(left.left,right.right) && isSymmetricHelp(left.right,right.left);
    }
    public static boolean isSymmetric(TreeNode root){
        return root==null || isSymmetricHelp(root.left,root.right);
    }
    public static void main(String[] args){
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(2);
        root.left.left=new TreeNode(3);
        root.left.right=new TreeNode(4);
        root.right.left=new TreeNode(4);
        root.right.right=new TreeNode(3);
        System.out.println("Tree is Symmetric or not:"+isSymmetric(root));
    }
}
