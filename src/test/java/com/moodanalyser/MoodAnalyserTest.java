package com.moodanalyser;
import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
	 MoodAnalyser moodAnalyser = new MoodAnalyser();

	    @Test
	    public void moodSad() {
	        moodAnalyser.setMessage("I am in Sad Mood");
	        String actualResult = moodAnalyser.analyseMood();
	        Assert.assertEquals("SAD", actualResult);
	    }

	    @Test
	    public void moodHappy() {
	        moodAnalyser.setMessage("I am in Any Mood");
	        String actualResult = moodAnalyser.analyseMood();
	        Assert.assertEquals("HAPPY", actualResult);
	    }
}