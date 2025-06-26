public class Logger {
    private static Logger logger;

    private Logger() {

    }

    public static Logger getLogger() {
        if (logger == null) {
            System.out.println("New Logger Created Once");
            logger = new Logger();
        }

        return logger;
    }
}
