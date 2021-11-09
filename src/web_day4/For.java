package web_day4;

import java.lang.ProcessBuilder.Redirect.Type;
import java.util.Scanner;

public class For {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
    }
}
    static long solution(int[] a, int[][] edges) {
        long answer = -2;
        boolean isZero = true;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != 0) {
                isZero = false;
                break;
            }
        }
        if (isZero) {
            return 0;
        } else {
            long arr[] = new long[a.length];
            long sum = 0;
            for (int i = 0; i < a.length; i++) {
                sum += a[i];
                arr[i] = a[i];
            }
            if (sum != 0) {
                return -1;
            } else {
                int[] edge = new int[a.length];
                List<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
                for (int i = 0; i < edge.length; i++) {
                    list.add(new ArrayList<Integer>());
                }

                for (int i = 0; i < edges.length; i++) {
                    int v1 = edges[i][0];
                    int v2 = edges[i][1];
                    list.get(v1).add(v2);
                    list.get(v2).add(v1);
                    edge[v1]++;
                    edge[v2]++;
                }

                answer = topologicalSort(list, edge, arr);
            }
            return answer;
        }
    }

    private static long topologicalSort(List<ArrayList<Integer>> list, int[] edge, long[] arr) {
        Queue<Integer> q = new LinkedList<Integer>();
        for (int i = 0; i < edge.length; i++) {
            if (edge[i] == 1) {
                q.add(i);
            }
        }

        boolean visit[] = new boolean[edge.length];
        long answer = 0;
        while (!q.isEmpty()) {
            int current = q.poll();
            visit[current] = true;
            for (int next : list.get(current)) {
                if(!visit[next]) {
                    edge[next]--;
                    arr[next] += arr[current];
                    answer += Math.abs(arr[current]);
                    arr[current] =0;
                    if (edge[next] == 1) {
                        q.add(next);
                    }
                }
            }
        }
        return answer;
    }
}
