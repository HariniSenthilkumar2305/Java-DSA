package DAY11;
import java.util.Scanner;
import java.util.*;
public class Count1inSortedArray {
    public static int countnumberofones1(int[] arr,int n){
        int low=0;
        int high=arr.length-1;
        int firstOneindex=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==1){
                firstOneindex=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        if(firstOneindex==-1){
            return 0;
        }
        return n-firstOneindex;
    }
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the value of n:");
    int n=sc.nextInt();
    int[] arr=new int[n];
    System.out.println("Enter the array elements");
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    Arrays.sort(arr);
    int count1=countnumberofones1(arr, n);
    System.out.println("Number Of Ones:"+count1);
}
}
