package Day3_Polimofrizm.BookAndMusicCD;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Book HP1=new HarryPotter();
        Book HP2=new HarryPotter();
        Book HP3=new HarryPotter();
        Book HP4=new HarryPotter();
        Book HP5=new HarryPotter();
        Book HP6=new HarryPotter();
        Book HP7=new HarryPotter();

        Book LofR0=new LordOfTheRings();
        Book LofR1=new LordOfTheRings();
        Book LofR2=new LordOfTheRings();
        Book LofR3=new LordOfTheRings();

        ArrayList<Book> myProductList=new ArrayList<Book>();
        myProductList.add(HP1);
        myProductList.add(HP2);
        myProductList.add(HP3);
        myProductList.add(HP4);
        myProductList.add(HP5);
        myProductList.add(HP6);
        myProductList.add(HP7);
        myProductList.add(LofR0);
        myProductList.add(LofR1);
        myProductList.add(LofR2);
        myProductList.add(LofR3);


        }



}
