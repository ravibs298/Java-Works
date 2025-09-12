import java.util.Scanner;
public class CWR_35  extends Exception{
    public CWR_35(String a){
        super(a);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cPass = "HeyImRavi";
        String ePass;
        try{
            System.out.println("enter password");
            ePass = sc.nextLine();
            if (!ePass.equals(cPass)){
                throw new CWR_35("Incorrect password");
            }
            System.out.println("Authentication Successful");
        }
        catch (CWR_35 error) {
            System.out.println(error.getMessage());
        }
    }
}
