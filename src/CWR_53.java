public class CWR_53 {
    public static void main(String[] args) {
        Thread evenThread = new Thread(new EvenNumberPrinter());
        evenThread.setName("Even");
        evenThread.start();
        Thread oddThread = new Thread(new OddNumberPrinter());
        oddThread.setName("Odd");
        oddThread.start();
    }
    static class EvenNumberPrinter implements Runnable {
        private int evenNumber = 0;
        @Override
        public void run() {
            while (true) {
                try {
                    System.out.println(Thread.currentThread().getName() + " Thread: " + evenNumber);
                    evenNumber += 2;
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    System.out.println("Even thread interrupted");
                    break;
                }
            }
        }
    }
    static class OddNumberPrinter implements Runnable {
        private int oddNumber = 1;
        @Override
        public void run() {
            while (true) {
                try {
                    // Print odd number
                    System.out.println(Thread.currentThread().getName() + " Thread: " + oddNumber);
                    oddNumber += 2;
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    System.out.println("Odd thread interrupted");
                    break;
                }
            }
        }
    }
}