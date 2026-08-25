package Maths;
import java.util.*;
public class PallindromeNumber {
    private static int reverse(int n){
        int rev=0;
        while(n>0){
            int digit=n%10;
            rev=(rev*10)+digit;
            n=n/10;
        }
        return rev;
    }
    public static boolean isPallindrome(int n){
        if(reverse(n)==n) return true;
        return false;
    }

    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number that you want to check");
        int n=sc.nextInt();
        if(isPallindrome(n)){
            System.out.println("Entered number is pallindromic number");
        }
        else{
            System.out.println("Entered number is not pallindromic number");
        }
    }
}
