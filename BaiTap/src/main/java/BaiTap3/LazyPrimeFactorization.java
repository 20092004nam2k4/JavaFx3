package BaiTap3;

import javafx.application.Platform;

import java.util.stream.IntStream;

public class LazyPrimeFactorization implements Runnable{
    @Override
    public void run() {
        System.out.println("LazyPrimeFactorization is running...");
        IntStream.iterate(2, number -> number + 1).forEach(number -> {
            if (isPrime(number)) {
                Platform.runLater(() -> System.out.println("LazyPrimeFactorization: " + number));
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
    }

    private boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}



class OptimizedPrimeFactorization implements Runnable {
    @Override
    public void run() {
        System.out.println("OptimizedPrimeFactorization is running...");
        for (int number = 2; ; number++) {
            if (isPrime(number)) {
                int finalNumber = number;
                Platform.runLater(() -> System.out.println("OptimizedPrimeFactorization: " + finalNumber));
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

}
