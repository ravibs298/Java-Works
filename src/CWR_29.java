class CWR_29{
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        int a=0;
        for (int i=1;i< num-1;i++){
            if (num % i==0){
                a=1;
                break;
            }
        }
        if (num == 1){
            System.out.println(num+" "+ "is neither prime nor composite");
        }
        else if (a == 0){
            System.out.println(num+" "+ "is a prime number");
        }
        else {
            System.out.println(num+" "+ "is not a prime number");
        }
    }
}