package BinarySearch;
import java.util.*;
public class FloorandCeil {
    public static int findFloor(int[] arr,int x){
        int n=arr.length;
        int low=0;
        int high=n-1;
        int ans=n;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]<=x){
                ans=arr[mid];
                low=mid+1;
            }
            else high=mid-1;
        }
        return ans;
    }
    public static int findCeil(int[] arr,int x){
        int n=arr.length;
        int low=0;
        int high=n-1;
        int ans=n;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>=x){
                ans=arr[mid];
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
        System.out.println("enter the elements of the array");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the elemment ");
        int x=sc.nextInt();
        System.out.println("Floor value:"+findFloor(arr,x));
        System.out.println("ceil value:"+findCeil(arr,x));
    }
}
