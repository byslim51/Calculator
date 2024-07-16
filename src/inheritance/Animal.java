package inheritance;

public class Animal {
    private int id;
    public String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}
