package MyHomeworks;

public class TestInnerClass {
    public static void main(String[] args) {
        //To print Inner class method.
        OuterClass.InnerClass test = new OuterClass(13, "Piruza").new InnerClass();
        test.display();

        //To print Nested static Class method.
        OuterClass.StaticNestedClass.staticDisplay();

        //To print local Class method;
        OuterClass printlocal = new OuterClass();
        printlocal.outerMethod();

        //Testing anonymous classes.
        OuterClass.TestAnonymous anonymous = new OuterClass().new TestAnonymous() {
            @Override
            public void printSomething() {
                System.out.println("Something");
            }
        };

        anonymous.printSomething();

    }
}
