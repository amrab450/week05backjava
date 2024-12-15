package week05backjava;


//Implement the AsteriskLogger class
public class AsteriskLogger implements Logger {
   
    public void log(String message) {
    	// Print the message with 3 asterisks on either side
    	System.out.println("***" + message + "***");
    }

   
    public void error(String message) {
    	 // Print the error message inside a box of asterisks
    	System.out.println("****************");
        System.out.println("***ERROR: " + message + "***");
        System.out.println("****************");
    }
}
