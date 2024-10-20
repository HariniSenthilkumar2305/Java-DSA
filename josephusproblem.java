package DAY9;

import java.util.Scanner;

public class josephusproblem {
public static int josephus(int n,int k){
    if(n==1){
        return 0;
    }
    return (josephus(n-1,k)+k)%n;
}
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the value of n:");
    int n=sc.nextInt();
    System.out.println("Enter the value of k:");
    int k=sc.nextInt();
    int safeposition=josephus(n,k);
    System.out.println("The safe position is:"+safeposition);

}
}
