import java.util.HashMap;
import java.util.Map;

public class P_387_FirstUniqueChanacterInAString {
    public static void main(String[] args) {
        String s = "leetcode";

        SolutionP_387 solution = new SolutionP_387();
        System.out.println(solution.firstUniqChar(s));
    }
}

class SolutionP_387 {
    public int firstUniqChar(String s) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();

        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }
}