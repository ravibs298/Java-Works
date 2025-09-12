import java.util.Scanner;
public class CWR_7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0;i<T;i++){
            int A = sc.nextInt();
            int B = sc.nextInt();

            int total_candies_limak = 0,
                    total_candies_bob = 0;
            int turn = 1;

            while (true){
                if (turn % 2 == 1){
                    total_candies_limak += turn;
                    if (total_candies_limak > A){
                        System.out.println("Bob");
                        break;
                    }
                }
                else {
                    total_candies_bob += turn;
                    if (total_candies_bob > B){
                        System.out.println("Limak");
                        break;
                    }
                }
                turn++;
            }
        }
    }
}
