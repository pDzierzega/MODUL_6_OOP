package Day5_Repeat.Zad2;

public class Person {
    private final String PESEL;
    private final char gender;
    private final BirthDay birthDay;

    private String name;
    private String surname;

    public Person(String name, String surname, String PESEL) {
        this.name = name;
        this.surname = surname;
        this.PESEL = PESEL;
        this.birthDay=new BirthDay(PESEL);
        this.gender= birthDay.isMale()? 'm':'f';
    }

    public String getPESEL() {
        return PESEL;
    }

    public char getGender() {
        return gender;
    }

    public BirthDay getBirthDay() {
        return birthDay;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
}
