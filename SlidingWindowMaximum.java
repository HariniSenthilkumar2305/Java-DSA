import java.util.Scanner;
public class SlidingWindowMaximum{
    public static int Maximum(int[] arr,int k){
        int currsum=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<=arr.length-k;i++){
            sum=0;  
            for(int j=i;j<i+k;j++){
               sum=sum+arr[j];
            }
            if(sum>currsum){
                currsum=sum;
            }
        }
        return currsum;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the size of the array:");
        n=sc.nextInt();
        int k;
        System.out.println("Enter the size of the window:");
        k=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the value of the array:");
        for(int i=0;i<n;i++){
           arr[i]=sc.nextInt();
        }
        int a=Maximum(arr,k);
        System.out.println("MaximumSum:"+a);
    }
}