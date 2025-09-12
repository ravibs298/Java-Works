import java.util.Scanner;
public class CWR_72 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size of array ");
        int a = sc.nextInt();
        int[] arr = new int[a];
        System.out.println("enter array elements:");
        for (int i = 0; i < a; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                System.out.print(arr[i] + " ");
            }
        }
        sc.close();
    }
}