package Arrays;
import java.util.*;
public class OldestIDAverage {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n=sc.nextInt();
        System.out.println("enter elements in the array");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int sum=0;
        int min=arr[0];
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(arr[i]<min){
                min=arr[i];
            }
        }
        int average=sum/n;
        System.out.println(min+" "+average);
    }
}
