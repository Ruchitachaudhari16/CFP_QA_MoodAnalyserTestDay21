import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
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
}