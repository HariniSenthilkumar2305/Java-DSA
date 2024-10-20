import java.util.Scanner;
public class ArrayOperations {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the array size:");
    int n=sc.nextInt();
    int[] arr=new int[n];
    System.out.println("Enter the array elements;");
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    int sum=0;
    int fact=1;
    double Average;
    for(int i=0;i<n;i++){
      sum=sum+arr[i];
      fact=fact*arr[i];
    }
    System.out.println("Sum="+sum);
    System.out.println("Product="+fact);
    System.out.println("Average="+(sum/n));
}
}
