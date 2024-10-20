package DAY8;
import java.util.Scanner;    
public class Powerofnumber { //linear approach 
public static int Powerofnumber1(int x,int n){
    if(n==0){
        return 1;
    }
    else{
        return x*Powerofnumber1(x, n-1);
    }
}
public static int Powerofnumber2(int x,int n){//logarithmic approach
    if(n==0){
        return 1;
    }
   int halfpower=Powerofnumber2(x,n/2);
   if(n%2==0){
    return halfpower*halfpower;
   }
   else{
    return x*halfpower*halfpower;
   }
}
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the value of x:");
    int x=sc.nextInt();
    System.out.println("Enter the value of n:");
    int n=sc.nextInt();
    int num=Powerofnumber1(x, n);
    System.out.println(num);
    int num1=Powerofnumber2(x, n);
    System.out.println(num1);
}
}
