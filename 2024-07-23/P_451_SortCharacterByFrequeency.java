

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class P_451_SortCharacterByFrequeency {
    public static void main(String[] args) {
        String s = "Aabb";
        Solution3 solution3 = new Solution3();

        System.out.println(solution3.frequencySort(s));
    }
}

class Solution3 {
    public String frequencySort(String s) {
        String str = "";
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        class CharFrequency {
            char charValue;
            int frequency;

            public CharFrequency(char charValue, int frequency) {
                this.charValue = charValue;
                this.frequency = frequency;
            }
        }

        CharFrequency[] charFrequencies = new CharFrequency[map.entrySet().size()];

        int index = 0;
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            charFrequencies[index++] = new CharFrequency(entry.getKey(), entry.getValue());
        }

        Arrays.sort(charFrequencies, new Comparator<CharFrequency>() {
            @Override
            public int compare(CharFrequency o1, CharFrequency o2) {
                return o2.frequency - o1.frequency;
            }
        });

        StringBuilder sb = new StringBuilder();
        index = 0;
        for (CharFrequency cf : charFrequencies) {
            int frequency = cf.frequency;

            while (frequency-- > 0) {
                sb.append(cf.charValue);
            }
        }

        return sb.toString();
    }
}
