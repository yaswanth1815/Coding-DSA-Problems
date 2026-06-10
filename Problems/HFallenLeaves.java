import java.io.*;
import java.util.*;

public class HFallenLeaves{

    static List<Integer>[] tree;
    static int[] degree;
    static int[] leafCount;
    static int totalLeaves;
    static long answer;

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {

            int n = Integer.parseInt(br.readLine());

            tree = new ArrayList[n + 1];
            degree = new int[n + 1];
            leafCount = new int[n + 1];

            for (int i = 1; i <= n; i++) {
                tree[i] = new ArrayList<>();
            }

            // Read edges
            for (int i = 0; i < n - 1; i++) {
                st = new StringTokenizer(br.readLine());
                int u = Integer.parseInt(st.nextToken());
                int v = Integer.parseInt(st.nextToken());

                tree[u].add(v);
                tree[v].add(u);

                degree[u]++;
                degree[v]++;
            }

            // Count total leaves
            totalLeaves = 0;
            for (int i = 1; i <= n; i++) {
                if (degree[i] == 1) {
                    totalLeaves++;
                }
            }

            answer = 0;

            // Run DFS from any node (1 is fine)
            dfs(1, 0);

            System.out.println(answer);
        }
    }

    static void dfs(int node, int parent) {

        // Leaf node
        if (degree[node] == 1) {
            leafCount[node] = 1;
        }

        for (int neighbor : tree[node]) {
            if (neighbor == parent) continue;

            dfs(neighbor, node);

            leafCount[node] += leafCount[neighbor];

            int k = leafCount[neighbor];
            answer += Math.min(k, totalLeaves - k);
        }
    }
}
