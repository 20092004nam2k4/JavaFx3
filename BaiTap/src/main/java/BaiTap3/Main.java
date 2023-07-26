package BaiTap3;

import javafx.stage.Stage;

import static javafx.application.Application.launch;

public class Main {
    public static void main(String[] args) {
        launch(args);
    }



    public void start(Stage primaryStage) {
        LazyPrimeFactorization lazyPrimeFactorization = new LazyPrimeFactorization();
        OptimizedPrimeFactorization optimizedPrimeFactorization = new OptimizedPrimeFactorization();

        Thread lazyThread = new Thread(lazyPrimeFactorization);
        Thread optimizedThread = new Thread(optimizedPrimeFactorization);

        lazyThread.start();
        optimizedThread.start();
    }
}
