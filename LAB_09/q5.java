class Animal {
    public void makeSound() {
        System.out.println("Animal is making a sound");
    }
}

class Dog extends Animal {
    public void makeSound() {
        System.out.println("Dog is barking");
    }
}

class Cat extends Animal {
    // This code will result in a compile-time error
    public void makeSound(int loudness) {
        System.out.println("Cat is meowing");
    }
}

public class q5 {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.makeSound();
        
        Dog dog = new Dog();
        dog.makeSound();
        
        Cat cat = new Cat();
        cat.makeSound(3);
    }
}
