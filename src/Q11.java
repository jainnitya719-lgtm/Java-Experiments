public class Q11 {
}
abstract class Animal {

    abstract void sound();

    void eat() {
        System.out.println("Animal eats");
    }
}

class Dog extends Animal {

    void sound() {
        System.out.println("Dog barks");
    }

    void display(int a) {
        System.out.println("Number = " + a);
    }

    void display(int a, int b) {
        System.out.println("Sum = " + (a + b));
    }
}

class Demo {
    public static void main(String[] args) {

        Dog d = new Dog();

        // Method overriding
        d.sound();

        // Normal method
        d.eat();

        // Method overloading
        d.display(10);
        d.display(10, 20);
    }
}
