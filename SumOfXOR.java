import java.util.Scanner;
public class SumOfXOR {
    public static int XORSum(int[] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                sum=sum+(arr[i]^arr[j]);
            }
        }
        return sum;
    }
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the value of n");
    int n=sc.nextInt();
    int[] arr=new int[n];
    System.out.println("Enter the values of the array:");
    for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
    }
    int sum=XORSum(arr);
    System.out.println("Sum Of XOR="+sum);
}
}
