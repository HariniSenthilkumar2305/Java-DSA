import java.util.Scanner;
public class SumOfSubarray {
    public static int[] initializeArray(int n){
        int[] arr1=new int[n];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the elements in the array");
        for(int i=0;i<n;i++){
                arr1[i]=sc.nextInt();
        }
        return arr1;
    }
public static int SumOfSubarray(int[] arr1,int start,int end){
int sum=0;
for(int i=start;i<=end;i++){
    sum=sum+arr1[i];
}
return sum;
}
public static int SumOfSubarray1(int[] arr1,int start,int end){
    int sum=0,sum2=0,sum1=0;
    for(int i=0;i<=end;i++){
        sum+=arr1[i];
    }
 for(int i=0;i<start;i++){
    sum1=sum1+arr1[i];
 }
    for(int i=start;i<arr1.length;i++){
       sum2=sum-sum1;
    }
    return sum2;  
}
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size of the array:");
    int n=sc.nextInt();
    System.out.println("Enter the start index of the sub array:");
    int start=sc.nextInt();
    System.out.println("Enter the end index of the sub array:");
    int end=sc.nextInt();
    int[] arr1=initializeArray(n);
    int sum=SumOfSubarray(arr1, start, end);
    System.out.println("The sum of the array without using prefix method:"+sum);
    int sum1=SumOfSubarray1(arr1, start, end);
    System.out.println("The sum of the array using prefix method:"+sum1);
}
}
