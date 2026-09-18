package Strings;
import java.util.*;
public class RomanToInteger {
    private static int value(char c){
        switch(c){
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }
    public static int romanToInt(String s){
        int sum=0;
        for(int i=0;i<s.length();i++){
            int current=value(s.charAt(i));
            if(i<s.length()-1) {
                int next = value(s.charAt(i + 1));

                if (current < next) {
                    sum -= current;
                } else {
                    sum += current;
                }
            }
            else sum+=current;
        }
        return sum;
    }

    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the roman number string");
        String roman=sc.next();
        System.out.println("Integer value is:"+romanToInt(roman));
    }
}
