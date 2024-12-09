package az.edu.turing.package1;

import java.util.ArrayList;
import java.util.List;

    public class Main {
        public static void main(String[] args) {

            List<Employee> employees = new ArrayList<>();
            employees.add(new Employee("John Doe", 20000.00));
            employees.add(new Employee("Jane Smith", 25000.00));
            employees.add(new Employee("Bob Johnson", 30000.00));
            for (Employee employee : employees) {
                System.out.println(employee);
            }
        }
    }

