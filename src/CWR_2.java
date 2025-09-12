import java.util.Scanner;

public class CWR_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int N = sc.nextInt();
        int[] numbers = new int[N];
        System.out.println("Enter the elements");
        for (int i=0;i<N;i++){
            numbers [i] = sc.nextInt();
        }
        double sum = 0;
        for (int number : numbers){
            sum += number;
        }
        double mean = sum/N;
        System.out.println("Mean: "+mean);
        sc.close();
    }
}