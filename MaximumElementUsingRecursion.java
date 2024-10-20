package DAY8;
import java.util.Scanner;
public class MaximumElementUsingRecursion {
public static int MaximumElement(int[] arr,int left,int right){
   int max;
   int leftmax,rightmax;
   if(left==right){
    return arr[left];
   }
      int mid=(left+right)/2;
        leftmax=MaximumElement(arr,left,mid);
        rightmax=MaximumElement(arr,mid+1, right);
    if(leftmax>rightmax){
          max=leftmax;
    }
    else{
    max=rightmax;
    }

    return max;
}
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size of the array");
    int n=sc.nextInt();
    int[] arr=new int[n];
    System.out.println("Enter the elements in the array:");
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    int max=MaximumElement(arr,0, n-1);
System.out.println("Maximum Elements in the array"+max);
}
}
