package ejerciciologger;

public class logger {
	private static logger instance;
    private List<String> logMessages = new ArrayList<>();

    private Logger() {
        // Constructor private
    }
    
    // Method static
    public static logger getInstance() {
        if (instance == null) {
            instance = new logger();
        }
        return instance;
    }
    
    // Add logs
    public void addLogMessage(String message) {
        LogMessages.add(message);
    }
    
    // Print logs
    public void printLogs() {
        for (String message : LogMessages) {
            System.out.println(message);
        }
    }
	

}
