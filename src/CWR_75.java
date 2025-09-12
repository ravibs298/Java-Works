import java.util.Arrays;
import java.util.Scanner;
public class CWR_75 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int[] marks = new int[n];
        for (int i=0;i<n;i++){
            marks[i] = sc.nextInt();
        }
        Arrays.sort(marks);
        int sum = 0;
        for (int i = n-1;i>=n-5;i--){
            sum += marks[i];
        }
        System.out.println(sum);
    }
}