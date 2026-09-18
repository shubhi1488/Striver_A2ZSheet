package Maths;
import java.util.*;
public class IntermediatePallindromeNumber {
    public static boolean isPallindrome(int num){
        int original=num;
        int reverse=0;
        while(num>0){
            int digit=num%10;
            reverse=reverse*10+digit;
            num=num/10;
        }
        return original==reverse;
    }

    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the lower limit");
        int lower=sc.nextInt();
        System.out.println("enter the upper limit");
        int upper=sc.nextInt();
        for(int i=lower;i<=upper;i++){
            if(isPallindrome(i)){
                System.out.println(i+" ");
            }
        }
    }
}
