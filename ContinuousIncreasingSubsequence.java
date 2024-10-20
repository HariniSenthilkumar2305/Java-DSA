package DAY9;
import java.util.Scanner;
public class ContinuousIncreasingSubsequence {
   public static int LongestSubsequence(int[] nums,int n){//MyApproach
    int left=0;
    int right=left+1;
    int count1=0;
    int count2=0;
    while(left<=n-2 && right<=n-1){
        if(nums[left]<nums[right]){
            count1++;
            left++;
            right++;
        }
        else{
            count2++;
            left++;
            right++;
        }
    }
  return Math.max(count1,count2);
   }
   public static int LongestSubsequence1(int[] nums){
    if(nums.length==0){
        return 0;
    }
    else{
      int maxlength=1;
      int currentmax=1;
      for(int i=1;i<nums.length;i++){
        if(nums[i]>nums[i-1]){
            currentmax++;
            maxlength=Math.max(maxlength,currentmax);
        }
        else{
            currentmax=1;
        }
      }
      return maxlength;
    }
   }
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size of the nums:");
    int n=sc.nextInt();
    int[] nums=new int[n];
    System.out.println("Enter the elements of the array:");
    for(int i=0;i<nums.length;i++){
        nums[i]=sc.nextInt();
    }
    int length=LongestSubsequence(nums,n);
    System.out.println("The length of longest increasing subsequence:"+length);
    int length1=LongestSubsequence1(nums);
    System.out.println("The length of longest increasing subsequence:"+length1);
    
}
}
