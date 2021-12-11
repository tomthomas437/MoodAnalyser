package com.moodanalyser;
import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
	   MoodAnalyser moodAnalyser = new MoodAnalyser();
	    @Test
	    public void moodSad() {
	        String actualResult = moodAnalyser.analyseMood("I am Sad in Mood");
	        Assert.assertEquals("SAD", actualResult);
	    }

	    @Test
	    public void moodHappy() {
	        String actualResult = moodAnalyser.analyseMood("I am in Any Mood");
	        Assert.assertEquals("HAPPY", actualResult);
	    }
}
