package SDESheetChallenge;
import java.util.*;
public class KthElementOf2SortedArrays {
    public static int kthElement(int[] a,int[] b,int k){
        int n=a.length;
        int m=b.length;
        if(n>m) return kthElement(b,a,k);
        int left=k;
        int low=Math.max(0,k-n);
        int high=Math.min(k,m);
        while(low<=high){
            int mid1=(low+high)>>>1;
            int mid2=left-mid1;
            int l1=(mid1>0)?a[mid1-1]:Integer.MIN_VALUE;
            int l2=(mid2>0)?b[mid2-1]:Integer.MIN_VALUE;
            int r1=(mid1<n)?a[mid1]:Integer.MAX_VALUE;
            int r2=(mid2<m)?b[mid2]:Integer.MAX_VALUE;
            if(l1<=r2 && l2<=r1){
                return Math.max(l1,l2);
            }
            else if(l1>r2) high=mid1-1;
            else low=mid1+1;
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of first array");
        int n=sc.nextInt();
        System.out.println("enter elements of first array");
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("enter size of second array");
        int m=sc.nextInt();
        System.out.println("enter elements of second array");
        int[] b=new int[m];
        for(int i=0;i<m;i++){
            b[i]=sc.nextInt();
        }
        System.out.println("enter kth element");
        int k=sc.nextInt();
        System.out.println(k+"th element is:"+kthElement(a,b,k));
    }
}
