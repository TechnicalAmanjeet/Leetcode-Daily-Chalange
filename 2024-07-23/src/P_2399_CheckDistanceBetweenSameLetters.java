public class P_2399_CheckDistanceBetweenSameLetters {
    public static void main(String[] args) {
        String s = "abaccb";

        int[] distances = {1, 3, 0, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

        SolutionP_2399 sol = new SolutionP_2399();

        System.out.println(sol.checkDistances(
                s = s,
                distances = distances
        ));

    }
}

class SolutionP_2399 {
    public boolean checkDistances(String s, int[] distance) {
        class Pair {
            int firstIndex, lastIndex;

            Pair(int firstIndex) {
                this.firstIndex = firstIndex;
                this.lastIndex = -1;
            }

            public void setFirstIndex(int firstIndex) {
                this.firstIndex = firstIndex;
            }

            public void setLastIndex(int lastIndex) {
                this.lastIndex = lastIndex;
            }

            public int getFirstIndex() {
                return this.firstIndex;
            }

            public int getLastIndex() {
                return this.lastIndex;
            }
        }

        Pair[] pairs = new Pair[26];

        for (int i = 0; i < s.length(); i++) {
            int index = s.charAt(i) - 'a';
            System.out.println(s.charAt(i) + " - " + index);
            Pair pair = pairs[index];

            if (pair == null) {
                pairs[index] = new Pair(i);
            } else {
                pair.setLastIndex(i);
            }
        }

        for (int i = 0; i < 26; i++) {
            if (pairs[i] != null) {
                int diff = pairs[i].getLastIndex() - pairs[i].getFirstIndex() - 1;

                if (diff != distance[i]) {
                    return false;
                }
            }
        }

        return true;
    }
}
