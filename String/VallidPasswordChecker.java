package Strings;
import java.util.*;
public class VallidPasswordChecker {
    public static boolean validPassword(String password,int minLength){
        if(password.length()<minLength) return false;
        boolean hasDigit=false;
        boolean hasUpperCase=false;
        for(int i=0;i<password.length();i++){
            char ch=password.charAt(i);
            if(ch>='0' && ch<='9'){
                hasDigit=true;
            }
            else if(ch>='A' && ch<='Z'){
                hasUpperCase=true;
            }
            if(ch==' ' || ch=='/') return false;
        }
        return hasDigit && hasUpperCase;
    }

    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter you password");
        String password=sc.nextLine();
        System.out.println("enter the minimum length of the password");
        int minLength=sc.nextInt();
        System.out.println("Password is valid or not:"+validPassword(password,minLength));
    }
}
