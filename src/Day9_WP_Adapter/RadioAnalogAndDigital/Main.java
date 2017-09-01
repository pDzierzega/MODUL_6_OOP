package Day9_WP_Adapter.RadioAnalogAndDigital;

public class Main {
    public static void main(String[] args) {
        RadioFM radioFM=new RadioFM();
        radioFM.printAnalog();

        DigitalRadio radio=new DigitalRadio();
        radio.printDigit();
    }
}
