package DAY8;
import java.util.Arrays;
public class ReverseaSubArray {
public static int[] ReverseaSubArray1(int[] arr,int left,int right){
    if(left<0||right>=arr.length){
        System.out.print("Invalid");
         }
else{
   int temp;
   temp=arr[left];
   arr[left]=arr[right];
   arr[right]=temp;
   ReverseaSubArray1(arr, left++, right--);
}
return arr;
}
public static void main(String[] args) {
    int[] arr=new int[]{1,2,3,4,5,6};
    int left=2;
    int right=4;
        int[] arr1=ReverseaSubArray1(arr, left, right);
        System.out.println("After Reversing the SubArray");
      for(int i=0;i<arr1.length;i++){
        System.out.println(arr1[i]);
      }
}
}
//Correct the code