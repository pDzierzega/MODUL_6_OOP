package Day9_WP_Adapter.RadioAnalogAndDigital;

import java.util.Random;

public class RadioFM implements I_AnalogSignal{
    private double[] analogSignal;

    public RadioFM() {
        Random rand=new Random();
        analogSignal=rand.doubles(10000,0.0,2.0).toArray();
    }

    @Override
    public double[] getAnalog() {
        return analogSignal;
    }

    @Override
    public void setAnalog(double[] analogData) {
        this.analogSignal=analogData;
    }

    @Override
    public void printAnalog() {
        StringBuilder builder=new StringBuilder();
        for (double signal :analogSignal) {
            builder.append(signal+" ");
        }
        System.out.println(builder.toString());
    }
}
