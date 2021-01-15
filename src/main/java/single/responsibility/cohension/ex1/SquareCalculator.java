package single.responsibility.cohension.ex1;

public class SquareCalculator {

    public int calculateArea(Square square) {

        return square.getSize() * square.getSize();
    }

    public int calculateP(Square square) {
        return square.getSize() * 4;
    }

}
