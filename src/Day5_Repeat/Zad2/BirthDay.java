package Day5_Repeat.Zad2;

import java.time.LocalDate;
import java.time.Period;

public class BirthDay {
    private final LocalDate dateOfBirth;
    private final boolean isMale;

    public BirthDay (String pesel){
        int year=Integer.parseInt(pesel.substring(0,2));
        int month=Integer.parseInt(pesel.substring(2,4));
        int day=Integer.parseInt(pesel.substring(4,6));

        if (month>12){
            month=month-20;
            year=year+2000;
        } else year=year+1990;

        dateOfBirth=LocalDate.of(year,month,day);
        isMale=isMale(pesel.charAt(pesel.length()));
    }

    private boolean isMale(char c){
        int isMale=Integer.parseInt(c+"");
        return isMale%2==1;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public boolean isMale() {
        return isMale;
    }

    public int howLongAlive(){
        LocalDate now=LocalDate.now();
        Period period=Period.between(dateOfBirth,now);
        return period.getDays();
    }
}
