package isp;

public class Dog implements Animal {
    @Override
    public void walk() {
        System.out.println("dog can walk");
    }

    @Override
    public void fly() {
        throw new UnsupportedOperationException();
    }
}
