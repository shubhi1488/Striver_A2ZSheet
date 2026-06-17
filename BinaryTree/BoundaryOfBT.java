package BinaryTree;
import java.util.*;
public class BoundaryOfBT {
    private static boolean isLead(TreeNode root){
        return root.left==null && root.right==null;
    }
    private static void addLeftBoundary(TreeNode root,List<Integer> res){
        TreeNode curr=root.left;
        while(curr!=null){
            if(isLead(curr)==false) res.add(curr.data);
            if(curr.left!=null) curr=curr.left;
            else curr=curr.right;
        }
    }
    private static void addRightBoundary(TreeNode root,List<Integer> res){
        TreeNode curr=root.right;
        List<Integer> tmp=new ArrayList<>();
        while(curr!=null){
            if(isLead(curr)==false) tmp.add(curr.data);
            if (curr.right!=null) curr=curr.right;
            else curr=curr.left;

        }
        for(int i=tmp.size()-1;i>=0;--i){
            res.add(tmp.get(i));
        }
    }
    private static void addLeaves(TreeNode root,List<Integer> res){
        if(isLead(root)) {
            res.add(root.data);
            return;
        }
        if (root.left!=null) addLeaves(root.left,res);
        if(root.right!=null) addLeaves(root.right,res);

    }
    public static List<Integer>printBoundary(TreeNode root){
        List<Integer> ans=new ArrayList<>();
        if (isLead(root)==false) ans.add(root.data);
        addLeftBoundary(root,ans);
        addLeaves(root,ans);
        addRightBoundary(root,ans);
        return ans;
    }
    public static void printResult(List<Integer> result) {
        for (int val : result) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.left.left=new TreeNode(3);
        root.left.left.right=new TreeNode(4);
        root.left.left.right.left=new TreeNode(5);
        root.left.left.right.right=new TreeNode(6);
        root.right=new TreeNode(7);
        root.right.right=new TreeNode(8);
        root.right.right.left=new TreeNode(9);
        root.right.right.left.left=new TreeNode(10);
        root.right.right.left.right=new TreeNode(11);
        List<Integer> boundary=printBoundary(root);
        System.out.println("Boundary value traversal:");
        printResult(boundary);

    }

}
