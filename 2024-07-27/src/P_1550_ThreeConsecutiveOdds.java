public class P_1550_ThreeConsecutiveOdds {
    public static void main(String[] args) {
        int[] arr = {1,1,1};

        Solution_P_1550 sol = new Solution_P_1550();
        System.out.println("salfjafjls");
        System.out.println(sol.threeConsecutiveOdds(arr));
    }
}

class Solution_P_1550 {
    public boolean threeConsecutiveOdds(int[] arr) {
        int index=0, sizeOfArray = arr.length;

        while(index<sizeOfArray){
            if(arr[index]%2 == 1) {
                ++index;
                if(index<sizeOfArray && arr[index]%2 == 1) {
                    ++index;
                    if(index<sizeOfArray && arr[index]%2 == 1) {
                        return true;
                    }
                }
            } else {
                ++index;
            }
        }
        return false;
    }
}
