import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
/* UC1-TC1.1-Given “I am in Sad Mood” message Should Return SAD*/
    @Test
    public void whenIaminSadMood_ShouldReturnSad() throws MoodAnalyserException {
        try {
            MoodAnalyser moodanalyser = new MoodAnalyser("sad");
            String actualResult = moodanalyser.analyseMood();
            Assert.assertEquals("sad",actualResult);
        }
        catch(Exception ex) {
            System.out.println(ex);
        }
    }
    /*UC1-TC1.1:- Given “I am in AnyMood” message Should Return HAPPY*/
    @Test
   public void whenIaminAnyMood_ShouldReturnHappy() throws MoodAnalyserException {
      try {
           MoodAnalyser moodanalyser = new MoodAnalyser("Sad");
            String actualResult = moodanalyser.analyseMood();
          Assert.assertEquals("Happy",actualResult);
       }
       catch(Exception ex) {
            System.out.println(ex);
       }
    }
}