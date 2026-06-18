package Deepskilling.week1.Design_Patterns_and_Principles.Exercise1;

class Logger {

    // Single object of Logger class
    private static Logger instance;

    // Private constructor
    private Logger() {
        System.out.println("Logger Instance Created");
    }

    // Method to return single instance
    public static Logger getInstance() {

        if (instance == null) {
            instance = new Logger();
        }

        return instance;
    }

    public void log(String message) {
        System.out.println("LOG : " + message);
    }
}

public class SingletonTest {

    public static void main(String[] args) {

        Logger logger1 = Logger.getInstance();

        Logger logger2 = Logger.getInstance();

        logger1.log("Application Started");
        logger2.log("Data Saved");

        System.out.println(logger1 == logger2);
    }
}
