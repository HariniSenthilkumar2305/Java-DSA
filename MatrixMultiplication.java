import java.util.Scanner; 
public class MatrixMultiplication {
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
    public static int[][] secondmatrix(int row2,int col2){
        Scanner sc=new Scanner(System.in);
        int[][] arr2=new int[row2][col2];
        System.out.println("Enter the elements of an array;");
        for(int i=0;i<row2;i++){
            for(int j=0;j<col2;j++){
                arr2[i][j]=sc.nextInt();
            }
        }
        return arr2;
    }   
    public static int[][] matrixmultiplication(int[][] arr1,int[][] arr2){
      int m=arr1.length;//row of first matrix
      int n=arr1[0].length;//col of matrix1 or row of matrix 2
      int p=arr2[0].length;//col of matrix2
      int[][] arr3=new int[m][p];
      for(int i=0;i<m;i++){
        for(int j=0;j<p;j++){
            int sum=0;
            for(int k=0;k<n;k++){
                sum+=arr1[i][k]*arr2[k][j];
            }
            arr3[i][j]=sum;
        }
      }
      return arr3;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of row1");
         int row1=sc.nextInt();
         System.out.println("Enter the value of col1");
         int col1=sc.nextInt();
         System.out.println("Enter the value of row2");
         int row2=sc.nextInt();
         System.out.println("Enter the value of col2");
         int col2=sc.nextInt();
         System.out.println("Enter the value of firstmatrix:");
         int[][] arr1=firstmatrix(row1,col1);
         int[][] arr2=secondmatrix(row2,col2);
         if(col1!=row2){
            System.out.println("Matrix can't be multiplied");
            return;
         }
         else{
            int[][] arr3=matrixmultiplication(arr1,arr2);
            for(int i=0;i<arr3.length;i++){
                for(int j=0;j<arr3[0].length;j++){
                    System.out.print(arr3[i][j]+" ");  
                }
                System.out.println( );
            }  
         }
    }
}
//TimeComplexity=O(n^3)
//Space Complexity=O(n^2)