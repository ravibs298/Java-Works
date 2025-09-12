import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CWR_56 {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\ASUS\\IdeaProjects\\FirstJavaProgram\\sample1java.txt";

        int lineCount = 0;
        int wordCount = 0;
        int sentenceCount = 0;
        int charCount = 0;
        int whitespaceCount = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;

            while ((line = reader.readLine()) != null) {
                lineCount++;
                charCount += line.length();
                for (char c : line.toCharArray()) {
                    if (Character.isWhitespace(c)) {  // Typo here! Should be isWhitespace
                        whitespaceCount++;
                    }
                }
                String[] words = line.split("\\s+");
                if (words.length > 0 && words[0].isEmpty()) {
                    wordCount += words.length - 1;
                } else {
                    wordCount += words.length;
                }
                String[] sentences = line.split("[.!?]+\\s*");
                sentenceCount += sentences.length;
                if (line.trim().isEmpty()) {
                    sentenceCount--;
                }
            }
            System.out.println("File Analysis Results for " + filePath + ":");
            System.out.println("----------------------------------");
            System.out.println("Lines: " + lineCount);
            System.out.println("Words: " + wordCount);
            System.out.println("Sentences: " + sentenceCount);
            System.out.println("Characters (including whitespaces): " + charCount);
            System.out.println("Whitespaces: " + whitespaceCount);

        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
            System.err.println("Please verify the file exists at: " + filePath);
        }
    }
}