package single.responsibility.cohension.ex1;

public class SquareAreaCalculator {
    int size = 5;

    public int calculateArea() {
        var realSquare = size * size;
        return realSquare;
    }

    public int calculateP() {
        var realP = size * 4;
        return realP;
    }

    public void draw() {
        System.out.println("draw square now!!");
    }

    public void rotate() {
        System.out.printf("we rotate this square now!!");
    }

}
