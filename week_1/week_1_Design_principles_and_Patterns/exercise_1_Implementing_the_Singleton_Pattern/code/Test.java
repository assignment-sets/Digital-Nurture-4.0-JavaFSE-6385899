public class Test {
    public static void main(String[] args) {
        Logger logger1 = Logger.getLogger();
        Logger logger2 = Logger.getLogger();
        Logger logger3 = Logger.getLogger();

        System.out.println("logger1 is same instance as logger2: " + (logger1 == logger2));
        System.out.println("logger2 is same instance as logger3: " + (logger2 == logger3));
    }
}
