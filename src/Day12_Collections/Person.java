package Day12_Collections;

public  class Person implements Comparable{
    private String name;
    private String koszyk;

    public Person(String name, String koszyk) {
        this.name = name;
        this.koszyk = koszyk;
    }

    @Override
    public String toString() {
        return String.format("%-8s %s, \n%-8s %s\n","Name:",name,"koszyk:",koszyk);
    }

    @Override
    public int compareTo(Object o) {
        if (o instanceof Person){
            return ((Person) o).koszyk.length()-this.koszyk.length();
        }
        return 0;
    }
}