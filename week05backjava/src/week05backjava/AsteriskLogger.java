package week05backjava;

public class AsteriskLogger implements Logger {
   
    public void log(String message) {
        System.out.println("***" + message + "***");
    }

   
    public void error(String message) {
        System.out.println("****************");
        System.out.println("***ERROR: " + message + "***");
        System.out.println("****************");
    }
}