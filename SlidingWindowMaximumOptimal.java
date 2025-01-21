public class SlidingWindowMaximumOptimal {
    public static int MaximumSum(int[] arr,int k){
        int n=arr.length;
        int l=0;
        int r=0;
        int currsum=0;
        int max_sum=Integer.MIN_VALUE;
        while(r<=n-1){
              currsum=currsum+arr[r];
              if(r-l+1<k){
                r++;
              }
              else if(r-l+1==k){
                max_sum=Math.max(max_sum,currsum);
                currsum=currsum-arr[l];
              }
        }
        return max_sum;
    }
}
