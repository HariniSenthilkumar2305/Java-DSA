import java.util.Scanner;
public class SecondLargestfromarray {
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the size of the array");
    int n=sc.nextInt();
    int[] arr=new int[n];
    System.out.print("Enter the elements in the array");
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    for(int i=0;i<n-1;i++){
        for(int j=i+1;j<n;j++){
            if(arr[i]>arr[j]){
            int temp;
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
    }
}
        System.out.println("second largest:"+arr[n-2]);
}
}
