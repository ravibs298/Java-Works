import java.io.*;
public class CWR_36 {
    public static void main(String[] args) {
        try {
            FileOutputStream fout = new FileOutputStream("file.txt");
            String s ="Hey, I'm Right here";
            byte[] b = s.getBytes();
            fout.write(b);
            fout.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}