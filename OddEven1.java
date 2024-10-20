package DAY12;
import java.util.Scanner;
public class OddEven1 {

    public static int[] oddEven(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length-1;j+=2)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
            for(int j=1;j<arr.length-1;j+=2)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr;
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
        int[] res=oddEven(arr);
        for(int i=0;i<num;i++)
        {
            System.out.print(res[i]+" ");
        }
        sc.close();
    }
}

