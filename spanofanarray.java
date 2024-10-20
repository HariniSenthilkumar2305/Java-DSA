import java.util.Scanner;
public class spanofanarray  {
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the size of the array");
    int n=sc.nextInt();
    int[] arr=new int[n];
    System.out.print("Enter the elements in the array");
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    int max=Integer.MIN_VALUE;
    int min=Integer.MAX_VALUE;
    for(int i=0;i<n;i++){
        if(arr[i]>max){
            max=arr[i];
        }
        else if(arr[i]<min){
            min=arr[i];
        }
}
int value=max-min;
System.out.println("span of an array="+value);
}
}
//time complexity=O(N)
//Space complexity=O(N)