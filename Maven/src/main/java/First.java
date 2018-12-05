
import org.apache.log4j.Logger;

public class First {

    private static Logger logger = Logger.getLogger(First.class);

    private void systemOutputViaLogger() {
        logger.info("wdwd");
        logger.info("hello");
    }

    public static void main(String[] args) {
        First first = new First();
        first.systemOutputViaLogger();
    }

}
