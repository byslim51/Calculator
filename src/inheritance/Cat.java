package inheritance;

public class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow " + name);
    }

    public static void main(String[] args) {
        Animal myAnimal = new Cat();
        myAnimal.name = "Grisha";
        myAnimal.makeSound();
    }
}
