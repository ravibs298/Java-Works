import java.util.Scanner;
import java.util.ArrayList;
public class CWR_78 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }
        int minIdx = 0, maxIdx = 0;
        for (int i = 1; i < n; i++) {
            if (arr.get(i) < arr.get(minIdx)) minIdx = i;
            if (arr.get(i) > arr.get(maxIdx)) maxIdx = i;
        }
        if (minIdx > maxIdx) {
            int temp = minIdx;
            minIdx = maxIdx;
            maxIdx = temp;
        }
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = minIdx; i < maxIdx; i++) result.add(arr.get(i));
        for (int i = 0; i < minIdx; i++) result.add(arr.get(i));
        for (int i = maxIdx; i < n; i++) result.add(arr.get(i));
        for (int x : result) System.out.print(x + " ");
        System.out.println();
    }
}
