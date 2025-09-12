import java.util.Scanner;

public class CWR_22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.print("Enter an integer: ");
        n = scanner.nextInt();

        for (int i = 1; i >= n; i++) {
            System.out.println(i);
        }
        scanner.close();
    }
}