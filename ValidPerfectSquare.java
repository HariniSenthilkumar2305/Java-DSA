package DAY11;
import java.util.Scanner;
public class ValidPerfectSquare {
    public static int ValidPerfectSquare1(int n){//linear Approach
        for(int i=2;i<n;i++){
            if((i*i)==n){
                return i;
            }
        }
        return -1;
    }
    public static int ValidPerfectSquare2(int n,int left,int right){ //binary Approach
        if(n==1){
            return 0;
        }
        int mid=(left+right)/2;
        if(mid*mid==n){
            return mid;
        }
        else if((mid*mid)>n){
          return   ValidPerfectSquare2(n, left,mid-1);
        }
        else if((mid*mid)<n){
          return  ValidPerfectSquare2(n,mid+1, right);
        }  
        else{
            return -1;
        }

    }
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the value of input");
    int n=sc.nextInt();
     int value=ValidPerfectSquare1(n);
     if(value==-1){
        System.out.println("NO");
     }
     else if(value>1){
        System.out.println("YES");
     }
     int value1=ValidPerfectSquare2(n,1,n);
     if(value1==-1 || value1==0){
     System.out.println("NO");
     }
     else{
        System.out.println("YES");
     }
}
}
