public class Employee {

    private static int idCounter = 1;


    private final String name;
    private int office;
    private int salary;
    private final int id;

    public Employee (String name, int office, int salary) {
        id = idCounter++;
        this.name = name;
        this.office = office;
        this.salary = salary;
    }



    public String getName() {
        return name;
    }

    public int getOffice() {
        return office;
    }

    public int getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setOffice(int office) {
        this.office = office;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", office=" + office +
                ", salary=" + salary +
                ", id=" + id;
    }
}
