import java.util.Scanner;
public class TwoDArrayOperations {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size of the row:");
    int r=sc.nextInt();
    System.out.println("Enter the size of the column:");
    int c=sc.nextInt();
    int[][] arr=new int[r][c];
    System.out.println("Enter the values of the array:");
    for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
            arr[i][j]=sc.nextInt();
        }
    }
    System.out.println("The values of the array are");
    for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
            System.out.print(arr[i][j]);
        }
    }
}
}
