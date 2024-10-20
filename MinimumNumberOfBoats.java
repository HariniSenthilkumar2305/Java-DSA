package DAY7;
import java.util.*;
import java.util.Scanner;
public class MinimumNumberOfBoats {
 public static int[] initializeArray(int n){
        int[] people=new int[n];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the weight of the people");
        for(int i=0;i<n;i++){
                people[i]=sc.nextInt();
        }
        return people;
    }
    public static int boats(int[] people,int limit){
      Arrays.sort(people);
        int left=0;
        int right=people.length-1;
        int count=0;
        while(left<=right){  
           if(people[left]+people[right]<=limit){
                left++;
            }
            right--;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of people:");
        int n=sc.nextInt();
        int[] people=initializeArray(n);
        System.out.println("Enter the limit value:");
        int limit=sc.nextInt();
      int MinimumNumberOfBoats=boats(people, limit);
      System.out.println("boats:"+MinimumNumberOfBoats);
    }

}
