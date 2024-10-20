  import java.util.Scanner;
public class Traverseindifferentorders {
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
    public static void Printarray(int[][] arr){
        System.out.println("The elements of the array are:");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    //rowwise
public static void rowwise(int[][] arr){
    for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[i].length;j++){
            System.out.print(arr[i][j]+" ");
        }
        System.out.println();
    }
}
//columnwise
public static void colwise(int[][] arr){
    for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[i].length;j++){
            System.out.print(arr[j][i]+" ");
        }
        System.out.println();
    }
}
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size of the row:");
    int r=sc.nextInt();
    System.out.println("Enter the size of the column;");
    int c=sc.nextInt();
    int[][] arr=InitiaizeArray(r,c);
    Printarray(arr);
    System.out.println("Row Direction");
    rowwise(arr);
    System.out.println("Column Direction");
    colwise(arr);
}
}
//  Time Complexity and Space Complexity=O(n^2)