package DAY8;
import java.util.Scanner;
public class PrintStringUsingRecursion {
public static void PrintString(String str,int index){
if(index==str.length()){
    return;
}
else{
    System.out.println(str.charAt(index));
    PrintString(str,index+1);
}
}

public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
   String str="ALGOTUTOR";
    PrintString(str,0);
}
}
