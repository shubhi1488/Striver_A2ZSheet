package Arrays;
import java.util.*;
public class SumOfNonDivisibleNumbers {
    public static ArrayList<Integer> sum(int n,int m){
        ArrayList<Integer> result=new ArrayList<>();
        int sumDivisible=0;
        int sumNonDivisible=0;
        for(int i=1;i<=n;i++){
            if(i%m==0){
                sumDivisible+=i;
            }
            else sumNonDivisible+=i;
        }
        result.add(sumDivisible);
        result.add(sumNonDivisible);
        return result;
    }

    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of n");
        int n=sc.nextInt();
        System.out.println("enter the value of m");
        int m=sc.nextInt();
        ArrayList<Integer> arr=sum(n,m);
        for(int x:arr){
            System.out.println("Sum of divisible and non divisible numbers are;"+x);
        }
    }
}
