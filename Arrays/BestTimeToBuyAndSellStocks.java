package Arrays;
import java.util.*;
public class BestTimeToBuyAndSellStocks {
    public static int maxProfit(int[] arr,int n){
        int mini=arr[0];
        int profit=0;
        for(int i=1;i<n;i++){
            int cost=arr[i]-mini;
            profit=Math.max(profit,cost);
            mini=Math.min(mini,arr[i]);
        }
        return profit;
    }

    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n=sc.nextInt();
        System.out.println("enter the prices of each stock");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Maximum profit is:"+maxProfit(arr,n));
    }
}
