public class CWR_14 {
    public static boolean evenOrOdd(int a) {
        if(a%2==0){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        if (evenOrOdd(num)) {
            System.out.println(num + " is even.");
        } else {
            System.out.println(num + " is odd.");
        }

    }
}