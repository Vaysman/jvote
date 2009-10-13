package ru.wiseman.jvote.server;

import org.apache.log4j.Logger;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {	
	Logger logger = Logger.getLogger("ru.wiseman.jvote.client");
	logger.info("Client started");
        System.out.println( "Hello World!" );
	logger.info("Client finished");
    }
}
