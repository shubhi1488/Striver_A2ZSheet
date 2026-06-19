package BinaryTree;
import java.util.*;
public class VerticalTraversal {
    static class Tuple{
        TreeNode node;
        int row;
        int col;
        public Tuple(TreeNode node,int x,int y){
            this.node=node;
            this.row=x;
            this.col=y;
        }
    }
    public static List<List<Integer>> verticalOrder(TreeNode root){
        List<List<Integer>> result=new ArrayList<>();
        if(root==null) return result;
        TreeMap<Integer,TreeMap<Integer,PriorityQueue<Integer>>>map=new TreeMap<>();
        Queue<Tuple> q=new LinkedList<>();
        q.offer(new Tuple(root,0,0));
        while(!q.isEmpty()){
            Tuple tuple=q.poll();
            TreeNode node=tuple.node;
            int x=tuple.row;
            int y=tuple.col;
            map.putIfAbsent(x,new TreeMap<>());
            map.get(x).putIfAbsent(y,new PriorityQueue<>());
            map.get(x).get(y).offer(node.data);
            if(node.left!=null) q.offer(new Tuple(node.left,x-1,y+1));
            if(node.right!=null) q.offer(new Tuple(node.right,x+1,y+1));
        }
        for(TreeMap<Integer,PriorityQueue<Integer>>ymap:map.values()){
            List<Integer> column=new ArrayList<>();
            for(PriorityQueue<Integer>nodes:ymap.values()){
                while(!nodes.isEmpty()){
                    column.add(nodes.poll());
                }
            }
            result.add(column);
        }
        return result;
    }
    public static void main(String[] args){
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(3);
        root.left.left=new TreeNode(4);
        root.left.right=new TreeNode(10);
        root.left.left.right=new TreeNode(5);
        root.left.left.right.right=new TreeNode(6);
        root.right.left=new TreeNode(9);
        root.right.right=new TreeNode(10);
        List<List<Integer>>traversal=verticalOrder(root);
        for(List column:traversal){
            System.out.println(column);
        }
    }
}
