import java.util.Arrays;

public class C_1334_findTheCity {
    public static void main(String[] args) {
        int n = 3;
        int[][] edges = {{0,1,3},{1,2,1},{1,3,4},{2,3,1}};

        int distanceThreshold = 4;

        Solution_C_1334 sol = new Solution_C_1334();

        System.out.println(sol.findTheCity(
                n=n,
                edges=edges,
                distanceThreshold=distanceThreshold
        ));
    }
}

class Solution_C_1334 {
    public int findTheCity(int n, int[][] edges, int distanceThreshold) {
        int[][] distance = new int[n][n];
        for (int[] row : distance) {
            Arrays.fill(row, 10001);
        }
        for (int[] edge : edges) {
            distance[edge[0]][edge[1]] = distance[edge[1]][edge[0]] = edge[2];
        }

        for (int i = 0; i < n; i++) {
            distance[i][i] = 0;
        }

        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    distance[i][j] = Math.min(distance[i][j], distance[i][k] + distance[k][j]);
                }
            }
        }

        int result = 0, smallest = n;
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (distance[i][j] <= distanceThreshold) {
                    ++count;
                }
            }

            if (count <= smallest) {
                result = i;
                smallest = count;
            }
        }
        return result;
    }
}
