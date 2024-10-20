import java.util.Scanner;
public class CalculateXORForAllNnumbers {
public static int XOROfNumbers(int n){//O(n)
    int fact=0;
    for(int i=1;i<=n;i++){
   fact=fact^i;
    }
    return fact;
}
public static int XOROfNumbers1(int n){//O(1)
    if(n%4==1){
        return 1;
    }
    else if(n%3==2){
        return n+1;
    }
    else if(n%4==0){
        return n;
    }
    else{
        return 0;
    }
}
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the value of n");
    int n=sc.nextInt();
    int XOR=XOROfNumbers(n);
    System.out.println("XOR Of all numbers in O(n)="+XOR);
    int XOR1=XOROfNumbers1(n);
    System.out.println("XOR Of all numbers in O(1)="+XOR1);
}
}


