import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingExampleService {
    private static final Logger logger = LoggerFactory.getLogger(LoggingExampleService.class);

    public static void main(String[] args){
        logger.error("This is a error message");
        logger.warn("This is a warning message");
        logger.info("This is a info message");
        logger.debug("This is a debug message with id {}", 999);
    }
}
