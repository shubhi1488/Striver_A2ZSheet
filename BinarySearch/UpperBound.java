package BinarySearch;
import java.util.*;
public class UpperBound {
    public static int upperBound(int[] arr,int target){
        int n=arr.length;
        int low=0;
        int high=n-1;
        int ans=n;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>target){
                ans=mid;
                high=mid-1;
            }
            else low=mid+1;
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of the array");
        int n=sc.nextInt();
        System.out.println("enter array elements");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the target value");
        int target=sc.nextInt();
        System.out.println("Upper bound:"+upperBound(arr,target));
    }
}
