package DAY11;
import java.util.Scanner;
import java.util.*;
public class BinarySearch {
    public static int BinarySearch1(int[] arr,int target,int left,int right){
    int mid=left+right/2;
    while (left<right) {
        if(arr[mid]==target){
            return mid;
        }
        else if(arr[mid]<target){
            return BinarySearch1(arr, target,mid+1, right);
        }
        else{
            return BinarySearch1(arr, target, left, mid-1);
        }
    }
    return -1;
    }
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the array length");
    int n=sc.nextInt();
    int[] arr=new int[n];
    System.out.println("Enter the array elements:");
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    Arrays.sort(arr);
    System.out.println("Enter the target element:");
    int target=sc.nextInt();
    int BinarySearch2=BinarySearch1(arr, target, 0,n);
    if(BinarySearch2==-1){
        System.out.println("Element not found");
    }
    else{
        System.out.println("Element found in the index:"+BinarySearch2);
    }
}
}
