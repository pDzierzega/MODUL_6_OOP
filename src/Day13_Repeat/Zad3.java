package Day13_Repeat;

import java.util.Random;

public class Zad3 {
    private Random generator=new Random();
    private double max=-100;
    private double min=100;
    private int positiv;
    private int negativ;

    public Zad3(int n) {
        for (int i = 0; i <n ; i++) {
            nextRand(i);
        }
        double posNeg=((double)positiv/negativ);
        System.out.printf("MAX=%.2f ,MIN=%.2f POSITIVE/NEGATIVE=%d/%d=%.15f ",max,min,positiv,negativ,posNeg);
    }

    private void nextRand(int i){
        double random=(generator.nextDouble()-0.5)*200;
        if (random>max) max=random; else if (random<min) min=random;
        if (random>0)  positiv++; else negativ++;
    }
}
