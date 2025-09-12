import java.util.Scanner;
public class CWR_8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int t=0;t<T;t++){
            int N = sc.nextInt();
            int X = sc.nextInt();
            int S = sc.nextInt();
            for (int i=0;i<S;i++){
                int A = sc.nextInt();
                int B = sc.nextInt();
                if (X==A){
                    X = B;
                }else if(X==B){
                    X=A;
                }
            }
            System.out.println(X);
        }
    }
}