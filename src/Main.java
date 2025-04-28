import java.util.Arrays;

public class Main {

    private static Employee[] employees = new Employee[10];



    public static void main(String[] args) {

        employees[0] = new Employee("Michael Scott", 1, 1000);
        employees[1] = new Employee("Dwight Schrute", 2, 500);
        employees[2] = new Employee("Jim Halpert", 2, 550);
        employees[3] = new Employee("Pam Beesly", 3, 300);
        employees[4] = new Employee("Kevin Malone", 4, 400);
        employees[5] = new Employee("Angela Martin", 4, 400);
        employees[6] = new Employee("Oscar Martinez", 4, 450);
        employees[7] = new Employee("Stanley Hudson", 5, 650);
        employees[8] = new Employee("Phyllis Vance", 5, 600);
        employees[9] = new Employee("Andy Bernard", 2, 500);


        printAllInfo();
        System.out.println("Сумма зп всех сотрудников : " + summarizeSalary() );
        System.out.println("Сотрудник с минимальной ЗП : " + findMinSalaryEmployee() );
        System.out.println("Сотрудник с максимальной ЗП : " + findMaxSalaryEmployee() );
        System.out.println("Средняя зп всех сотрудников : " + average_OutSalary() );
        printAllNames();


    }

    private static void printAllInfo () {
        for (Employee employee : employees) {
            System.out.println(employee);

        }
    }

    private static int summarizeSalary () {
        int totalSum = 0;
        for (Employee employee : employees) {
            totalSum += employee.getSalary();
        }
        return totalSum;
    }

    private static Employee findMinSalaryEmployee (){
        Employee employeeMinSalary = null;
        for (Employee employee : employees) {
            if (employeeMinSalary == null || employee.getSalary() < employeeMinSalary.getSalary()) {
                employeeMinSalary = employee;
            }
        }
            return employeeMinSalary;
    }

    private static Employee findMaxSalaryEmployee (){
        Employee employeeMaxSalary = null;
        for (Employee employee : employees) {
            if (employeeMaxSalary == null || employee.getSalary() > employeeMaxSalary.getSalary()) {
                employeeMaxSalary = employee;
            }
        }
            return employeeMaxSalary;
    }

    private static double average_OutSalary () {
        return (double) summarizeSalary() / employees.length;
    }

    private static void printAllNames () {
        for (Employee employee : employees) {
            System.out.println(employee.getName());

        }
    }


}