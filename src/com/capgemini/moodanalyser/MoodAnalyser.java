package com.capgemini.moodanalyser;

public class MoodAnalyser {

	/**
	 * @param message
	 * @return Sad or Happy based on message input
	 */
	public String analyseMood(String message) {
		if (message.contains("Sad")) {
			return "SAD";
		} else {
			return "HAPPY";
		}
	}
}
