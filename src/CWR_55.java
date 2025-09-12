import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStreamReader;

public class CWR_55 {

    public static void main(String[] args) {
        inputUsingBufferedReader();
    }
    public static void inputUsingBufferedReader() {
        System.out.println("\n--- Using BufferedReader ---");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Enter your name : ");
            String name = br.readLine();  // Reads line of text

            System.out.print("Enter your age : ");
            int age = Integer.parseInt(br.readLine());  // Read string and parse to int

            System.out.println("BufferedReader Results:");
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
        } catch (IOException e) {
            System.out.println("Error reading input: " + e.getMessage());
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                System.out.println("Error closing reader: " + e.getMessage());
            }
        }
    }
}