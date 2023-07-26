package BaiTap1;

public class NumberGenerator implements Runnable{
    @Override
    public void run(){
        for (int i = 0; i <= 10; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(i + "ab");
        }
    }
    public static class Main{
        public static void main(String[] args) {
            NumberGenerator number1 = new NumberGenerator();
            NumberGenerator number2 = new NumberGenerator();

            Thread thread1 = new Thread(number1);
            Thread thread2 = new Thread(number2);

            thread1.setPriority(Thread.MAX_PRIORITY);
            thread2.setPriority(Thread.MIN_PRIORITY);

            thread1.start();
            thread2.start();

        }
    }
}
