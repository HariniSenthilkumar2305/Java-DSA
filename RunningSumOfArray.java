import java.util.Scanner;
public class RunningSumOfArray {
    public static int[] initializeArray(int n){
        int[] input=new int[n];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the elements in the array");
        for(int i=0;i<n;i++){
                input[i]=sc.nextInt();
        }
        return input;
    }
    public static int[] OutputArray(int[] input,int n){
        int[] Output=new int[n];
        int sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Output Array:");
        for(int i=0;i<n;i++){
              sum+=input[i];
              Output[i]=sum;
        }
        return Output;
    }
    public static void PrintArray(int[] Output){
        for(int i=0;i<Output.length;i++){
            System.out.print(Output[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n=sc.nextInt();
        int[] input=initializeArray(n);
        int[] Output=OutputArray(input, n);
        PrintArray(Output);
        }
}
