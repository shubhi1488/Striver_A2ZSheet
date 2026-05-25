package BinarySearch;
import java.util.*;
public class AggressiveCows {
    private static boolean canweplace(int[] nums,int dist,int cows){
        int n=nums.length;
        int cntCows=1;
        int last=nums[0];
        for(int i=1;i<n;i++){
            if(nums[i]-last>=dist){
                cntCows++;
                last=nums[i];
            }
            if(cntCows>=cows) return true;
        }
        return false;
    }
    public int aggressiveCows(int[] nums,int k){
        int n=nums.length;
        Arrays.sort(nums);
        int low=0;
        int high=nums[n-1]-nums[0];
        int ans=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(canweplace(nums,mid,k)==true){
                ans=mid;
                low=mid+1;
            }
            else high=mid-1;
        }
        return high;
    }

    public static void main(String[] args) {
        AggressiveCows c1=new AggressiveCows();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n=sc.nextInt();
        System.out.println("enter the elements of the array");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter number of cows");
        int k=sc.nextInt();
        int ans=c1.aggressiveCows(arr,k);
        System.out.println("The maximum possible minimum distance is:"+ans);

    }
}
