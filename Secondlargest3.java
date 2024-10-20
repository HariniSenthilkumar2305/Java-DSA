import java.util.Scanner;
public class Secondlargest3  {

public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the size of the array");
    int n=sc.nextInt();
    int[] arr=new int[n];
    System.out.print("Enter the elements in the array");
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
   int max=0;
   int min=0;
   int secondmax=0;
   for(int i=0;i<n;i++){
    if(arr[i]>min && arr[i]<max){
        secondmax=arr[i];
    }
   }
   System.out.println("secondmax"+secondmax);
}
}