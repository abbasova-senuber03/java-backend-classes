package az.edu.turing.package1;

    public class Manager extends Employee{
        private int teamSize;
        public Manager(String name, double salary, int teamSize) {
            super(name, salary);
            this.teamSize = teamSize;
        }
        public int getTeamSize() {
            return teamSize;
        }
        public void setTeamSize(int teamSize) {
            this.teamSize = teamSize;
        }
        @Override
        public void displayInfo(){
            System.out.println("Name: " + super.getName());
            System.out.println("Salary: " + super.getSalary());
            System.out.println("Team Size: " + getTeamSize());
        }
        public double calculateBonus(double fixedAmount){
            double totalSalary = super.getSalary() + fixedAmount;
            return totalSalary;
        }

    }

