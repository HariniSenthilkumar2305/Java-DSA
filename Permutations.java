import java.util.List;
import java.util.ArrayList;
public class Permutations {
    public List<List<Integer>> permute(int[] nums){
        List<List<Integer>> result=new ArrayList<>();
        backtrack(nums, null, result);
        return result;
    }
    private void backtrack(int[] nums,List<Integer> current,List<List<Integer>> result){
        if(current.size()==nums.length){
            result.add(new ArrayList<>(current));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(!current.contains(nums[i])){
            current.add(nums[i]);
            backtrack(nums, current,result);
            current.remove(current.size()-1);
            }
        }
    }
    public static void main(String[] args) {
        Permutations permutations=new Permutations();
        int[] nums={1,2,3};
        List<List<Integer>> result=permutations.permute(nums);
    }
}
