package BinaryTree;
import java.util.*;
public class ReverseLevelOrder {
    public static List<List<Integer>>reverseLevelOrder(TreeNode root){
        Queue<TreeNode>q=new LinkedList<>();
        List<List<Integer>>arr=new ArrayList<>();
        if(root==null) return arr;
        q.offer(root);
        while(!q.isEmpty()){
            int size=q.size();
            List<Integer>subList=new ArrayList<>();
            for(int i=0;i<size;i++){
                if(q.peek().left!=null){
                    q.offer(q.peek().left);
                }
                if(q.peek().right!=null){
                    q.offer(q.peek().right);
                }
                subList.add(q.poll().data);
            }
            arr.addFirst(subList);
        }
        return arr;


    }
    public static void main(String[] args){
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(3);
        root.left.left=new TreeNode(4);
        root.left.right=new TreeNode(5);
        root.right.left=new TreeNode(6);
        root.right.right=new TreeNode(7);
        System.out.println("Reverse Level Order:"+reverseLevelOrder(root));
    }
}
