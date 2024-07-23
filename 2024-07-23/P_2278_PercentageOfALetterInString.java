public class P_2278_PercentageOfALetterInString {
    String s = "foobar";
    Char letter = 'o';

    SolutionP_2278 solution = new SolutionP_2278();

    System.out.println(solution.percentageLetter(
            s = s,
            letter = letter
            ));
}

class SolutionP_2278 {
    public int percentageLetter(String s, char letter) {
        public int percentageLetter(String s, char letter) {
            int count = 0;

            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == letter) {++count;}
            }

            return (count*100)/s.length();
        }
    }
}