import java.util.Scanner;
public class CWR_91 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for (int i=0; i<a; i++){
            int b = sc.nextInt();
            int sum = 0;
            for (int j=0; j<b; j++){;
                sum += sc.nextInt();
            }
            System.out.println(sum);
        }
    }
}