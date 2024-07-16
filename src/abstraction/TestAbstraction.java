package abstraction;

public class TestAbstraction extends SomeAbstractClass {
    public static void main(String[] args) {
        TestAbstraction ze = new TestAbstraction();
        ze.sayHello();
        ze.sayBuy();
    }
    @Override
    public void sayBuy() {
        System.out.println("Buy from testAbstraction");
    }
}

