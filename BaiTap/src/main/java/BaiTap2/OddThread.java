package BaiTap2;

import java.io.IOException;

public class OddThread extends Thread{
    @Override
    public void run(){
        for (int i = 1; i <10 ; i+=2) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(i);
        }
    }
}

