
public class Student {
    int rollno;
    String name;
    static String college = "DSU";

    Student(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }

    void display() {
        System.out.println(rollno + " " + name + " " + college);
    }
}

void main() {
    Student s1 = new Student(20, "ABC");
    Student s2 = new Student(18, "Able");
    s1.display(); s2.display();
}