import java.util.*;

public class CWR_79 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int min = 0, max = 0;
        for(int i=1; i<n; i++){
            if(arr[i] < arr[min]) min = i;
            if(arr[i] > arr[max]) max = i;
        }
        int l = Math.min(min, max);
        int r = Math.max(min, max);
        for(int i=l+1; i<r; i++)
            System.out.print(arr[i] + " ");
        for(int i=r; i<n; i++)
            System.out.print(arr[i] + " ");
        for(int i=0; i<=l; i++)
            System.out.print(arr[i] + " ");
    }
}
