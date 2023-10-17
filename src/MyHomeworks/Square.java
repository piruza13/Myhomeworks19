package MyHomeworks;

public class Square extends Shape {
    private int side;
    public Square (int side) {
        this.side = side;
    }

    @Override
    int calculateArea() {
        int area = side * side;
        return area;
    }

    @Override
    int calculatePerimeter() {
        int perimeter = 4 * side;
        return  perimeter;
    }
}
