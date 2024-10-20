import java.util.Scanner;
public class LastDigitisOddorEven {
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number:");
    int n=sc.nextInt();
      int a=n%10;
    if(a%2==0){
        System.out.print("even");
    }
    else{
    System.out.print("odd");
    }
}
}
  