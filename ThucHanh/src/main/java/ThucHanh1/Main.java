package ThucHanh1;

public class Main {
    public static int DISTANCE = 100;
    public static int Step = 2;
    public static void main(String[] args) {
        Car car1 = new Car("A");
        Car car2 = new Car("B");
        Car car3 = new Car("C");

        Thread thread1 =new Thread(car1);
        Thread thread2 =new Thread(car2);
        Thread thread3 =new Thread(car3);

        System.out.println("Distance: 100km");
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
