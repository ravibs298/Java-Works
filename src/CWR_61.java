import java.util.Scanner;
public class CWR_61 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("enter elements of array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        long sum1 = 0;
        long sum2 = 0;
        int halfLength = n / 2;
//        for (int i = 0; i < halfLength; i++) {
//            sum1 += arr[i];
//        }
//        for (int i = n - halfLength; i < n; i++) {
//            sum2 += arr[i];
//        }
        for (int i = 0; i < n; i++) {
            if (i < halfLength) {
                sum1 += arr[i];
            }
            if (i >= n - halfLength) {
                sum2 += arr[i];
            }
        }
        if (sum1 > sum2) {
            System.out.println("Yes");
        } else if (sum1 == sum2) {
            System.out.println("Tie");
        } else {
            System.out.println("No");
        }
        sc.close();
    }
}
