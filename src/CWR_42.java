import java.util.Scanner;
public class CWR_42 {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        boolean isPrime = true;
        if (num <= 1) isPrime = false;
        else {
            for (int i=2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        System.out.println(num + (isPrime?" is a Prime number.":" is not a Prime number."));
    }
}