public class MoodAnalyser {
    public static String message;

    // Constructor
    public MoodAnalyser(String message) throws MoodAnalyserException {
        this.message = message;
    }

    //Getter
    public String getMessage() {
        return message;
    }

    //Setter
    public void setMessage(String message) {
        this.message = message;
    }

    public String analyseMood() throws MoodAnalyserException {

        try {
            if (message.toLowerCase().contains("Sad")) {
                return "sad";
            } else {
                return "Happy";
            }
        }
        catch (NullPointerException e) {

            throw new MoodAnalyserException("Message should not be null ,moodanalyser exception" );

        }


        }
    }

