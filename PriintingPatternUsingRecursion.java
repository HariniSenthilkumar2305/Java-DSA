package DAY7;
import java.util.Scanner;
public class PriintingPatternUsingRecursion {
public static void Recursion1(int n){
    if(n>0){
        System.out.println(n+" ");//5 4 3 2 1
        Recursion1(n-1);
        System.out.println();
    }
}
public static void Recursion2(int n){
    if(n>0){
        System.out.println();
        Recursion2(n-1);
        System.out.println(n+" ");//1 2 3 4 5
    }
}
public static void Recursion3(int n){
    if(n>0){
  
        System.out.println(n+" ");//5 4 3 2 1
        Recursion3(n-1);
        System.out.println(n+" ");//1 2 3 4 5
    }
}
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the value of n");
    int n=sc.nextInt();
Recursion1(n);
Recursion2(n);
Recursion3(n);
}
}
