import java.util.Scanner;
public class SpiralMatrix {
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
    public static void spiralmatrix(int[][] arr1,int row1,int col1){
       int top=0;
       int right=col1-1;
       int left=0;
       int bottom=row1-1;
       int dir=1;
       while(top<=bottom && left<=right){
       //Traverse left->right making top fixed
       if(dir==1){
       for(int i=left;i<=right;i++){
        System.out.print(arr1[top][i]+" ");
       }
       top++;
       dir=2;
    }
       else if(dir==2){
       //traverse top->bottom making right fixed
       for(int i=top;i<=bottom;i++){
        System.out.print(arr1[i][right]+" ");
       }
       right--;
         dir=3;
    }
         else if(dir==3){
       //traverse right->left making bottom fixed
       for(int i=right;i>=left;i--){
        System.out.print(arr1[bottom][i]+" ");
       }
       bottom--;
       dir=4;
    }
       else if(dir==4){
       //traverse bottom->top making left fixed
        for(int i=bottom;i>=top;i--){
            System.out.print(arr1[i][left]+" ");
        }
    left++;
        dir=1;
    }
    }
}
    public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of row1");
         int row1=sc.nextInt();
         System.out.println("Enter the value of col1");
         int col1=sc.nextInt();
         int[][] arr1=firstmatrix(row1,col1);
         spiralmatrix(arr1, row1, col1);
    }
}
