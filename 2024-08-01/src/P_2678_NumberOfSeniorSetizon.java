public class P_2678_NumberOfSeniorSetizon {
    public static void main(String[] args) {
        String[] details = {"7868190130M7522","5303914400F9211","9273338290F4010"};

        Solution_P_2678 sol = new Solution_P_2678();

        System.out.println(sol.countSeniors(details));
    }
}

class Solution_P_2678 {
    public int countSeniors(String[] details) {
        int count = 0;

        for (String d : details) {
            if (Integer.parseInt(d.substring(11, 13)) > 60) ++count;
        }

        return count;
    }
}
