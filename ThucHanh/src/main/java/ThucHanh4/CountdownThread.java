package ThucHanh4;

public class CountdownThread extends Thread {
    @Override
    public void run() {
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public static class Main{
        public static void main(String[] args) {
            CountdownThread countThread = new CountdownThread();
            countThread.start();
        }
    }
}





