import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P_15_3Sum {
    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};

        Solution_P_15 solution = new Solution_P_15();

        System.out.println(solution.threeSum(nums));
    }
}

class Solution_P_15 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();

        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        List<Integer> list = new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[k]);

                        boolean isNotExist = true;

                        for (int m = 0; m < res.size(); m++) {

                        }

                        if (isNotExist) {
                            res.add(list);
                        }
                    }
                }
            }
        }

        return res;
    }
}
