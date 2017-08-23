package Day2_Inheritance.Figure;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Rectangle kwadrat=new Squere(1);
        System.out.println(kwadrat.getAre());
        System.out.println(kwadrat.toString());

        Squere prawdziwyKwadrat=new Squere(1);
        prawdziwyKwadrat.jestemKwadratem(); //
        System.out.println(prawdziwyKwadrat.getAre());
        System.out.println(prawdziwyKwadrat);
        
    }
}
