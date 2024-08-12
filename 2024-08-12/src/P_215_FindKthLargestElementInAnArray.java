import java.util.Arrays;

public class P_215_FindKthLargestElementInAnArray {
    public static void main(String[] args) {
        int[] nums = {3,2,1,5,6,4};
        int k = 2;

        Solution_P_215 sol = new Solution_P_215();

        System.out.println(sol.findKthLargest(
                nums=nums,
                k=k
        ));
    }
}

class Solution_P_215 {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);

        return nums[nums.length-k];
    }
}
