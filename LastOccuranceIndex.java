import java.util.Scanner;
public class LastOccuranceIndex {
    public static int[] initializeArray(int n){
        int[] arr1=new int[n];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the elements in the array");
        for(int i=0;i<n;i++){
                arr1[i]=sc.nextInt();
        }
        return arr1;
    }
    public static int LastOccuranceIndex(int[] arr1,int x){
        int max=0;
      for(int i=0;i<arr1.length;i++){
        if(arr1[i]==x){
            if(i>max){
                max=i;
            }
        }
      }
     if(max>1){
        return max;
     }
     else{
        return -1;
     }
    }
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size of the array:");
    int n=sc.nextInt();
    int[] arr1=initializeArray(n);
    System.out.println("Enter the element to find its occurance:");
    int x=sc.nextInt();
    System.out.println("The last Occurance index is:"+LastOccuranceIndex(arr1,x));
}
}
