import java.util.Scanner;
public class  Arrayswaps{
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the size of the array");
    int n=sc.nextInt();
    int[] arr=new int[n];
    System.out.print("Enter the elements in the array");
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    for(int i=0;i<n;i++){
        int temp;
        temp=arr[0];
        arr[0]=arr[n-1];
        arr[n-1]=temp;
    }
    System.out.println("Swapped array:");
    for(int i=0;i<n;i++){
        System.out.print(arr[i]+" ");
    }
}
}
//time complexity=O(n)
//space complexity=O(n)