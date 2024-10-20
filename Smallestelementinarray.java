import java.util.Scanner;
public class Smallestelementinarray {
public static void main(String[] args){
int[] arr=new int[5];
Scanner sc=new Scanner(System.in);
int n=arr.length-1;
System.out.println("Enter the array elements:");
for(int i=0;i<=n;i++){
arr[i]=sc.nextInt();
}
int min=arr[0];
for(int i=1;i<arr.length;i++){
    if(arr[i]<=min){
        min=arr[i];
    }
}
        System.out.println("minimum element="+min);
}
}
