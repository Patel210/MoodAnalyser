package com.capgemini.moodanalyser;

public class MoodAnalyser {

	private String message;

	/**
	 * @param message Parameterized Constructor
	 */
	public MoodAnalyser(String message) {
		super();
		this.message = message;
	}

	/**
	 * Default Constructor
	 */
	public MoodAnalyser() {
		super();
	}

	/**
	 * @param message
	 * @return Sad or Happy based on message input
	 */
	public String analyseMood() {
		if (message.contains("Sad")) {
			return "SAD";
		} else {
			return "HAPPY";
		}
	}
}
