package BinarySearch;
import java.util.*;
public class LowerBound {
    public static int lowerBound(int[] arr,int target){
        int n=arr.length;
        int low=0;
        int high=n-1;
        int ans=n;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>=target){
                ans=mid;
                high=mid-1;
            }
            else low=mid+1;
        }
        return ans;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n=sc.nextInt();
        System.out.println("enter elements of the array");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the target");
        int target=sc.nextInt();
        System.out.println("lower bound :"+lowerBound(arr,target));
    }
}
