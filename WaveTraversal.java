import java.util.Scanner;
  public class WaveTraversal {
    public static int[][] InitiaizeArray(int row,int column){
        Scanner sc=new Scanner(System.in);
        int[][] arr=new int[row][column];
        System.out.println("Enter the elements of an array;");
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        return arr;
    }
    public static void WaveTraversal(int[][] arr){
        for(int col=0;col<arr[0].length;col++){
          if(col%2==0){
            for(int row=0;row<arr.length;row++){
                System.out.println(arr[row][col]+" ");
            }
            System.out.println();
          }
          else{
            for(int row=arr.length;row>0;row--){
                System.out.println(arr[row][col]+" ");
            }
            System.out.println();
          }
            }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the row:");
        int r=sc.nextInt();
        System.out.println("Enter the size of the column;");
        int c=sc.nextInt();
        int[][] arr=InitiaizeArray(r,c);  
        WaveTraversal(arr);
}
  }