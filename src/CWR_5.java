import java.util.Scanner;
public class CWR_5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i=0;i<T;i++){
            int N = sc.nextInt();
            int X = sc.nextInt();
            boolean possible = checkpossibility(N,X);
            System.out.println(possible ? "YES" : "NO");
        }
    }
    private static boolean checkpossibility(int N, int X){
        if(X % 2 != 0){
            return true;
             }
        return N % 2 == 0;
        }
    }
