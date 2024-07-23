import java.util.HashMap;
import java.util.Map;

public class P_2351_FirstLetterToAppearTwice {
    public static void main(String[] args) {
        String s = "abccbaacz";

        SolutionP_2351 sol = new SolutionP_2351();

        System.out.println(sol.repeatedCharacter(s = s));
    }
}

class SolutionP_2351 {
    public char repeatedCharacter(String s) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();

        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                return s.charAt(i);
            }
            map.put(s.charAt(i), i);
        }

        return s.charAt(0);
    }
}
