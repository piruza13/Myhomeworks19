public class StaticExample {
    private static int counter = 0;
    public StaticExample () {
        counter++;
    }
        public static int getCounter() {
            return counter;
        }
}
