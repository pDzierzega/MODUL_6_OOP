package Employee;

public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    public Employee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName(){
        return firstName+" "+lastName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAnnualSallary(){
        return 12*salary;
    }

    public int raiseSalary (int percent){
        salary=(int) (salary+percent*0.01*salary);
        return salary;
    }

    @Override
    public String toString(){
        return String.format("Employee[id=%d ,name= %s ,salary= %d",id,getName(),salary);
    }
}
