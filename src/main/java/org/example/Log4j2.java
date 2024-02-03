package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4j2 {

    private static final Logger logger = LogManager.getLogger(Log4j2.class);

     public static void main(String[] args ) {
        System.out.println( "Hello, user!" );
        logger.trace("We've just greeted the user!");
        logger.debug("We've just greeted the user!");
        logger.info("We've just greeted the user!");
        logger.warn("We've just greeted the user!");
        logger.error("We've just greeted the user!");
        logger.fatal("We've just greeted the user!");
    }

    public static void startLog (String testClassName){
        logger.info("Test is Starting...");
    }

    public static void endLog (String testClassName){
        logger.info("Test is Ending...");
    }


    //Info Level
    public static void info (String message) {
        logger.info(message);
    }


    //Warn Level
    public static void warn (String message) {
        logger.warn(message);
    }


    //Error Level
    public static void error (String message) {
        logger.error(message);
    }


    //Fatal Level
    public static void fatal (String message) {
        logger.fatal(message);
    }


    //Debug Level
    public static void debug (String message) {
        logger.debug(message);
    }



}
