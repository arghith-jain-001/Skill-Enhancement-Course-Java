
public class Objects {
    void main(String[] args) {
        Student student1 = new Student("Arghith", 20);
        Student student2 = new Student("Alagu", 21);
        student1.display();
        student2.display();
    }
}


class Student {
    String name;
    int age;
    Student (String name, int age) {
        this.name = name;
        this.age = age;
        this.display();
    }

    void display() {
        IO.println("Name: " + name + " | Age: " + age);
    }
}
