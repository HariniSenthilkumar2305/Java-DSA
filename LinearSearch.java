package DAY11;
import java.util.Scanner;
public class LinearSearch {
    public static int targetelement(int[] arr,int target){
        int flag=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
               return i;
            }
        }
        return -1;
    }
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size of the array:");
    int n=sc.nextInt();
    int[] arr=new int[n];
    System.out.println("Enter the array elements:");
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    System.out.println("Enter the target element:");
    int target=sc.nextInt();
    int value=targetelement(arr, target);
    if(value==-1){
        System.out.println("Element not found");
    }
    else{
        System.out.println("Element found in the index:"+value);
    }
}
}
