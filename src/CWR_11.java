import java.util.Scanner;
public class CWR_11 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int t=0;t<T;t++){
            int n = sc.nextInt();
            int x = sc.nextInt();
            int s = sc.nextInt();

            for (int i = 0; i < s; i++) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                if (x == a) {
                    x = b;
                } else if (x == b) {
                    x = a;
                }
            }
            System.out.println(x);
        }
    }
}
