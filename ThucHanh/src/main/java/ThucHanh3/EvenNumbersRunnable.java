package ThucHanh3;

public class EvenNumbersRunnable implements Runnable{
    @Override
    public void run(){
        for (int i = 2; i < 10 ; i+=2) {
            System.out.println(i);
        }
    }
    public static class Main{
        public static void main(String[] args) {
            EvenNumbersRunnable evenRunnable = new EvenNumbersRunnable();
            Thread evenThread = new Thread(evenRunnable);
            evenThread.start();
        }
    }
}
