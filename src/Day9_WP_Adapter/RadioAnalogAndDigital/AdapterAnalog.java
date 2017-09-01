package Day9_WP_Adapter.RadioAnalogAndDigital;

public class AdapterAnalog implements I_DigitalSignal {
    I_DigitalSignal digital;

    public AdapterAnalog(I_DigitalSignal digital) {
        this.digital = digital;
    }

    @Override
    public boolean[] getDigit() {
        return new boolean[0];
    }

    @Override
    public void setDigit(boolean[] digitData) {

    }

    @Override
    public void printDigit() {

    }
}
