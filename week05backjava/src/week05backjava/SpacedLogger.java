package week05backjava;


  //Implement the SpacedLogger class
public class SpacedLogger implements Logger {
    
    public void log(String message) {
    	  // Print each character of the message with a space
    	for (char c : message.toCharArray()) {
            System.out.print(c + " ");
        }
        System.out.println();
    }

   
    public void error(String message) {
    	// Print the error message with each character spaced out
    	System.out.print("ERROR: ");
        for (char c : message.toCharArray()) {
            
        	System.out.print(c + " ");
        }
        System.out.println();
    }
}
