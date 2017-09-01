package Day9_WP_Adapter.RadioAnalogAndDigital;

import java.util.Random;

public class DigitalRadio implements I_DigitalSignal {
    private boolean[] digitSignal;

    public DigitalRadio() {
        Random rand=new Random();
        digitSignal=new boolean[1000];
        for (int i = 0; i <digitSignal.length ; i++) {
            digitSignal[i]=rand.nextBoolean();
        }
    }

    @Override
    public boolean[] getDigit() {
        return digitSignal;
    }

    @Override
    public void setDigit(boolean[] digitData) {
        this.digitSignal=digitData;
    }

    @Override
    public void printDigit() {
        StringBuilder builder=new StringBuilder();
        char c;
        for (boolean b :digitSignal) {
            builder.append(b?"1":"0");
        }
        System.out.println(builder);
    }
}
