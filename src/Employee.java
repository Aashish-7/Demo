import java.util.*;
import java.util.stream.Collectors;

public class Employee implements Comparable<Employee>{

    private int id;

    private String name;

    private String address;

    public Employee(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }



    public static void main(String[] args) {

        Employee employee = new Employee(101, "Abc", "delhi");
        Employee employee1 = new Employee(102, "Xyz", "mumbai");
        Employee employee2 = new Employee(103, "pqr", "pune");

        List<Employee> employees = new ArrayList<>();
        employees.add(employee);
        employees.add(employee2);
        employees.add(employee1);

        Collections.sort(employees);

        for (Employee employee3 : employees){
            System.out.println(employee3.id + " " + employee3.name + " " + employee3.address);
        }
    }

    @Override
    public int compareTo(Employee o) {
        return this.id - o.id;
    }
}
