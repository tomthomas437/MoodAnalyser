package com.moodanalyser;

public class MoodAnalyser {
	 public String analyseMood(String message) {
	        if (message.toLowerCase().contains("happy")) {
	            return "Happy";
	        } else if (message.toLowerCase().contains("sad")) {
	            return "Sad";
	        } else {
	            return null;
	        }
	    }

	    public static void main(String[] args) {
	        MoodAnalyser moodAnalyzer = new MoodAnalyser();
	        String mood = moodAnalyzer.analyseMood("I am Happy");
	        System.out.println(mood);
	        mood = moodAnalyzer.analyseMood("I am Sad");
	        System.out.println(mood);
	    }
}

