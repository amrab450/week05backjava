ackage week05backjava;


//Create the App class with the main method
public class App {
    public static void main(String[] args) {
    	// Instantiate instances of each logger class
    	
    	Logger asteriskLogger = new AsteriskLogger();
        Logger spacedLogger = new SpacedLogger();
       
        // Test both methods on both instances
       
        asteriskLogger.log("Hello");
        asteriskLogger.error("Hello");

        spacedLogger.log("Hello");
        spacedLogger.error("Hello");
    }
}
