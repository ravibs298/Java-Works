import java.util.Scanner;
public class CWR_90 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] arr = new int[a];
        for (int i = 0; i < a; i++) {
            arr[i] = sc.nextInt();
        }
        int x = arr[0] + arr[1];
        int y = arr[a - 2] + arr[a - 1];
        System.out.println(x);
        System.out.println(y);
    }
}
