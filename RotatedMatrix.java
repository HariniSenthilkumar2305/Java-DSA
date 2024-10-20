import java.util.Scanner;
public class RotatedMatrix {
    public static int[][] firstmatrix(int row1,int col1){
        Scanner sc=new Scanner(System.in);
        int[][] arr1=new int[row1][col1];
        System.out.println("Enter the elements of an array;");
        for(int i=0;i<row1;i++){
            for(int j=0;j<col1;j++){
                arr1[i][j]=sc.nextInt();
            }
        }
        return arr1;
    }
    public static void printarray(int[][] arr1,int row1,int col1){
        System.out.println("The Elements in the array are:");
        for(int i=0;i<row1;i++){
            for(int j=0;j<col1;j++){
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println( );
        }
    }
    public static void RotatedMatrix(int[][] arr1,int row1,int col1){
        System.out.println("Rotated matrix:");
        for(int i=0;i<row1;i++){
            for(int j=col1-1;j>=0;j--){
              System.out.print(arr1[j][i]+" ");
            }
            System.out.println( );
        }
    }
    public static void RotatedMatrix1(int[][] arr1,int row1,int col1){
        System.out.println("Rotated matrix 2:");
        for(int i=row1-1;i>=0;i--){
            int left=0;
           int  right=col1-1;
            for(int j=col1-1;j>=0;j--){
               int temp;
               temp=arr1[i][left];
               arr1[i][left]=arr1[i][right];
               arr1[i][right]=temp;
              System.out.print(arr1[j][i]+" ");
            }
            System.out.println( );
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of row1");
         int row1=sc.nextInt();
         System.out.println("Enter the value of col1");
         int col1=sc.nextInt();
         int[][] arr1=firstmatrix(row1,col1);
         printarray(arr1, row1, col1);
         RotatedMatrix(arr1,row1,col1);
         RotatedMatrix1(arr1, row1, col1);
    }
}
