public class P_3226_NumberOfBitChangesToMakeTwoIntegersEqual {
    public static void main(String[] args) {
        int n=13, k=13;
        Solution_P_3226 solution = new Solution_P_3226();

        System.out.println(solution.minChanges(n,k));
    }
}

class Solution_P_3226 {
    public int minChanges(int n, int k) {
        int[] nba = toBinaryArray(n), kba = toBinaryArray(k);
        int count = 0;

        for (int i = 0; i < nba.length; i++) {
            if (nba[i] == 0 && kba[i] == 1) { return -1;}
            if (nba[i] == 1 && kba[i] == 0) { ++count;}
        }

        return count;
    }

    public static int[] toBinaryArray(int number) {
        int[] binaryArray = new int[32];

        for (int i = 0; i < 32; i++) {
            binaryArray[31 - i] = (number >> i) & 1;
        }

        return binaryArray;
    }
}