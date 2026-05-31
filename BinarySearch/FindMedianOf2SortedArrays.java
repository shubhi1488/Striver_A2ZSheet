package BinarySearch;
import java.util.*;
public class FindMedianOf2SortedArrays {
    public static double findMedian(int[] arr1,int[] arr2){
        int n1=arr1.length;
        int n2=arr2.length;
        int[] arr3=new int[n1+n2];
        int i=0,j=0,k=0;
        while(i<n1 && j<n2){
            if(arr1[i]<arr2[j]) arr3[k++]=arr1[i++];
            else arr3[k++]=arr2[j++];
        }
        while(i<n1) arr3[k++]=arr1[i++];
        while(j<n2) arr3[k++]=arr2[j++];
        int n=n1+n2;
        if(n%2==1) return (double)arr3[n/2];
        double median=((double)arr3[n/2]+(double)arr3[(n/2)-1])/2.0;
        return median;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of first array");
        int n1=sc.nextInt();
        System.out.println("enter size of second array");
        int n2=sc.nextInt();
        System.out.println("enter elements in first array");
        int[] arr1=new int[n1];
        for(int i=0;i<n1;i++){
            arr1[i]=sc.nextInt();
        }
        System.out.println("enter elements in second array");
        int[] arr2=new int[n2];
        for(int j=0;j<n2;j++){
            arr2[j]=sc.nextInt();
        }
        System.out.println("Median of two sorted arrays are:"+findMedian(arr1,arr2));
    }
}
