package Day11_Thread.WatkiZImionami;


public class Main {
    public static void main(String[] args) {
        Thread[] threads=new Thread[10];
        WatekZImieniem[] watki=new WatekZImieniem[10];

        watki[0]=new WatekZImieniem("Adam");
        watki[1]=new WatekZImieniem("Basia");
        watki[2]=new WatekZImieniem("Czesław");
        watki[3]=new WatekZImieniem("Dominika");
        watki[4]=new WatekZImieniem("Edward");
        watki[5]=new WatekZImieniem("Felicja");
        watki[6]=new WatekZImieniem("Grzegorz");
        watki[7]=new WatekZImieniem("Hania");
        watki[8]=new WatekZImieniem("Ireneusz");
        watki[9]=new WatekZImieniem("Janina");

        for (int i = 0; i <threads.length ; i++) {
            threads[i]=new Thread(watki[i]);
            threads[i].start();
        }
    }
}
