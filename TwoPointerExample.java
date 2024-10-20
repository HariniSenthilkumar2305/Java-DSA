import java.util.Scanner;
public class TwoPointerExample {
    public static int[] initializeArray(int n){
        int[] arr=new int[n];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the elements in the array");
        for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
        }
        return arr;
    }
    public static boolean Target(int[] arr,int target){
        int left=0;
        int right=arr.length-1;
        while(left<right){
            int sum=arr[left]+arr[right];
            if(sum==target){
                return true;
            }
            else if(sum<target){
                left++;
            }
            else{
                right--;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n=sc.nextInt();
        int[] arr=initializeArray(n);
        System.out.println("Enter the Target:");
        int target=sc.nextInt();
       boolean a=Target(arr,target);
       if(a==true){
        System.out.println("Element found");
       }
       else{
        System.out.println("Element not found");
       }
    }
}
