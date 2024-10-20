package DAY1;
import java.util.Scanner;
public class positivenegativeorzero {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
       int a=sc.nextInt();
       if(a>0){
        System.out.println("positive");
       }
       else if(a<0){
        System.out.println("Negative");
       }
       else{
        System.out.println("Zero");
       }
    }
}
