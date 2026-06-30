package BinaryTree;
import java.util.*;
public class ConstructBTFromPostorderInorder {
    public static TreeNode buildTree(int[] inorder,int[] postorder){
        if(inorder==null || postorder==null || inorder.length!=postorder.length) return null;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            hm.put(inorder[i],i);
        }
        return buildTreePostIn(inorder,0,inorder.length-1,postorder,0,postorder.length-1,hm);
    }
    public static TreeNode buildTreePostIn(int[] inorder,int is,int ie,int[] postorder,int ps,int pe,
                                           Map<Integer,Integer> hm){
        if(ps>pe || is>ie) return null;
        TreeNode root=new TreeNode(postorder[pe]);
        int inRoot=hm.get(postorder[pe]);
        int numsLeft=inRoot-is;
        root.left=buildTreePostIn(inorder,is,inRoot-1,postorder,ps,ps+numsLeft-1,hm);
        root.right=buildTreePostIn(inorder,inRoot+1,ie,postorder,ps+numsLeft,pe-1,hm);
        return root;
    }
    public static void printInorder(TreeNode root) {
        if (root == null) {
            return;
        }
        printInorder(root.left);
        System.out.print(root.data + " ");
        printInorder(root.right);
    }
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args){
        int[] inorder = {40, 20, 50, 10, 60, 30};
        int[] postorder = {40, 50, 20, 60, 30, 10};

        // Display the input arrays
        System.out.print("Inorder Array: ");
        printArray(inorder);

        System.out.print("Postorder Array: ");
        printArray(postorder);

        TreeNode root = buildTree(inorder, postorder);

        System.out.println("Inorder of Unique Binary Tree Created: ");
        printInorder(root);
        System.out.println();




    }
}
