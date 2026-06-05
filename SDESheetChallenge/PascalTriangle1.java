package SDESheetChallenge;
import java.util.*;
public class PascalTriangle1 {
    private static int helper(int n,int r){
        if(r>n-r) return n-r;
        if(r==1) return n;
        int res=1;
        for(int i=0;i<r;i++){
            res=res*(n-i);
            res=res/(i+1);
        }
        return res;
    }
    public static int pascalTriangle(int r,int c){
        return helper(r-1,c-1);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        System.out.println("element is:"+pascalTriangle(r,c));
    }

}
