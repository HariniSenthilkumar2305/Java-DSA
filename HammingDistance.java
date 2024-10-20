package DAY11;
import java.util.Scanner;
public class HammingDistance {
    public static int ToFindHammingDistance(int a,int b){
     int xorResult=a^b;
     int count=0;
     while(xorResult>0){
        count+=xorResult&1;
        xorResult>>=1;
     }
     return count;
    }
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the value of a:");
    int a=sc.nextInt();
    System.out.println("Enter the value of b:");
    int b=sc.nextInt();
    int HammingDistance=ToFindHammingDistance(a,b);
    System.out.println("Hamming Distance between a and b:"+HammingDistance);
}
}
