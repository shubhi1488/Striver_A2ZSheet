package Arrays;
import java.util.*;
public class SingleNumber1 {
    public static int singleNumber(int[] nums){
        int n=nums.length;
        HashMap<Integer,Integer> mpp=new HashMap<>();
        for(int num:nums){
            mpp.put(num,mpp.getOrDefault(num,0)+1);
        }
        for(int key:mpp.keySet()){
            if(mpp.get(key)==1) return key;
        }
        return -1;
    }

    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n=sc.nextInt();
        System.out.println("enter the elements of the array");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("element which appeared only once is:"+singleNumber(arr));
    }
}
