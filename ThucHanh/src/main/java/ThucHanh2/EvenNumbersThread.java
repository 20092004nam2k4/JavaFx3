package ThucHanh2;

public class EvenNumbersThread extends Thread{
    @Override
    public void run(){
        for (int i = 2; i <= 10 ; i+= 2) {
            System.out.println(i);
        }
    }
    public static class Main{
        public static void main(String[] args) {
            EvenNumbersThread evenThread = new EvenNumbersThread();
            evenThread.start();
        }
    }
}
