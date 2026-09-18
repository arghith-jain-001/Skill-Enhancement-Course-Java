
public class Objects {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "Arghith";
        student1.age = 20;
        student1.display();

        Student student2 = new Student();
        student2.name = "Alagu";
        student2.age = 21;
        student2.display();
    }
}

class Student {
    String name;
    int age;

    void display() {
        IO.println("Name: " + name + " | Age: " + age);
    }
}
