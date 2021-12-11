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
    public void NullReturnHappy() throws MoodAnalyserException {
        moodAnalyser.setMessage(null);
        try {
            String actualResult = moodAnalyser.analyseMood();
            Assert.assertEquals("Entered Invalid Mood", actualResult);
        } catch (MoodAnalyserException e) {
        	System.out.println("Invalid Mood");
           e.printStackTrace();
        }
        System.out.println("The progarm is ended");
    }
    
}