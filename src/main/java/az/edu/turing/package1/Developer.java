package az.edu.turing.package1;

    public class Developer extends Employee{

        private String programmingLanguage;
        public Developer(String name, double salary, String programmingLanguage) {
            super(name, salary);
            this.programmingLanguage = programmingLanguage;

        }
        @Override
        public void displayInfo(){
            super.displayInfo();
            System.out.println("Programming Language: " + programmingLanguage);
        }
        public double calculateBonus(double percentage){
            double finalSalary = super.getSalary() * percentage;
            return finalSalary;
        }

    }

