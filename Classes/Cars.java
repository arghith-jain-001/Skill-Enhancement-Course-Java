public class Cars {
    public static void main(String[] args) {
        Car car1 = new Car("BMW", "red");
    }
}

class Car {
    String name, color;

    Car(String name, String color){
        this.name = name;
        this.color = color;
        this.display();
    }
     void display() {
        IO.println("Name: " + name + " | Color: " + color);
    }
}
