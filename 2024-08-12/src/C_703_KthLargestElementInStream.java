import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class C_703_KthLargestElementInStream {
    public static void main(String[] args) {
        int n = 5;
        int[] nums = {1,2,5,3,6};

        KthLargest kthLargest = new KthLargest(
                n = n,
                nums = nums
        );

        System.out.println(kthLargest.add(10));
    }
}

class KthLargest {
    int k;
    List<Integer> list;

    public KthLargest(int k, int[] nums) {
        this.k = k;

        list = new ArrayList<Integer>(nums.length);


        for (int number: nums) {
            list.add(number);
        }

        Collections.sort(this.list);
    }

    public int add(int val) {
        this.list.add(val);

        Collections.sort(this.list);

        return this.list.get(this.list.size() - this.k);
    }
}
