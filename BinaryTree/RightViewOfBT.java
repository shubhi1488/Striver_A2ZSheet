package BinaryTree;
import java.util.*;
public class RightViewOfBT {
    public static void rightView(TreeNode curr,List<Integer>result,int level){
        if(curr==null) return;
        if(level==result.size()){
            result.add(curr.data);
        }
        rightView(curr.right,result,level+1);
        rightView(curr.left,result,level+1);
    }
    public static List<Integer>rightSideView(TreeNode root){
        List<Integer> result=new ArrayList<>();
        rightView(root,result,0);
        return result;
    }
    public static void main(String[] args){
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(3);
        root.left.left=new TreeNode(4);
        root.left.right=new TreeNode(5);
        root.left.right.left=new TreeNode(6);
        root.right.right=new TreeNode(7);
        List<Integer> result=rightSideView(root);
        System.out.println("right side view:"+result);
    }
}
