public class C_2908_MinimumSumOfMountainTriplets {
    public static void main(String[] args) {
        int[] nums = {6,5,4,3,4,5};

        Solution_C_2908 solution = new Solution_C_2908();

        System.out.println(solution.minimumSum(nums));
    }
}

class Solution_C_2908 {
    public int minimumSum(int[] nums) {
        int result = -1;

        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[i] < nums[j] && nums[j] > nums[k]) {
                        if ((nums[i] + nums[j] + nums[k]) < result || result == -1) {
                            result = nums[i] + nums[j] + nums[k];
                        }
                    }
                }
            }
        }
        return result;
    }
}
