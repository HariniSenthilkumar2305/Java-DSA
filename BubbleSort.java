package DAY12;
import java.util.Scanner;
public class BubbleSort {
    public static void BubbleSort1(int[] arr,int n){//O(n^2)
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<n-i-1;j++){
            if(arr[i]>arr[j+1]){
                int temp;
                temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                count++;
            }
        }
        }
 System.out.println(count);
 System.out.println(arr[0]);
 System.out.println(arr[n-1]);
    }  
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the length of the array");
int n=sc.nextInt();
int[] arr=new int[n];
System.out.println("Enter the array Elements");
for(int i=0;i<n;i++){
    arr[i]=sc.nextInt();
}
BubbleSort1(arr, n);
}
}
