package BinaryTree;
import java.util.*;
public class ZigZagTraversal {
    public static  List<List<Integer>> zigzagOrder(TreeNode root){
        List<List<Integer>> result=new ArrayList<>();
        if(root==null) return result;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        boolean flag=true;
        while(!q.isEmpty()){
            int size=q.size();
            List<Integer> row=new ArrayList<>(Collections.nCopies(size,0));
            for(int i=0;i<size;i++){
                TreeNode node=q.poll();
                int index=flag?i:(size-1-i);
                row.set(index,node.data);
                if(node.left!=null) q.add(node.left);
                if(node.right!=null) q.add(node.right);
            }
            flag=!flag;
            result.add(row);
        }
        return result;
    }
    public static void main(String[] args){
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(3);
        root.left.left=new TreeNode(4);
        root.left.right=new TreeNode(5);
        root.right.right=new TreeNode(6);
        List<List<Integer>>result=zigzagOrder(root);
        System.out.println(result);
    }
}
