import java.util.Scanner;

public class PivotIndexOfArrayApproach1 {
    public static int[] initializeArray(int n){
        int[] arr1=new int[n];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the elements in the array");
        for(int i=0;i<n;i++){
                arr1[i]=sc.nextInt();
        }
        return arr1;
    }
    public static int PivotIndexOfArray1(int[] arr1,int n){
        int leftSum=0;
        int TotalSum=0;
        int rightSum=0;
        for(int i=0;i<n;i++){
            TotalSum+=arr1[i];
        }
        for(int i=0;i<n;i++){
            rightSum=TotalSum-leftSum-arr1[i];
            if(leftSum==rightSum){
                return i;
            }
            else{
                leftSum+=arr1[i];
            }
        }
        return -1;
}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n=sc.nextInt();
        int[] arr1=initializeArray(n);
        int PivotIndex=PivotIndexOfArray1(arr1, n);
        System.out.println("Pivot Index Of The Array:"+PivotIndex);
    }
}
