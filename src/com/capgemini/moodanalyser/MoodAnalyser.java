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
	 * @return Sad, Happy or Exception based on message input
	 * @throws com.capgemini.moodanalyser.MoodAnalysisException
	 */
	public String analyseMood() throws com.capgemini.moodanalyser.MoodAnalysisException {
		try {
			if (message.length() == 0) {
				throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.EMPTY_INPUT,
						"Message cannot be empty! Please enter proper message");
			}
			if (message.contains("Sad")) {
				return "SAD";
			} else {
				return "HAPPY";
			}
		} catch (NullPointerException e) {
			throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.NULL_INPUT,
					"Please enter proper message");
		}
	}
}
