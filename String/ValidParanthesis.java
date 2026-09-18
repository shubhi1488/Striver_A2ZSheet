package Strings;
import java.util.*;
public class ValidParanthesis {
    public static boolean validParanthesis(String s){
        Stack<Character> st=new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch=='(' || ch=='[' || ch=='{') st.push(ch);
            else{
                if(st.isEmpty()) return false;
                char top=st.pop();
                if((ch==')' && top!='(') ||
                        (ch==']' && top!='[') ||
                        (ch=='}' && top!='{')) return false;
            }
        }
        return st.isEmpty();
    }

    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        String s=sc.next();
        System.out.println("Is string valid paranthesis:"+validParanthesis(s));
    }
}
