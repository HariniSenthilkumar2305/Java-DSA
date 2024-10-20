import java.util.Scanner;
public class TwoSum {
    public static int[] initializeArray(int n){
        int[] arr=new int[n];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter te elements in the array");
        for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
        }
        return arr;
    }
    public static int[] TargetOutputIndex(int[] arr,int target){
        int left=0;
        int right=arr.length-1;
        int[] output=new int[2];
        while(left<right){
            int sum=arr[left]+arr[right];
            if(sum==target){
                output[0]=left;
                output[1]=right;
            }
            else if(sum<target){
                left++;
            }
            else{  
                right--;
            }
        }
        return output;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n=sc.nextInt();
        int[] arr=initializeArray(n);
        System.out.println("Enter the Target:");
        int target=sc.nextInt();
     int[] output1=TargetOutputIndex(arr, target);
        for(int i=0;i<output1.length;i++){
            System.out.println(output1[i]+",");
        }
    }
}
//input 2 7 11 15
//target=9
//output=0,1