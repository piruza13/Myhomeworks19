package MyHomeworks;

public class OuterClass {
    private int outerNumber;
    private String outerString;

    public void outerMethod () {

        class LocalClass {
            public void localDisplay () {
                System.out.println("This is local Class.");
            }

        }
        LocalClass local = new LocalClass();
        local.localDisplay();
    }
    public OuterClass (){}

    public OuterClass (int outerNumber, String outerString) {
        this.outerNumber = outerNumber;
        this.outerString = outerString;
    }

     class InnerClass {
         public void display () {
           int number = outerNumber;
           String string = outerString;
             System.out.println("The number is:" + number + " and the Name is: " + string); }

     }

     static class StaticNestedClass {

        static void staticDisplay() {
            System.out.println("This is static Nested Class.");

        }

     }
     abstract class TestAnonymous {
         public abstract void printSomething();
     }


}
