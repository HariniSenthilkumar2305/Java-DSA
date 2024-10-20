  import java.util.Scanner;
  public class Primeornot {
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number:");
    int n=sc.nextInt();
    if(n<0){
        System.out.println("Not a prime");
    }
    for(int i=2;i<Math.sqrt(n);i++){
        if(n%i==0){
            System.out.println("Not a prime");
        }
    }
    System.out.println("The number is prime");
}
}
