import java.util.Scanner;
public class CWR_4 {
    public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int T = sc.nextInt();
            for (int i=0;i<T;i++){
                int A = sc.nextInt();
                int B = sc.nextInt();
                int C = sc.nextInt();

                if ((A>B) && (A>C)){
                    System.out.println("A is greater");
                }else if ((B>A) && (B>C)){
                    System.out.println("B is greater");
                }else {
                    System.out.println("C is greater");
                }
            }
    }
}
