package inheritance;

public class Cat extends Animal {
    int age;

    @Override
    public void makeSound() {
        System.out.println("Meow " + name);
    }

    public static void main(String[] args) {
        Animal myAnimal = new Cat();
        myAnimal.name = "Grisha";
        myAnimal.makeSound();
        System.out.println(myAnimal);
        myAnimal = null;

    }
}
