package DAY7;
import java.util.*;
public class FindAllDuplicates {
     public static int[] initializeArray(int n){
        int[] arr=new int[n];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the elements of the array");
        for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
        }
        return arr;
    }
public static List<Integer> findDuplicates(int[] arr){
    List<Integer>duplicates=new ArrayList<>();
    for(int i=0;i<arr.length;i++){
        int index=Math.abs(arr[i])-1;
        if(arr[index]<0){
         duplicates.add(index+1);
        }
        arr[index]=-arr[index];
    }
    return duplicates;
}
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size of the array:");
    int n=sc.nextInt();
    int[] arr=initializeArray(n);
    System.out.print(findDuplicates(arr));
}
}
