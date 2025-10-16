import java.util.Scanner;
public class CWR_86 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[] arr = new String[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.next();
        }
        for (int i = 0; i < N / 2; i++) {
            String a = arr[i].substring(0, i + 1);
            String b = arr[N - 1 - i].substring(arr[N - 1 - i].length() - (i + 1));
            System.out.print(a + b + " ");
        }
        sc.close();
    }
}
