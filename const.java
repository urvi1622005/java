class pd {
    String name;
    int age;

    pd() {
        name = "urvi";
        age = 19;
    }

    pd(String m, int a) {
        name = m;
        age = a;
    }

    void display() {
        System.out.println("Name: " + name + " Age: " + age);
    }
}

public class Const {

    public static void main(String[] args) {
        pd c = new pd();
        pd c1 = new pd("urvi", 19);

        c.display();
        c1.display();
    }
}


// class Car {
// String model;
// int year;

// // Default Constructor
// Car() {
// model = "Unknown";
// year = 2000;
// }

// // Parameterized Constructor
// Car(String m, int y) {
// model = m;
// year = y;
// }

// void display() {
// System.out.println("Model: " + model + ", Year: " + year);
// }
// }

// public class Main {
// public static void main(String[] args) {
// Car car1 = new Car();
// Car car2 = new Car("Tesla", 2023);
// car1.display();
// car2.display();
// }
// }
