import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class P_1636_SortArrayByIncreasingFrequency {
    public static void main(String[] args) {
        int[] nums = {-1,1,-6,4,5,-6,1,4,1};

        Solution1 s = new Solution1();
        System.out.println(s.frequencySort(nums));
    }
}

class Solution1 {
    public int[] frequencySort(int[] nums) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (Integer i = 0; i < nums.length; i++) {
            if (map.get(nums[i]) != null) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }

        class FrequencyPair {
            int nums;
            int frequency;

            FrequencyPair(int nums, int frequency) {
                this.nums = nums;
                this.frequency = frequency;
            }
        }

        FrequencyPair[] pairs = new FrequencyPair[map.entrySet().size()];
        int index = 0;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            pairs[index++] =new FrequencyPair(entry.getKey(), entry.getValue());
        }

        Arrays.sort(pairs, new Comparator<FrequencyPair>() {
            @Override
            public int compare(FrequencyPair o1, FrequencyPair o2) {
                if (o1.frequency == o2.frequency) {
                    return o2.nums - o1.nums;
                }
                return o1.frequency - o2.frequency;
            }
        });

        index = 0;
        for (FrequencyPair pair : pairs) {
            int frequency = pair.frequency;

            while (frequency-- > 0) {
                nums[index++] = pair.nums;
            }
        }

        return nums;
    }
}
