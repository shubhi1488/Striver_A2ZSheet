package Maths;
import java.util.*;
public class SmallestDivisibleDigitProductI {
    public static int smallestDivisibleDigitProduct(int n,int t){
        int current=n;
        while(true){
            int product=1;
            int num=current;
            while(num>0){
                product=product*(num%10);
                num/=10;
            }
            if(product%t==0){
                return current;
            }
            current++;
        }
    }

    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        System.out.println("enter the value of t");
        int t=sc.nextInt();
        System.out.println("smallest divisile digit is:"+smallestDivisibleDigitProduct(n,t));
    }
}
