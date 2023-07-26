package ThucHanh1;

import java.util.Random;

import static ThucHanh1.Main.DISTANCE;
import static ThucHanh1.Main.Step;

public class Car implements Runnable{
    private String name;
    public Car(String name) {
        this.name = name;
    }

    @Override
    public void run(){
        int starts = 0;
        long startTime = System.currentTimeMillis();

        while (starts < DISTANCE){
            try{
                int speed = (new Random()).nextInt(20);
                starts += speed;
                String log = "|";
                int percentTravel= (starts * 100) / DISTANCE;

                for (int i = 0; i < DISTANCE; i++) {
                    if (percentTravel >= i + speed){
                     log += "=";
                    }else if (percentTravel >= i && percentTravel < i + Step){
                        log += "o";
                    }else {
                        log += "-";
                    }
                }
                log += "|";
                System.out.println("Car" + this.name + ": " + log + " " + Math.min(DISTANCE, starts) + "KM");
                Thread.sleep(1000);
            }catch (InterruptedException e){
                System.out.println("Car" + this.name + " broken...");
                break;
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Car" + this.name + " Finish in " + (endTime - startTime) / 1000 + "s");
    }
}
