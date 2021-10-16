public class LogLevels {
    
    public static String message(String logLine) {
        int startIndex = logLine.indexOf(": ");
        return logLine.substring(startIndex + 2).strip();
    }

    public static String logLevel(String logLine) {
        int endIndex = logLine.indexOf("]");
        return logLine.substring(1, endIndex).toLowerCase();
    }

    public static String reformat(String logLine) {
        return message(logLine) + " (" + logLevel(logLine) + ")";
    }
}
