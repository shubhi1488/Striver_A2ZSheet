package Arrays;
import java.util.*;
public class EvenOddSplitSum {
    public static int evenOddSplitSum(int[] arr){
        int n=arr.length;
        ArrayList<Integer> even=new ArrayList<>();
        ArrayList<Integer> odd=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(i%2==0){
                even.add(arr[i]);
            }
            else odd.add(arr[i]);
        }
        Collections.sort(even);
        Collections.sort(odd);
        int secondLargest=even.get(even.size()-2);
        int secondSmallest=odd.get(1);
        int sum=secondLargest+secondSmallest;
        return sum;
    }

    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n=sc.nextInt();
        System.out.println("enter elements of the array");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Sum :"+evenOddSplitSum(arr));
    }
}
