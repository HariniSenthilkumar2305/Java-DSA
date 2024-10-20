import java.util.Scanner;
public class Secondlargestelement2  {
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
   int secondmax=0;
   for(int i=0;i<n;i++){
    if(arr[i]>max){
        secondmax=max;
        max=arr[i];
    }
    else if(arr[i]>min && arr[i]<max){
       secondmax=arr[i];
            }
   }
   System.out.println(secondmax);  
}
}
/*time complexity=O(n)
 * space complexity= O(n)
 */