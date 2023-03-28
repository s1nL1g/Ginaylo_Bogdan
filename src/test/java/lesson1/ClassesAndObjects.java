package lesson1;

public class ClassesAndObjects {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name= "Vasiliy";
        person1.age= 43;
        Person person2 = new Person();
        person2.name= "Vova";
        person2.age= 18;
        int year1 = person1.calculateYearsToRetirement();
        int year2= person2.calculateYearsToRetirement();
        System.out.println("Першій людині до пенсії "+year1+" років");
        System.out.println("Другій людині до пенсії "+year2+" років");
    }
}
class Person{
    String name;
    int age;

    int  calculateYearsToRetirement(){
        int years=65-age;
        return years;
    }

    void speak(){
        for(int i=0;i<3;i++)
        System.out.println("Мене звати "+name+", мені "+age+" років і я алкаш");
    }
    void sayHi(){
        System.out.println("Privit");
    }
}
