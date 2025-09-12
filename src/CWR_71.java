import java.util.Scanner;
import java.text.DecimalFormat;

public class CWR_71 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        DecimalFormat x = new DecimalFormat("#.#");
        for (int i=0;i<n;i++){
            int m = sc.nextInt();
            int[] marks = new int[m];
            int sum = 0;
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            for (int j=0;j<m;j++){
                marks[j] = sc.nextInt();
                sum += marks[j];
                if (marks[j] > max) max = marks[j];
                if (marks[j] < min) min = marks[j];
            }
            double avg = (double) sum/m;
            System.out.println("");
            }
        }
    }