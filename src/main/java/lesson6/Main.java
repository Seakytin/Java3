package lesson6;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {

    private static final Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        logger.fatal("we have problem");
        logger.trace("we have problem");
        logger.debug("we have problem");
        logger.info("we have problem");
        logger.warn("we have problem");
        logger.error("we have problem");

    }
}
