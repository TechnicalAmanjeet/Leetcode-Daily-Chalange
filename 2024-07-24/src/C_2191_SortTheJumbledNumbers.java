import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class C_2191_SortTheJumbledNumbers {
    public static void main(String[] args) {
        int[] mapping = {8,9,4,0,2,1,3,5,7,6};
        int[] nums = {991,338,38};

        SolutionC_2191 sol = new SolutionC_2191();

        System.out.println(sol.sortJumbled(
                mapping, nums
        ));
    }
}

class SolutionC_2191 {
    public int[] sortJumbled(int[] mapping, int[] nums) {
        class RefPair {
            int num;
            int refNum;

            RefPair(int num, int refNum) {
                this.num = num;
                this.refNum = refNum;
            }
        }

        RefPair[] refPairs = new RefPair[nums.length];

        for (int i = 0; i < nums.length; i++) {
            String currentValue = String.valueOf(nums[i]);
            StringBuilder refValue = new StringBuilder();

            for (int j = 0; j < currentValue.length(); j++) {
                int currentDigit = Character.getNumericValue(currentValue.charAt(j));

                refValue.append(mapping[currentDigit]);
            }

            refPairs[i] = new  RefPair(nums[i], Integer.parseInt(refValue.toString()));
        }

        Arrays.sort(refPairs, new Comparator<RefPair>() {
            @Override
            public int compare(RefPair o1, RefPair o2) {
                return o1.refNum - o2.refNum;
            }
        });

        for (int i = 0; i < nums.length; i++) {
            nums[i] = refPairs[i].num;
        }

        return nums;
    }
}
