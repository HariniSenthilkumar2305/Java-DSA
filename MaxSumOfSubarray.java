import java.util.Scanner;
public class MaxSumOfSubarray {
    public static int[] initializeArray(int n){
        int[] arr1=new int[n];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the elements in the array");
        for(int i=0;i<n;i++){
                arr1[i]=sc.nextInt();
        }
        return arr1;
    }
    public static int SumOfSubarray(int[] arr1){
        int max=arr1[0];
        int currentmax=arr1[0];
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]>currentmax+arr1[i]){
               currentmax=arr1[i];
            }
            else{
                currentmax=currentmax+arr1[i];
            }
            if(max>currentmax){
              max=max;
            }
            else{
                max=currentmax;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n=sc.nextInt();
        int[] arr1=initializeArray(n);
        int sum=SumOfSubarray(arr1);
        System.out.println("Maximum Sum:"+sum);
    }
}
