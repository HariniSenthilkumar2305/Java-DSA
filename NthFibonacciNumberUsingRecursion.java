package DAY8;

import java.util.Scanner;

public class NthFibonacciNumberUsingRecursion {
public static  int Fibonacci(int n){
  if(n==0){
    return 0;
  } 
  else if(n==1){
    return 1;
  }  
else{
    return Fibonacci(n-1)+Fibonacci(n-2);
}
}
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the value of n");
    int n=sc.nextInt();
    int result=Fibonacci(n);
    System.out.print(result);
}
}

