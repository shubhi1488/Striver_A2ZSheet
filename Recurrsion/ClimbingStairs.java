package Recurrsion;
import java.util.*;
public class ClimbingStairs {
    public static int climbingStairs(int n){
        if(n==0) return 1;
        if(n==1) return 1;
        int oneStep=climbingStairs(n-1);
        int twoStep=climbingStairs(n-2);
        return oneStep+twoStep;
    }

    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the step you want to reach");
        int n=sc.nextInt();
        System.out.println("Distinct ways to reach nth step is:"+climbingStairs(n));
    }
}
