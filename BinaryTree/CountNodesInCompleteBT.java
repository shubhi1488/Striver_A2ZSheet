package BinaryTree;
import java.util.*;
public class CountNodesInCompleteBT {
    public static int countNodes(TreeNode root){
        if(root==null) return 0;
        int left=getHeightLeft(root);
        int right=getHeightRight(root);
        if(left==right) return ((2<<(left))-1);
        else return countNodes(root.left)+countNodes(root.right)+1;
    }
    public static int getHeightLeft(TreeNode root){
        int count=0;
        while(root.left!=null){
            count++;
            root=root.left;
        }
        return count;
    }
    public static int getHeightRight(TreeNode root){
        int count=0;
        while(root.right!=null){
            count++;
            root=root.right;
        }
        return count;
    }
    public static void main(String[] args){
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(3);
        root.left.left=new TreeNode(4);
        root.left.right=new TreeNode(5);
        root.right.left=new TreeNode(6);
        root.right.right=new TreeNode(7);
        int nodes=countNodes(root);
        System.out.println("total number of nodes are:"+nodes);
    }
}
