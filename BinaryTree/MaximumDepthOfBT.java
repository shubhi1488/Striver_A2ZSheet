package BinaryTree;
import java.util.*;
public class MaximumDepthOfBT {
    public static int maxDepth(TreeNode root){
        if(root==null) return 0;
        int lh=maxDepth(root.left);
        int rh=maxDepth(root.right);
        return 1+Math.max(lh,rh);
    }
    public static void main(String[] args){
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(3);
        root.right.left=new TreeNode(4);
        root.right.right=new TreeNode(6);
        root.right.left.left=new TreeNode(5);
        int depth=maxDepth(root);
        System.out.println("Macimum height of the binary tree is:"+depth);
    }
}
