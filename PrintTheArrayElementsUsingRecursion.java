package DAY8;
public class PrintTheArrayElementsUsingRecursion {
public static void PrintArray(int[] arr,int index){
    if(index>=arr.length){
        return;
    }
        System.out.println(arr[index]);
        PrintArray(arr,index+1);
}
public static void PrintArray1(int[] arr,int index){
    if(index<0){
        return;
    }
        System.out.println(arr[index]);
        PrintArray1(arr,index-1);
}
public static void main(String[] args) {
    int[] arr=new int[]{10,20,30,40};
    int n=arr.length;
    System.out.println("array elements are:");
    PrintArray(arr, 0);
    PrintArray1(arr,n-1);
}
}