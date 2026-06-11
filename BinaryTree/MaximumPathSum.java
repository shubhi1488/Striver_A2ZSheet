package BinaryTree;
import java.util.*;
public class MaximumPathSum {
    private static int maxPathDown(TreeNode root,int[] maxValue){
        if(root==null) return 0;
        int left=Math.max(0,maxPathDown(root.left,maxValue));
        int right=Math.max(0,maxPathDown(root.right,maxValue));
        maxValue[0]=Math.max(maxValue[0],left+right+root.data);
        return Math.max(left,right)+(root.data);
    }
    public static int maxPath(TreeNode root){
        int[] maxValue=new int[1];
        maxValue[0]=Integer.MIN_VALUE;
        maxPathDown(root,maxValue);
        return maxValue[0];
    }
    public static void main(String[] args){
        TreeNode root=new TreeNode(-10);
        root.left=new TreeNode(9);
        root.right=new TreeNode(20);
        root.right.left=new TreeNode(15);
        root.right.right=new TreeNode(7);
        int maxPathSum=maxPath(root);
        System.out.println("Maximum Path sum:"+maxPathSum);
    }
}
