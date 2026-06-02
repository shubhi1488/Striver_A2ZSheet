package SDESheetChallenge;
//Brute Force solution-
import java.util.*;
public class SetMatrixZero {
    private static void markRow(int[][] matrix,int i){
        int m=matrix[0].length;
        for(int j=0;j<m;j++){
            if(matrix[i][j]!=0){
                matrix[i][j]=-1;
            }
        }
    }
    private static void markCol(int[][] matrix,int j){
        int n=matrix.length;
        for(int i=0;i<n;i++){
            if(matrix[i][j]!=0){
                matrix[i][j]=-1;
            }
        }
    }
    public void setMatrixToZero(int[][] matrix){
        int n=matrix.length;
        int m=matrix[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]==0){
                    markRow(matrix,i);
                    markCol(matrix,j);
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]==-1){
                    matrix[i][j]=0;
                }
            }
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        SetMatrixZero s1=new SetMatrixZero();
        System.out.println("enter the number of rows and columns of the matrix");
        int n=sc.nextInt();
        int m=sc.nextInt();
        System.out.println("enter the elements in the matrix");
        int[][] matrix=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        s1.setMatrixToZero(matrix);
        System.out.println("Modified matrix is:");
        for(int[] row:matrix){
            for(int num:row){
                System.out.print(num+" ");
            }
            System.out.println();
        }

    }
}
