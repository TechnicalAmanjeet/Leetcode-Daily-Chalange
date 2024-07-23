import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

import static java.util.Collections.sort;

public class C_2024_07_27 {
    public static void main(String[] args) {
        String[] names = new String[] {"Mary","John","Emma"};
        int[] heights = new int[] {180, 165, 170};

        Solution solution = new Solution();
        System.out.print(
                solution.sortPeople(
                        names = names,
                        heights = heights
                )
        );
    }
}


class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        class Person {
            String name;
            int height;

            Person(
                    String name,
                    int height
            ) {
                this.name = name;
                this.height = height;
            }

            public int getHeight() {
                return height;
            }

            public String getName() {
                return name;
            }

            @Override
            public String toString() {
                return this.name + " (" + this.height + ")";
            }

            public static int compareHeight(Person p1, Person p2) {
                return p1.height - p2.height;
            }
        }

        Person[] peoples = new Person[names.length];

        for (int i = 0; i < names.length; i++) {
            peoples[i] = new Person(names[i], heights[i]);
        }
        Arrays.sort(peoples, new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return Person.compareHeight(p1, p2);
            }
        });

        for (int i = 0; i < peoples.length; i++) {
            names[i] = peoples[peoples.length - i - 1].getName();
        }

        return names;
    }
}