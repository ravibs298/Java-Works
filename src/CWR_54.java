import java.io.DataInputStream;
import java.io.IOException;

public class CWR_54 {
    public static void main(String[] args) {
        inputUsingDataInputStream();
    }
    public static void inputUsingDataInputStream() {
        System.out.println("\n--- Using DataInputStream ---");
        DataInputStream dis = new DataInputStream(System.in);

        try {
            System.out.print("Enter your name : ");
            String name = dis.readLine();
            System.out.print("Enter your age : ");
            int age = Integer.parseInt(dis.readLine());
            System.out.println("DataInputStream Results:");
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
        } catch (IOException e) {
            System.out.println("Error reading input: " + e.getMessage());
        } finally {
            try {
                dis.close();
            } catch (IOException e) {
                System.out.println("Error closing stream: " + e.getMessage());
            }
        }
    }
}