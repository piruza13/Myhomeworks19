package MyHomeworks;

  public class Rectangle extends Shape {
   private int length;
    private int width;

    public Rectangle (int length, int width) {
        this.length = length;
        this.width = width;
    }

    @Override
    int calculatePerimeter() {
        int perimeter = 2*(length + width);
        return perimeter;
    }

      @Override
      int calculateArea() {
          int area = length * width;
          return area;
      }
  }
