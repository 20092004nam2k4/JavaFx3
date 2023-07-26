package BaiTap2;

public class EvenThread extends Thread {
    @Override
    public void run() {
        for (int i = 2; i < 10; i += 2) {
            try {
                Thread.sleep(15);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(i);
        }
    }
}
