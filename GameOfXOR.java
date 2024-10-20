package DAY11;
import java.util.Scanner;
public class GameOfXOR {
    public static int XOROfSubarray(int[] arr,int n){
        int totalXOR=0;
        for(int i=0;i<n;i++){
        for(int j=i;j<n;j++){
           int XOR=0;
        for(int k=i;k<=j;k++){
            XOR^=arr[k];
        }
          totalXOR=totalXOR^XOR;
        }
        }  
        return totalXOR;
    }
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size of the array");
    int n=sc.nextInt();
    int[] arr=new int[n];
    System.out.println("Enter the elements of the array");
    for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
    }
  int XORValue=XOROfSubarray(arr, n);
  System.out.println("The XOR Of all subarray"+XORValue);
}
}
