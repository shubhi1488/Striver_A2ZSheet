package BinaryTree;
import java.util.*;
public class MaximumWidthOfBT {
    static class Pair{
        TreeNode node;
        int num;
        public Pair(TreeNode _node,int _num){
            this.node=_node;
            this.num=_num;
        }
    }
    public static int width(TreeNode root){
        if(root==null) return 0;
        int ans=0;
        Queue<Pair> q=new LinkedList<>();
        q.offer(new Pair(root,0));
        while(!q.isEmpty()){
            int size=q.size();
            int nmin=q.peek().num;
            int first=0,last=0;
            for(int i=0;i<size;i++){
                int curr_id=q.peek().num-nmin;
                TreeNode node=q.peek().node;
                q.poll();
                if(i==0) first=curr_id;
                if(i==size-1) last=curr_id;
                if(node.left!=null) q.offer(new Pair(node.left,2*curr_id+1));
                if(node.right!=null) q.offer(new Pair(node.right,2*curr_id+2));
            }
            ans=Math.max(ans,last-first+1);
        }
        return ans;
    }
    public static void main(String[] args){
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(3);
        root.left.left=new TreeNode(8);
        root.right=new TreeNode(7);
        root.right.right=new TreeNode(4);
        int width=width(root);
        System.out.println("Width of Binary tree is:"+width);
    }
}
