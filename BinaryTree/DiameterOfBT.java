package BinaryTree;
import java.util.*;
public class DiameterOfBT {
    private static int height(TreeNode root,int[] diameter){
        if(root==null) return 0;
        int lh=height(root.left,diameter);
        int rh=height(root.right,diameter);
        diameter[0]=Math.max(diameter[0],lh+rh);
        return 1+Math.max(lh,rh);
    }
    public static int findDiameter(TreeNode root){
        int[] diameter=new int[1];
        height(root,diameter);
        return diameter[0];
    }
    public static void main(String[] args){
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(3);
        root.right.left=new TreeNode(4);
        root.right.left.left=new TreeNode(5);
        root.right.left.left.left=new TreeNode(9);
        root.right.right=new TreeNode(6);
        root.right.right.right=new TreeNode(7);
        root.right.right.right.right=new TreeNode(8);
        System.out.println("diameter of binary tree:"+findDiameter(root));
    }
}
