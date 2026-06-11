package BinaryTree;
import java.util.*;
public class BalancedBT {
    private static int check(TreeNode root){
        if(root==null) return 0;
        int lh=check(root.left);
        if(lh==-1) return -1;
        int rh=check(root.right);
        if(rh==-1) return -1;
        if(Math.abs(lh-rh)>1) return -1;
        return Math.max(lh,rh)+1;
    }
    public static boolean isBalanced(TreeNode root){
        return check(root)!=-1;
    }
    public static void main(String[] args){
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(4);
        root.left.left=new TreeNode(3);
        root.left.left.left=new TreeNode(9);
        root.right.left=new TreeNode(5);
        root.right.right=new TreeNode(6);
        root.right.right.right=new TreeNode(7);
        root.right.right.right.right=new TreeNode(8);
        if(isBalanced(root)){
            System.out.println("Binary Tree is Balanaced");
        }
        else{
            System.out.println("Binary tree is not balanced");
        }

    }
}
