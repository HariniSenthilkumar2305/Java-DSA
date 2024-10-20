import java.util.Scanner;
public class MinimalLengthOfContigiousSubarray {
    public static int minimallength1(int[] arr,int target){
        int minlength=Integer.MAX_VALUE;
        int currentSum=0;
        int start=0;
      for(int end=0;end<arr.length;end++){
        currentSum+=arr[end];  
        while(currentSum>=target){
            minlength=Math.min(minlength,end-start+1);
            currentSum-=arr[start];
            start++;
        }
      }
      return (minlength==Integer.MAX_VALUE)?0:minlength;
    }
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size of the array:");
    int n=sc.nextInt();
    int[] arr=new int[n];
    System.out.println("Enter the array elements");
    for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
    }
    System.out.println("Enter the target element:");
    int target=sc.nextInt();
 int minvalue1=minimallength1(arr, target);
 System.out.println("minimum value"+minvalue1);  
}
}
