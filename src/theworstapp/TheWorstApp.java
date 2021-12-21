/*
 * **** The Worst App (V0.1) ****
 * This is a really bad application that will blindly log whatever the command line arguments are.
 * It uses a really bad old version of Log4J.. so you can get it to do whatever you want to really.
 */
package theworstapp;

// Import the so called ominous LogManager.
import org.apache.logging.log4j.LogManager;

// Import the actual logger functionality.
import org.apache.logging.log4j.Logger;

/**
 * Here is a really bad application for your testing enjoyment.
 * @author Matthew
 */
public class TheWorstApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // I do love a good program banner.
        System.out.println("---------------------------");
        System.out.println("The Worst App (V0.1)");
        System.out.println("---------------------------");
        System.out.println();
        
        // Get a logger (normally this would be a field but we are a throwaway)
        Logger logger = LogManager.getLogger(TheWorstApp.class);
        
        // Make sure we're extra vulnerable on newer Java versions.
        System.setProperty("com.sun.jndi.ldap.object.trustURLCodebase", "true");

        // Check the user supplied one and only one param on the command line.
        if (args.length == 1) {
            // Log whatever command line argument was passed to us with total disregard for the consequences.
            logger.error("You told me to log \"" + args[0] + "\" and so I did.");
        } else {
            System.out.println("You're doing it wrong.");
        }
    }
}