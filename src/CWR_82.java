import java.io.OutputStream;
import java.util.*;
public class CWR_82 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for (int i=0;i<n;i++){
            int next = 0;
            for (int j = i+1;j<n;j++){
                if (arr[j] > arr[i]){
                    next = arr[j];
                    break;
                }
            }
            System.out.println(next);
        }
    }
}