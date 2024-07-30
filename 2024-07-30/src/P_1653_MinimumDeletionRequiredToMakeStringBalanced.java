public class P_1653_MinimumDeletionRequiredToMakeStringBalanced {
    public static void main(String[] args) {
        String s = "aababbab";

        Solution_P_1653 sol = new Solution_P_1653();

        System.out.println(sol.minimumDeletions(s));
    }
}
class Solution_P_1653 {
    public int minimumDeletions(String s) {
        int ans = 0, b = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == 'a') {
                if (b > (ans + 1)) {
                    ans = ans +1;
                } else {
                    ans = b;
                }
            } else b++;
        }
        return ans;
    }
}
