
interface IMovable {

    void move();
}

class Car implements IMovable {

    @Override
    public void move() {
        System.out.println("The car is driving.");
    }
}

class Bicycle implements IMovable {

    @Override
    public void move() {
        System.out.println("Bicycle is pedaling.");
    }
}

class Airplane implements IMovable {

    @Override
    public void move() {
        System.out.println("The airplane is flying.");
    }
}
