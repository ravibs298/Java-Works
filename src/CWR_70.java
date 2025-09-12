import java.util.Scanner;
public class CWR_70 {
    public static int[] insertion_sort(int arr[])
    {
        for(int i=1; i<arr.length; i++)
        {
            int key = arr[i];
            int j = i-1;
            while(j>=0 && arr[j]>key)
            {
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=key;
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int n = sc.nextInt();
        System.out.println("enter elements:- ");
        int arr[]= new int[n];
        for(int i=0; i<n; i++)
        {
            arr[i]=sc.nextInt();
        }
        insertion_sort(arr);
        System.out.println("Sorted array:- ");
        for(int i=0; i<arr.length; i++)
        {
            System.out.println(arr[i]);
        }
    }
}
// an e commerce company sells data about cutomers and products in same xml file
//both files have name and id element
// use namespace to differentiate bw both the files
// xml file
// name.xml , first name last name
