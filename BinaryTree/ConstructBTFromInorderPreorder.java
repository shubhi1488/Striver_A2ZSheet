package BinaryTree;
import java.util.*;
public class ConstructBTFromInorderPreorder {
    public static TreeNode buildTree(int[] preorder,int[] inorder){
        Map<Integer,Integer> inMap=new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            inMap.put(inorder[i],i);
        }
        TreeNode root=buildTree(preorder,0,preorder.length-1,inorder,0,inorder.length-1,inMap);
        return root;
    }
    private static TreeNode buildTree(int[] preorder,int preStart,int preEnd,int[] inorder,int inStart,int inEnd,Map<Integer,Integer>inMap){
        if(preStart>preEnd || inStart>inEnd) return null;
        TreeNode root=new TreeNode(preorder[preStart]);
        int inRoot=inMap.get(root.data);
        int numsLeft=inRoot-inStart;
        root.left=buildTree(preorder,preStart+1,preStart+numsLeft,inorder,inStart,inRoot-1,inMap);
        root.right=buildTree(preorder,preStart+numsLeft+1,preEnd,inorder,inRoot+1,inEnd,inMap);
        return root;
    }
    private static void printInorder(TreeNode root) {
        if (root != null) {
            printInorder(root.left);
            System.out.print(root.data + " ");
            printInorder(root.right);
        }
    }
    private static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        int[] inorder = {9, 3, 15, 20, 7};
        int[] preorder = {3, 9, 20, 15, 7};


        System.out.print("Inorder Array: ");
        printArray(inorder);

        System.out.print("Preorder Array: ");
        printArray(preorder);

        TreeNode root = buildTree(preorder, inorder);

        System.out.println("Inorder of Unique Binary Tree Created:");
        printInorder(root);
        System.out.println();


    }
}
