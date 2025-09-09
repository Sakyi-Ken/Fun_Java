
public class Main {

    public static void main(String[] args) {
        // ---Inheritance & Method Overriding ---
        System.out.println("\n=== Inheritance & Method Overriding Demo ===");
        Animal animal = new Animal();
        Animal dog = new Dog();
        Animal cat = new Cat();

        animal.makeSound();
        dog.makeSound();
        cat.makeSound();

        // --- Abstract Class ---
        System.out.println("\n=== Abstract Class Demo ===");
        Shape circle = new Circle(2.5);
        Shape rectangle = new Rectangle(10, 12);

        System.out.printf("Circle Area: %.2f%n", circle.getArea());
        System.out.printf("Rectangle Area: %.2f%n", rectangle.getArea());

        // --- Interfaces ---
        System.out.println("\n=== Interfaces Demo ===");
        IMovable car = new Car();
        IMovable bicycle = new Bicycle();
        IMovable airplane = new Airplane();

        car.move();
        bicycle.move();
        airplane.move();
    }
}
