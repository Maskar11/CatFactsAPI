package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4j2 {

    // Initialize Log4j logs
    private static final Logger logger = LogManager.getLogger(Log4j2.class);

    public static void main(String[] args) {

        System.out.println("Hello, user!");
        logger.trace("We've just greeted the user!");
        logger.debug("We've just greeted the user!");
        logger.info("We've just greeted the user!");
        logger.warn("We've just greeted the user!");
        logger.error("We've just greeted the user!");
        logger.fatal("We've just greeted the user!");
    }

    public static void startLoggerClass(String testClassName) {
        logger.info(testClassName + " at the class level is Starting...");
    }


    protected static void startLoggerMethod(String testClassName) {
        logger.info(testClassName + " before the Test is Starting...");
    }


    public static void endLoggerMethod(String testClassName) {
        logger.info(testClassName + " after the Test is Ending...");
    }


    public static void endLoggerClass(String testClassName) {
        logger.info(testClassName + " at the class level is Ending...");
    }


    //Info Level
    public static void info(String message) {
        logger.info(message);
    }


    //Warn Level
    public static void warn(String message) {
        logger.warn(message);
    }


    //Error Level
    public static void error(String message) {
        logger.error(message);
    }


    //Fatal Level
    public static void fatal(String message) {
        logger.fatal(message);
    }


    //Debug Level
    public static void debug(String message) {
        logger.debug(message);
    }

}
