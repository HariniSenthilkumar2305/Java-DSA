package DAY1;
import java.util.Scanner;
public class maxofthree {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the three numbers");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int num3=sc.nextInt();
        System.out.println("num1:"+num1);
        System.out.println("num2:"+num2);
        System.out.println("num3:"+num3);
        int max;
        if(num1>=num2 && num1>=num3){
            max=num1;
        }
        else if(num2>=num1 && num2>=num3){
            max=num2;
        }
        else{
            max=num3;
        }
        System.out.println("The maximum number is:"+max);
    }
}
