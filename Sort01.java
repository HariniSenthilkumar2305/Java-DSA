package DAY12;
import java.util.Scanner;
public class Sort01 {
    public static void countSort(int[] arr)
    {
        int left=0;
        int right= arr.length-1;
        while(left<right)
        {
            if(arr[left]==1 && arr[right]==0)
            {
                int temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
            }
            else if(arr[left]==0)
            {
                left++;
            }
            else
            {
                right--;
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }

    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array size:");
        int num=sc.nextInt();
        System.out.println("Enter the array elements:");
        int[] arr=new int[num];
        for(int i=0;i<num;i++)
        {
            arr[i]=sc.nextInt();
        }
    }
}
