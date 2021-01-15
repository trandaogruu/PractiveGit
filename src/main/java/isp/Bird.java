package isp;

public class Bird implements BirdAnimal ,DogAnimal{
    @Override
    public void fly() {
        System.out.println("bird can fly");
    }

    @Override
    public void walk() {

    }
}
