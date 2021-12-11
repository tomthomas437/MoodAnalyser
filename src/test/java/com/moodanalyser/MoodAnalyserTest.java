package com.moodanalyser;
import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
	MoodAnalyser moodAnalyser = new MoodAnalyser();

    @Test
    public void moodSad() throws MoodAnalyserException {
        moodAnalyser.setMessage("I am in Sad Mood");
        String actualResult = moodAnalyser.analyseMood();
        Assert.assertEquals("SAD", actualResult);
    }

    @Test
    public void moodHappy() throws MoodAnalyserException {
        moodAnalyser.setMessage("I am in Any Mood");
        String actualResult = moodAnalyser.analyseMood();
        Assert.assertEquals("HAPPY", actualResult);
    }

    @Test
    public void Null_MoodAnalysisException() {
        try {
            MoodAnalyser moodAnalyser = new MoodAnalyser(null);
            moodAnalyser.analyseMood();
        } catch (MoodAnalyserException e) {
            Assert.assertEquals(MoodAnalyserException.ExceptionType.ENTERED_NULL, e.exceptionType);
        System.out.println("Entered null");
        e.printStackTrace();
        }
    }

    @Test
    public void Empty_MoodAnalysisException() {
        try {
            MoodAnalyser moodAnalyser = new MoodAnalyser("");
            moodAnalyser.analyseMood();
        } catch (MoodAnalyserException e) {
            Assert.assertEquals(MoodAnalyserException.ExceptionType.ENTERED_EMPTY, e.exceptionType);
            System.out.println("The string is empty");
            e.printStackTrace();
        }
    }
}