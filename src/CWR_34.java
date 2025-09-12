import java.util.Scanner;

public class CWR_34 extends Exception{
    public CWR_34(String a){
        super(a);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter p , r & t");
        double p = sc.nextDouble();
        double r = sc.nextDouble();
        double t = sc.nextDouble();
        double i;

        try {
            if (p<0 || r<0 || t<0){
                throw new CWR_34(" -ve input not allowed. ");
            }
            i = (p*r*t)/100;
            System.out.println("Simple interest: "+i);
        }
        catch (CWR_34 error){
            System.out.println(error.getMessage());
        }
    }
}