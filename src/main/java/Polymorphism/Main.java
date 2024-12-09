package Polymorphism;

class Person {
    public void makeSound(){
        System.out.println("Person sound");
    }

    class Main extends Cal {
        public void makesound() {
            System.out.println("Bark");
        }
    }
    public int add(int a, int b){
        return a + b;
    }

    public double add(double a, double b){
        return a+b;
    }


    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Person person = (Person) obj;
        return age == person.age && name.equals(person.name);
    }


    @Override
    public int hashCode(){
        return 32 * name.hashCode() + age;
    }

    @Override
    public String toString() {
        return "Person{name=" + name + ", age=" + age + "}";
    }
}

public class Main {
    public static void main(String[] args) {
        Person person = new Person("John", 30);
        System.out.println(person.toString());
        Person p1  = new Person("John", 38);
        Person p2 = new Person("John", 38);
        System.out.println(p1.equals(p2));
        Cal calc = new Cal();
        System.out.println(calc.add(5,10));
        System.out.println(calc.add(5.5,10.5));
        Main myCal = new Main();

    }
}
