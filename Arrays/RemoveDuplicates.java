#Brute Force-
package Arrays;
import java.util.*;
public class RemoveDuplicates {
    public int remove(int[] arr){
        int n=arr.length;
        Set<Integer> st=new TreeSet<>();
        for(int val:arr){
            st.add(val);
        }
        int k=st.size();
        int idx=0;
        for(int it:st){
            arr[idx++]=it;
        }
        return k;
    }

    public static void main(String[] args) {
        RemoveDuplicates r1=new RemoveDuplicates();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of the array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter array elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("original array is:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println(r1.remove(arr));


    }
}

#Optimal Approach-
package Arrays;
import java.util.*;
public class RemoveDuplicatesFromSortedArray {
    public static int removeDuplicates(int[] arr){
        int i=0;
        for(int j=1;j<arr.length;j++){
            if(arr[j]!=arr[i]){
                arr[i+1]=arr[j];
                i++;
            }
        }
        return i+1;
    }

    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of the array");
        int n=sc.nextInt();
        System.out.println("enter elements of the array");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("unique elements of the array is:"+removeDuplicates(arr));
    }
}
