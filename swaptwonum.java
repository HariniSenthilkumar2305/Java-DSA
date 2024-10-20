import java.util.Scanner;
public class swaptwonum {
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("The value of a is:");
    int a=sc.nextInt();
    System.out.println("The value of b is:");
    int b=sc.nextInt();
    int temp;
    if(a>=0 && b>=0){
       temp=a;
        a=b;
        b=temp;
    }
    System.out.println("a="+a);
    System.out.println("b="+b); 
}
}
