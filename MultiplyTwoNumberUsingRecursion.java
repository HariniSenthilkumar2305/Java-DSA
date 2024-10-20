package DAY9;
import java.util.Scanner;
public class MultiplyTwoNumberUsingRecursion {
    public static int MultiplyTwoNumbers(int a,int b){
            if(b==0){
                return 0;
             } 
            else if(b>0){
             return   a+MultiplyTwoNumbers(a,b-1);
            }
            else if(b<0){
                return -MultiplyTwoNumbers(a,-b);
            }
            return 0;
    }
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the value of a:");
    int a=sc.nextInt();
    System.out.println("Enter the value of b:");
    int b=sc.nextInt();
    System.out.println("Ans");
   System.out.println( MultiplyTwoNumbers(a, b));
}
}
