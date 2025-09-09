
class Animal {

    public void makeSound() {
        System.out.println("Some generic sound!");
    }
}

class Dog extends Animal {

    @Override
    public void makeSound() {
        System.out.println("Woof Woof!");
    }
}

class Cat extends Animal {

    @Override
    public void makeSound() {
        System.out.println("Meow Meow!");
    }
}
