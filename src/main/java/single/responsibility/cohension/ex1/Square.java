package single.responsibility.cohension.ex1;

public class Square extends shape {

    private int size;

    @Override
    public int calculateArea(int edge) {
        return edge * edge;
    }

    @Override
    public int calculateP(int edge) {
        return edge * 4;
    }

    @Override
    public void draw() {
        super.draw();
    }

    @Override
    public void rotate() {
        super.rotate();
    }

    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square.calculateArea(10));
    }

}


