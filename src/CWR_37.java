import java.io.*;
public class CWR_37 {
    public static void main(String[] args) {
        try {
            FileInputStream fileInput = new
                    FileInputStream ("file.txt");
            byte[] buffer = new byte[1024];
            int bytesRead = 0;
            while ((bytesRead = fileInput.read(buffer))!=-1){
                System.out.println(new String(buffer, 0, bytesRead));
            }
            fileInput.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}