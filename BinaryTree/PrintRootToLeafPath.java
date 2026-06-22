package BinaryTree;
import java.util.*;
public class PrintRootToLeafPath {
    private static void dfs(TreeNode node,List<Integer>path,List<List<Integer>>allPaths){
        if(node==null) return;
        path.add(node.data);
        if(node.left==null && node.right==null) allPaths.add(new ArrayList<>(path));
        else{
            dfs(node.left,path,allPaths);
            dfs(node.right,path,allPaths);
        }
        path.remove(path.size()-1);
    }
    public static List<List<Integer>>rootToLeafPath(TreeNode root){
        List<List<Integer>>allPaths=new ArrayList<>();
        List<Integer> path=new ArrayList<>();
        dfs(root,path,allPaths);
        return allPaths;
    }
    public static void main(String[] args){
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(3);
        root.left.left=new TreeNode(4);
        root.left.right=new TreeNode(5);
        root.left.right.left=new TreeNode(6);
        root.left.right.right=new TreeNode(7);
        System.out.println("Path:"+rootToLeafPath(root));
    }
}
