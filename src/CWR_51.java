import java.util.Scanner;
public class CWR_51 extends Exception {
    public CWR_51(String a) {
        super(a);
    }
    public static void checkIfOdd(int number) throws CWR_51 {
        if (number % 2 != 0) {
            throw new CWR_51("no is odd");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("enter a no:");
            int input = sc.nextInt();
            checkIfOdd(input);
            System.out.println("no is even.");
        }
        catch (CWR_51 error) {
            System.out.println(error.getMessage());
        }
        catch (Exception e) {
            System.out.println("enter a valid integer");
        }
    }
}