package studying1;

public class Person {
    int age;
    String name;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void printInfo(){
        System.out.println("hi there");
    }

    public static void main(String[] args) {
        Person person= new Person(25,"Oleg");
        System.out.println(person);
      //  person.printInfo();
    }
}
