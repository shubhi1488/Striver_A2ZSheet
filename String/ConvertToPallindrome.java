import java.util.*;
public class ConvertToPallindrome {
    private static boolean isPallindrome(String s,int start,int end){
        int left=start;
        int right=end;
        while(left<=right){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static int minCharacters(String s){
        int n=s.length();
        for(int start=0;start<n;start++){
            if(isPallindrome(s,start,n-1)){
                return start;
            }
        }
        return n;
    }

    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string");
        String s=sc.next();
        System.out.println("Minimum characters to be added are:"+minCharacters(s));
    }
}
