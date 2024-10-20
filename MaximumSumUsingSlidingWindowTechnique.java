import java.util.Scanner;
public class MaximumSumUsingSlidingWindowTechnique {
    public static int[] initializeArray(int n){
        int[] arr=new int[n];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the elements in the array");
        for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
        }
        return arr;
    }
    public static int maxsumusingSlidingWindow(int[] arr){
        int k=3;
        int n=arr.length;
        int windowsum=0;  
        int maxsum=0;
        if(n<k){
            return -1;
        }
        for(int i=0;i<k;i++){
        maxsum=maxsum+arr[i];
        }
        windowsum=maxsum;
        for(int i=k;i<n;i++){
            windowsum=windowsum+arr[i]-arr[i-k];
            maxsum=Math.max(windowsum,maxsum);
        }
        return maxsum;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n=sc.nextInt();
        int[] arr=initializeArray(n);
       int maxsum=maxsumusingSlidingWindow(arr);
       System.out.println("maximum sum:"+maxsum);
    }
}
