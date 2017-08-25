package Day5_Repeat.Zad1;

import java.util.zip.DataFormatException;

public class MyTime {
    private int hour=0;
    private int minute=0;
    private int second=0;

    public MyTime() {}

    public MyTime(int hour, int minute, int second){
        this.setTime(hour,minute,second);
    }


    public void setTime(int hour, int minute, int second) {
        try {
            privateSetHour(hour);
            privateSetMinute(minute);
            privateSetSecond(second);
        } catch (DataFormatException e){
            e.getMessage();
            this.second=0;
            this.minute=0;
            this.hour=0;
            System.out.println("Utworzono obiekt z wartościami domyślnymi"+this.toString());
        }
    }

    private void privateSetHour(int hour) throws DataFormatException {
        if (hour<25&&hour>=0) {this.hour = hour;}
        else {throw new DataFormatException("Podano złą godzinę");}
    }

    private void privateSetMinute(int minute) throws DataFormatException {
        if (minute<60&&minute>=0) {this.minute = minute;}
        else {throw new DataFormatException("Podano złą godzinę");}
    }

    private void privateSetSecond(int second) throws DataFormatException{
        if (second<60&&second>=0) {this.second = second;}
        else {throw new DataFormatException("Podano złą godzinę");}
    }

    public void setHour(int hour){
        try {
            privateSetHour(hour);
        } catch (DataFormatException e){
            System.out.println(e.getMessage());
        }
    }

    public void setMinute(int minute){
        try {
            privateSetMinute(minute);
        } catch (DataFormatException e){
            System.out.println(e.getMessage());
        }
    }

    public void setSecond(int second){
        try {
            privateSetSecond(second);
        } catch (DataFormatException e){
            System.out.println(e.getMessage());
        }
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d",hour,minute,second);
    }

    public MyTime nextSecond(){
        second=(second+1)%60;
     return second==0? nextMinute():this;
    }

    public MyTime nextMinute(){
        minute=(minute+1)%60;
        return minute==0? nextHour():this;
    }

    public MyTime nextHour(){
        hour=(hour+1)%24;
        return this;
    }

    public MyTime previousSecond(){
        if (second==0){
            second=59;
            return previousMinute();
        } else {
            second--;
            return this;
        }
    }

    public MyTime previousMinute(){
        if (minute==0){
            minute=59;
            return previousHour();
        } else {
            minute--;
            return this;
        }
    }

    public MyTime previousHour(){
        if (hour==0) hour=23; else hour--;
            return this;
        }

}
