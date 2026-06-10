package BinaryTree;


import java.util.*;
public class SameTree {
    public static boolean isSameTree(TreeNode p,TreeNode q){
        if(p==null || q==null) return (p==q);
        return (p.data==q.data) && isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
    }
    public static void main(String[] args){
        TreeNode p=new TreeNode(1);
        p.left=new TreeNode(2);
        p.right=new TreeNode(3);
        p.right.left=new TreeNode(4);
        p.right.right=new TreeNode(5);

        TreeNode q=new TreeNode(1);
        q.left=new TreeNode(2);
        q.right=new TreeNode(3);
        q.right.left=new TreeNode(4);
        q.right.right=new TreeNode(5);
        System.out.println("Both trees are same or not:"+isSameTree(p,q));
    }
}
