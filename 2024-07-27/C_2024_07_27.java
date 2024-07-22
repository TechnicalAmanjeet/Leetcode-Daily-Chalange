import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import static java.util.Collections.sort;

public class C_2024_07_27 {
    public static void main(String[] args) {
        String[] names = new String[] {"Mary","John","Emma"};
        int[] heights = new int[] {180, 165, 170};

        Solution solution = new Solution();
        System.out.print(
                solution.sortPeople(
                        names = names,
                        heights = heights
                )
        );
    }
}


class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int[] cloneHeights = heights.clone();
        Arrays.sort(heights);

        HashMap<Integer, Integer> heightNameMappings = new HashMap<Integer, Integer>();

        for (int i = 0; i < names.length; i++) {
            heightNameMappings.put(cloneHeights[i], i);
        }

        String[] result = names.clone();

        for (int i = names.length-1; i >= 0; i--) {
            result[heights.length - i -1] = names[heightNameMappings.get(heights[i])];
        }

        return result;
    }
}