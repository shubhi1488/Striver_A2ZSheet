package BinaryTree;
import java.util.*;
public class BottomViewOfBT {
    static class Pair<K,V>{
        private K key;
        private V value;
        public Pair(K key,V value){
            this.key=key;
            this.value=value;
        }
        public K getKey(){
            return key;
        }
        public V getValue(){
            return value;
        }
    }
    public static List<Integer> bottomView(TreeNode root){
        List<Integer> ans=new ArrayList<>();
        if(root==null) return ans;
        Map<Integer,Integer> map=new TreeMap<>();
        Queue<Pair<TreeNode,Integer>>q=new LinkedList<>();
        q.add(new Pair<>(root,0));
        while(!q.isEmpty()){
            Pair<TreeNode,Integer> it=q.poll();
            TreeNode node=it.getKey();
            int line=it.getValue();
            map.put(line,node.data);
            if(node.left!=null){
                q.add(new Pair<>(node.left,line-1));
            }
            if(node.right!=null){
                q.add(new Pair<>(node.right,line+1));
            }
        }
        for(Integer value:map.values()){
            ans.add(value);
        }
        return ans;
    }
    public static void main(String[] args){
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(3);
        root.left.left=new TreeNode(4);
        root.left.right=new TreeNode(5);
        root.left.right.left=new TreeNode(8);
        root.left.right.right=new TreeNode(9);
        root.right.left=new TreeNode(6);
        root.right.right=new TreeNode(7);
        List result=bottomView(root);
        System.out.println("Bottom view:"+result);
    }
}
