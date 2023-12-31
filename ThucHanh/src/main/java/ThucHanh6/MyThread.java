package ThucHanh6;

public class MyThread extends Thread {
    @Override
    public void run() {
        DemoSynchronized.commonResource();
    }


    public static void main(String[] args) {
        MyThread myThread1 = new MyThread();
        MyThread myThread2 = new MyThread();

        // Đều start() hết các đối tượng MyThread
        // để xem Thread nào sẽ được vào commonResource()
        myThread1.start();
        myThread2.start();

        // In ra các trạng thái của chúng
        System.out.println(myThread1.getName() + ": " + myThread1.getState());
        System.out.println(myThread2.getName() + ": " + myThread2.getState());

    }
}

