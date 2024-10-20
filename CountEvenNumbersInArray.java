import java.util.Scanner;
public class CountEvenNumbersInArray {
public static void main(String[] args) {
    int[] arr=new int[5];
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the array Elements:");
    for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
    }
    System.out.println("Array Elements are");
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
    int count=0;
    for(int i=0;i<arr.length;i++){
        if(arr[i]%2==0){
            count++;
        }
    }
    System.out.println("Count of the even elements in an array="+count);
}
}
