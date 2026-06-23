package BinaryTree;
import java.util.*;
public class LCAInBT {
    public static TreeNode lca(TreeNode root,TreeNode p,TreeNode q){
        if(root==null || root==p || root==q) return root;
        TreeNode left=lca(root.left,p,q);
        TreeNode right=lca(root.right,p,q);
        if(left==null) return right;
        else if(right==null) return left;
        else return root;
    }
    public static void main(String[] args){
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(3);
        root.right.left=new TreeNode(4);
        root.right.right=new TreeNode(5);
        root.right.left.left=new TreeNode(8);
        root.right.right.left=new TreeNode(6);
        root.right.right.right=new TreeNode(7);
        TreeNode p=root.right.right.right;
        TreeNode q=root.right.left.left;
        TreeNode lca=lca(root,p,q);
        System.out.println("LCA:"+lca.data);
    }
}
