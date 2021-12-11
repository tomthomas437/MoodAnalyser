package com.moodanalyser;
import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
	   MoodAnalyser moodAnalyser = new MoodAnalyser();
	    @Test
	    public void givenMessage_IsProper_ShouldReturnSad() {
	        String actualResult = moodAnalyser.analyseMood("I am Sad in Mood");
	        Assert.assertEquals("SAD", actualResult);
	    }

	    @Test
	    public void givenMessage_IsProper_AndContain_Any_ShouldReturnHappy() {
	        String actualResult = moodAnalyser.analyseMood("I am in Any Mood");
	        Assert.assertEquals("HAPPY", actualResult);
	    }
}
