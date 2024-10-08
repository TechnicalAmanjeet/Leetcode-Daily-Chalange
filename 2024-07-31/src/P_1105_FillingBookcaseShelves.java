import java.util.Arrays;

public class P_1105_FillingBookcaseShelves {
    public static void main(String[] args) {
        int[][] books = {{1,3},{2,4},{3,2}};
        int shelfWidth = 6;

        Solution_P_1105 sol = new Solution_P_1105();
        System.out.println(sol.minHeightShelves(
                books, shelfWidth
        ));
    }
}

class Solution_P_1105 {
    public int minHeightShelves(int[][] books, int shelfWidth) {
        int len = books.length;
        int shelfHeightTillNow[] = new int[len + 1];
        Arrays.fill(shelfHeightTillNow, Integer.MAX_VALUE);
        shelfHeightTillNow[0] = 0;
        for(int currState = 1; currState < len+1; currState++){
            int prevStateContri = shelfHeightTillNow[currState - 1];
            shelfHeightTillNow[currState] = books[currState - 1][1] + prevStateContri;
            int widthConsumed = books[currState-1][0], maxHeightBook = books[currState-1][1];
            for(int prevState = currState-1; prevState > 0; prevState--){
                if(widthConsumed + books[prevState-1][0] > shelfWidth) break;
                widthConsumed += books[prevState-1][0];
                maxHeightBook = Math.max(maxHeightBook, books[prevState - 1][1]);
                prevStateContri = shelfHeightTillNow[prevState-1];
                shelfHeightTillNow[currState] = Math.min(shelfHeightTillNow[currState], prevStateContri + maxHeightBook);
            }
        }
        return shelfHeightTillNow[len];
    }
}
