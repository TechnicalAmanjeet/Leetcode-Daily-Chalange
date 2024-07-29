public class P_2893_MaximumValueOfAnOrderedTriplet {
    public static void main(String[] args) {
        int[] nums = {1000000,1,1000000};

        Solution_P_2893 sol = new Solution_P_2893();

        System.out.println(sol.maximumTripletValue(nums));
    }
}

class Solution_P_2893 {
    public long maximumTripletValue(int[] nums) {
        long max = 0;

        for (int i = 0; i < nums.length-2; i++) {
            for (int j = i+1; j < nums.length-1; j++) {
                for (int k = j+1; k < nums.length; k++) {
                    long n1 = nums[i], n2 = nums[j], n3 = nums[k];

                    if ((n1-n2)*n3 > max) max = (n1-n2)*n3;
                }
            }
        }

        return max;
    }
}
