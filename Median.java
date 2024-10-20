package DAY12;

import java.util.Scanner;

public class Median {
    public static void median(int[] arr){
    for(int i=0;i<arr.length;i++)
    {
        if(arr.length%2==0)
        {
            int a=arr.length/2;
            double b=(arr[a]+arr[a-1])/2.0;
            System.out.println(b);
            break;
        }
        else{
            int a=arr.length/2;
            System.out.println(arr[a]);
            break;
        }
    }
}
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the length of the array");
int n=sc.nextInt();
int[] arr=new int[n];
System.out.println("Enter the array Elements");
for(int i=0;i<n;i++){
    arr[i]=sc.nextInt();
}
median(arr);
}
}

