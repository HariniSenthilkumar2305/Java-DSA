package DAY9;
import java.util.Scanner;
public class PrintSubsequenceOfaString {
    public static void SubsequenceString(String s,int index,String current){
       if(index==s.length()){
        System.out.println(current);
        return;
       }
       //include the character
       SubsequenceString(s, index+1, current+s.charAt(index));
       //exclude the character
       SubsequenceString(s, index+1, current);

    }  
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the input string:");
    String s=sc.nextLine();
   SubsequenceString(s,0," ");
}
}  
