package MyHomeworks;

public class ArandPer {
    public static void main(String[] args) {
        Circle2 c = new Circle2(7);
        Rectangle r = new Rectangle(2, 4);
        Square s = new Square(6);
        System.out.println("The perimeter of the circle is: " + c.calculatePerimeter());
        System.out.println("The area of the circle is: "  + c.calculateArea());
        System.out.println("The perimeter of the rectangle is: " + r.calculatePerimeter());
        System.out.println("The area of the rectangle is: " + r.calculateArea());
        System.out.println("The perimeter of the square is: " + s.calculatePerimeter());
        System.out.println("The area of the square is: " + s.calculateArea());

    }
}
