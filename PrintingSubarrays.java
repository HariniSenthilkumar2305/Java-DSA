import java.util.Scanner;
public class PrintingSubarrays{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.print("Enter the value of n:");
        n=sc.nextInt();
        int[] arr=new int[n];
        System.out.print("Enter the value of array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int start=0;start<arr.length;start++){
            for(int end=start;end<arr.length;end++){
                printSubarray(arr,start,end);
            }
        }
    }
    public static void printSubarray(int[] arr,int start,int end){
        System.out.print("{");
        for(int i=start;i<=end;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.print("}");
        System.out.println();
    }
}