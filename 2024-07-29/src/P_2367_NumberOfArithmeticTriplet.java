public class P_2367_NumberOfArithmeticTriplet {
    public static void main(String[] args) {
        int[] nums = {0,1,4,6,7,10};
        int diff = 3;

        Solution_P_2367 sol = new Solution_P_2367();

        System.out.println(sol.arithmeticTriplets(nums, diff));
    }
}

class Solution_P_2367 {
    public int arithmeticTriplets(int[] nums, int diff) {
        int resp = 0;

        for (int i = 0; i < nums.length -2; i++) {
            for (int j = i + 1; j < nums.length -1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if ((nums[j] - nums[i]) == diff && (nums[k] - nums[j]) == diff) ++resp;
                }
            }
        }
        return resp;
    }
}