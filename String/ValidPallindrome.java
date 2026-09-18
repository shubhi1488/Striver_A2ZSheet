package Strings;
import java.util.*;
public class ValidPallindrome {
    public static boolean validPallindrome(String s){
        s=s.toLowerCase();
        int left=0;
        int right=s.length()-1;
        while(left<right){
            while(left<right && !Character.isLetterOrDigit(s.charAt(left))){
                left++;
            }
            while(left<right && !Character.isLetterOrDigit(s.charAt(right))){
                right--;
            }
            if(s.charAt(left)!=s.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }

    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        String s=sc.next();
        System.out.println("Is string pallindromic:"+validPallindrome(s));
    }
}
