package DAY11;
import java.util.Scanner;
public class SingleIntegerUsingBitManipulation {
    public static int SingleInteger(int[] arr){
        int value=0;
   for(int i=0;i<arr.length;i++){
    value^=arr[i];
   }
    return value;
}
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the length of the array:");
    int n=sc.nextInt();
    int[] arr=new int[n];
    System.out.println("Enter the array elements:");
    for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
    }
    int value1=SingleInteger(arr);
    System.out.println(value1);
}
}
