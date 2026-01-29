import java.util.Arrays;
import java.util.Scanner;
public class CWR_98 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        int[] b = a.clone();
        Arrays.sort(b);
        int count = 0;
        for (int i=0;i<n;i++){
            if (a[i] != b[i]){
                count++;
            }
        }
        System.out.print(count);
    }
}