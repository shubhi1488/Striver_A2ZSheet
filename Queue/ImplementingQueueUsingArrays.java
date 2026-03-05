package Queue;
import java.util.*;
public class ImplementingQueueUsingArrays {
    int [] q;
    int size;
    int currsize;
    int start;
    int end;
    public ImplementingQueueUsingArrays(){
        q=new int[10];
        size=10;
        currsize=0;
        start=-1;
        end=-1;
    }
    public void push(int element){
        if(currsize==size){
            System.out.println("Queue is full");
            System.exit(1);
        }
        if(currsize==0){
            start=end=0;
        }
        else{
            end=(end+1)%size;
        }
        q[end]=element;
        currsize++;
    }
    public int pop(){
        if(start==-1){
            System.out.println("Queue is empty");
            System.exit(1);
        }
        int ele=q[start];
        if(currsize==1){
            start=end=-1;
        }
        else{
            start=(start+1)%size;
        }
        currsize--;
        return ele;
    }
    public int peek(){
        if(start==-1){
            System.out.println("Queue is empty");
            System.exit(1);
        }
        return q[start];
    }
    public int size(){
        return currsize;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ImplementingQueueUsingArrays queue=new ImplementingQueueUsingArrays();
        System.out.println("enter element");
        int ele=sc.nextInt();
        queue.push(ele);
        System.out.println(queue.peek());


    }
}
