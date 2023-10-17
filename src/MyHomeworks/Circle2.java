package MyHomeworks;
   public class Circle2 extends Shape {
    private int radius;
    public Circle2 (int radius) {
        this.radius = radius;
    }

     public int calculateArea() {
        float pi = 3.14F;
        int area = (int) (pi * radius * radius);
        return area;
    }

       @Override
       int calculatePerimeter() {
           float pi = 3.14F;
           int perimeter = (int) (2*pi*radius);
           return perimeter;
       }
   }
