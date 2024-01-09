import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
    /* UC:-1.TC1.1 Refactor:- Given “I am in Sad Mood” message in
    Constructor Should Return SAD*/
    @Test
    public void whenGivenSadMood_ShouldReturnSad() throws MoodAnalyserException {
        try {
            MoodAnalyser moodanalyser = new MoodAnalyser("I am in Sad Mood");
            String actualResult = moodanalyser.analyseMood();
            Assert.assertEquals("Happy", actualResult);
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
        /* UC1.TC1.2 Refactor Given “I am in Happy Mood” message in Return SAD */
    @Test
    public void wheninHappyMood_ShouldReturnSad () throws MoodAnalyserException {
        try {
            MoodAnalyser moodanalyser = new MoodAnalyser("I am in Happy Mood");
            String actualResult = moodanalyser.analyseMood();
            Assert.assertEquals("Sad", actualResult);
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
    /* Handle Exception if User Provides Invalid Mood*/
            @Test
            public void GivenNullMood_ShouldReturnHappy() throws MoodAnalyserException
            {
                try {
                    MoodAnalyser moodanalyser = new MoodAnalyser(null);
                    String actualResult = moodanalyser.analyseMood();
                    Assert.assertEquals("Happy", actualResult);
                }
                catch (Exception ex)
                {
                    System.out.println(ex);
                }
        }
    }
