package BinaryTree;
import java.util.*;
public class AverageOfLevels {
    public static List<Double> averageOfLevels(TreeNode root){
        Queue<TreeNode> q=new LinkedList<>();
        List<Double> arr=new ArrayList<>();
        if(root==null) return arr;
        q.offer(root);
        while(!q.isEmpty()){
            int size=q.size();
            long sum=0;
            for(int i=0;i<size;i++){
                TreeNode curr=q.poll();
                sum+=curr.data;
                if(curr.left!=null){
                    q.offer(curr.left);
                }
                if(curr.right!=null){
                    q.offer(curr.right);
                }
            }
            arr.add((double)sum/size);
        }
        return arr;
    }
    public static void main(String[] args){
        TreeNode root=new TreeNode(3);
        root.left=new TreeNode(9);
        root.right=new TreeNode(20);
        root.right.left=new TreeNode(15);
        root.right.right=new TreeNode(7);
        System.out.println("Average of levels:"+averageOfLevels(root));
    }
}
