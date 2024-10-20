package DAY7;
import java.util.Scanner;
public class Subarrayforproductlessthank  {
    public static int[] initializeArray(int n){
        int[] arr=new int[n];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the elements in the array");
        for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
        }
        return arr;
    }
    public static int Contigioussubarray(int[] arr,int k){
        if(k<1){
            return 0;
        }
  int product=1;
  int left=0;
  int count=0;
  for(int right=0;right<arr.length;right++){
    product=product*arr[right];
    while(product>=k){
        product/=arr[right];
        left++;
    }
    count=count+right-left+1;
  }
  return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n=sc.nextInt();
        int[] arr=initializeArray(n);
        System.out.println("Enter the k value:");
        int k=sc.nextInt();
        int count=Contigioussubarray(arr,k);
        System.out.println("The count is:"+count);

}
}
