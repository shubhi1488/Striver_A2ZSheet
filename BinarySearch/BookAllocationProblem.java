package BinarySearch;
import java.util.*;
public class BookAllocationProblem {
    private static int countStudent(int[] nums,int pages){
        int n=nums.length;
        int student=1;
        int pagesStudent=0;
        for(int i=0;i<n;i++){
            if(pagesStudent+nums[i]<=pages){
                pagesStudent+=nums[i];
            }
            else{
                student++;
                pagesStudent=nums[i];
            }
        }
        return student;
    }
    public static int allocateBooks(int[] nums,int m){
        int n=nums.length;
        if(m>n) return -1;
        int low=Integer.MIN_VALUE;
        int high=0;
        for(int i=0;i<n;i++){
            low=Math.max(low,nums[i]);
            high=high+nums[i];
        }
        while(low<=high){
            int mid=(low+high)/2;
            int noStudent=countStudent(nums,mid);
            if(noStudent>m) low=mid+1;
            else high=mid-1;
        }
        return low;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
        System.out.println("enter pages of the book");
        int[] book=new int[n];
        for(int i=0;i<n;i++){
            book[i]=sc.nextInt();
        }
        System.out.println("enter number student who needs to be allocate the book pages");
        int m=sc.nextInt();
        int minimumPages=allocateBooks(book,m);
        System.out.println("Minimum number of pages:"+minimumPages);
    }
}
