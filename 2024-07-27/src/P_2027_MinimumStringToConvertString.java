public class P_2027_MinimumStringToConvertString {
    public static void main(String[] args) {
        String input = "OOOO";

        Solution_P_2027 solution = new Solution_P_2027();
        System.out.println(solution.minimumMoves(input));
    }
}

class Solution_P_2027 {
    public int minimumMoves(String s) {
        int totalMoves = 0, index = 0;

        while (index < s.length()) {
            if (s.charAt(index) == 'X') {
                ++totalMoves;
                index += 3;
            } else {
                ++index;
            }
        }

        return totalMoves;
    }
}

class Solution_P_2027_1 {
    public int minimumMoves(String s) {
        char[] chars = s.toCharArray();
        int totalMoves = 0, index = 0;

        while (index < s.length()) {
            if (chars[index] == 'X') {
                ++totalMoves;
                index += 3;
            } else {
                ++index;
            }
        }

        return totalMoves;
    }
}
