import java.util.Scanner;
public class CWR_68 {
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int a = sc.nextInt();
                int[] arr = new int[a];
                for(int i = 0; i < a; i++) {
                    arr[i] = sc.nextInt();
                }
                int firstSum = arr[0]+ arr[1];
                int lastSum = arr[a - 2] + arr[a - 1];
                System.out.println(firstSum);
                System.out.println(lastSum);

            }
}