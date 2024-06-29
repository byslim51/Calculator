package polymorphism;

import java.util.ArrayList;

public class Whistle {

    public static void main(String[] args) {
        QuackBehavior duck1 = new MallardDuck();
        QuackBehavior duck2 = new RedHeadDuck();
        duck1.quack();
        duck2.quack();
        System.out.println("---");
        ArrayList<QuackBehavior> myList = new ArrayList<>();
        myList.add(new MallardDuck());
        myList.add(new RedHeadDuck());
        for (QuackBehavior duck : myList) {
            duck.quack();
        }
    }
}
