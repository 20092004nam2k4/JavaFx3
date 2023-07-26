package BaiTap4;

import java.util.Scanner;

public class guessNumberThread extends Thread {
    private int guessNumber = 0;
    private int count = 0;


    public guessNumberThread(int guessNumber) {
        this.guessNumber = guessNumber;
    }

    @Override
    public void run() {
        int randomNumber = 0;
        do {
            randomNumber = (int) (Math.random() * 100 + 1);
            count++;
            System.out.println(getName() + "doan so" + randomNumber);


            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        } while (randomNumber != guessNumber);
        System.out.println(getName() + "da doan ra so" + guessNumber + "trong" + count + "lan dem");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập một số nguyên để các thread đoán: ");
        int number = scanner.nextInt();

        guessNumberThread thread1 = new guessNumberThread(number);
        guessNumberThread thread2 = new guessNumberThread(number);

        thread1.setName("Thread 1");
        thread2.setName("Thread 2");

        thread1.start();
        thread2.start();
    }
}


