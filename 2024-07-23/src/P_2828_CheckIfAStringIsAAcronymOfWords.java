import java.util.ArrayList;
import java.util.List;

public class P_2828_CheckIfAStringIsAAcronymOfWords {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("alice");
        words.add("bob");
        words.add("charlie");

        String s = "abc";

        SolutionP_2828 solution = new SolutionP_2828();

        System.out.println(solution.isAcronym(
                words = words,
                s = s
        ));
    }
}

class SolutionP_2828 {
    public boolean isAcronym(List<String> words, String s) {
        if (words.size() != s.length()) return false;

        for (int i = 0; i < words.size(); i++) {
            if (words.get(i).charAt(0) != s.charAt(i)) return false;
        }
        return true;
    }
}
