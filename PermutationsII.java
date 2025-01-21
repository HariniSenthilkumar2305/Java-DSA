import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PermutationsII{
     public List<List<Integer>> permuteUnique(int[] nums) {
                List<List<Integer>> result = new ArrayList<>();
                Arrays.sort(nums); 
                backtrack(nums, result, new ArrayList<>(), new boolean[nums.length]);
                return result;
            }
        
        private void backtrack(int[] nums,List<List<Integer>> result,List<Integer> tempList,boolean[] visited){
                if(tempList.size()==nums.length){
                        result.add(new ArrayList<>(tempList));
                        return;
                }
                for(int i=0;i<nums.length;i++){
                        if(visited[i] ||(i>0 && nums[i]==nums[i-1] && !visited[i-1])){
                                continue;
                        }
                        tempList.add(nums[i]);
                        visited[i]=true;
                        backtrack(nums,result,tempList,visited);
                        tempList.remove(tempList.size()-1);
                        visited[i]=false;
                }
        }
}