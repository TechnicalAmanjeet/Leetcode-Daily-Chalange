import java.util.ArrayList;
import java.util.Arrays;

import static java.util.Collections.sort;

public class C_2024_07_27 {
    public static void main(String[] args) {
        String[] names = new String[] {"aman", "jeet", "kumar"};
        int[] heights = new int[] {15, 101, 16};

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

        String[] result = names.clone();

        for (int i = names.length-1; i >= 0; i--) {
            int actualHeightIndex = 0, index = 0;
            while(true) {
                if (heights[i] == cloneHeights[index]) {
                    actualHeightIndex = index;
                    break;
                }
                index++;
            }
            result[heights.length - i -1] = names[index];
        }

        return result;
    }
}