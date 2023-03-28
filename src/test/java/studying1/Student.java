package studying1;

public class Student {
    int age;
    String name;
    int course;
    int height;
    double GPA;

    public Student(int age, String name, int course, int height, double GPA) {
        this.age = age;
        this.name = name;
        this.course = course;
        this.height = height;
        this.GPA = GPA;
    }

    public void printInfo() {
        System.out.println("Age " + age + "\n" + "Name " + name + "\n" + "Course " + course + "\n" + "Height " + height + "\n" + "GPA " + GPA);
    }
    public static void main(String[] args) {
        Student s = new Student(24, "Illa", 3, 175, 4.6);
        Student s1 = new Student(25, "Oleg", 3, 158, 4.8);
        Student s2 = new Student(23, "Nika", 4, 170, 5.0);
        Student s3 = new Student(22, "Oleksandr", 5, 175, 3.6);
        Student s4 = new Student(19, "Vika", 5, 172, 4.0);
        Student s5 = new Student(23, "Bogdan", 4, 175, 4.7);
        Student s6 = new Student(24, "Nazar", 5, 182, 4.2);
        Student s7 = new Student(21, "Stephan", 3, 180, 4.5);
        s.printInfo();
        System.out.println();
        s1.printInfo();
        System.out.println();
        s2.printInfo();
        System.out.println();
        s3.printInfo();
        System.out.println();
        s4.printInfo();
        System.out.println();
        s5.printInfo();
        System.out.println();
        s6.printInfo();
        System.out.println();
        s7.printInfo();
    }

}
