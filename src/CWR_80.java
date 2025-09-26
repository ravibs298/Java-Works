import java.util.*;
public class CWR_80 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        int[] B = new int[M];
        for (int i = 0; i < M; i++) {
            B[i] = sc.nextInt();
        }
        Arrays.sort(A);
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < M; i++) {
            int pos = upperBound(A, B[i]);
            result.append(N - pos).append(" ");
        }
        System.out.println(result.toString().trim());
        sc.close();
    }
    private static int upperBound(int[] arr, int key) {
        int low = 0, high = arr.length;
        while (low < high) {
            int mid = (low + high) / 2;
            if (arr[mid] <= key) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }
}