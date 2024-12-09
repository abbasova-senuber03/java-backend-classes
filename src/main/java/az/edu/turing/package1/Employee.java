package az.edu.turing.package1;

public class Employee {
        private String name;
        private double salary;
        private double percentage = 0.5;
        public Employee(String name, double salary){
            this.name = name;
            this.salary = salary;
        }
        public String getName(){
            return name;
        }
        public void setName(String name){
            this.name = name;
        }
        public double getSalary(){
            return salary;
        }
        public void setSalary(double salary){
            this.salary = salary;
        }
        public void displayInfo(){
            System.out.println("Name: " + name);
            System.out.printf("Salary: %.2f%n", salary);
        }
        public double calculateBonus(double percentage, double fixedAmount){
            return salary += salary * percentage + fixedAmount;
        }
        @Override
        public String toString(){
            return "Employee Details: " + name + ", Salary: " + salary;
        }
    }

