import java.util.Scanner;
public class ContainsDuplicateinarray {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the array size");
    int a=sc.nextInt();
    int[] arr=new int[a];
    System.out.println("Enter the array elements:");
    for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
    }
    int flag=0;
    for(int i=0;i<arr.length-1;i++){
        for(int j=i+1;j<arr.length;j++){
            if(arr[i]==arr[j]){
                flag=1;
                break;
            }
    }
}
    if(flag>0){
        System.out.println("Duplicates found");
    }
    else{
        System.out.println("No Duplicates");
    }
}
}
