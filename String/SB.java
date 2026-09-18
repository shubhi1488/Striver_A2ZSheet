package Strings;
import java.util.*;
public class SB {
    public static void main(String[] args){
        StringBuilder sb=new StringBuilder("Hello");
        //insert element at last-
        sb.append("world");
        System.out.println(sb);
        //insert at particular index-
        sb.insert(1,'a');
        System.out.println(sb);
        //replace string with new string
        sb.replace(6,11,"shubhi");
        System.out.println(sb);
        //delete a character-
        sb.delete(1,2);
        System.out.println(sb);
        sb.deleteCharAt(1);
        System.out.println(sb);
        StringBuilder sb2=new StringBuilder("java");
        sb2.reverse();
        System.out.println(sb2);
        System.out.println(sb2.charAt(2));
        sb2.setCharAt(2,'e');
        System.out.println(sb2);

    }
}
