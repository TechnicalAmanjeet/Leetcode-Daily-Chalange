public class C_1395_CountNumberOfTeams {
    public static void main(String[] args) {
        int[] rating = {1,2,3,4};

        Solution_C_1395 solution = new Solution_C_1395();
        System.out.println(solution.numTeams(rating));
    }
}

class Solution_C_1395 {
    public int numTeams(int[] rating) {
        int numberOfTeams = 0;
        for(int i = 0; i < rating.length-2; i++){
            for(int j = i+1; j < rating.length-1; j++){
                for(int k = j+1; k < rating.length; k++){
                    if (rating[i]>rating[j] && rating[j]>rating[k]) ++numberOfTeams;
                    if (rating[i]<rating[j] && rating[j]<rating[k]) ++numberOfTeams;
                }
            }
        }

        return numberOfTeams;
    }
}
