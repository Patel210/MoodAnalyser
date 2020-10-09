package com.capgemini.moodanalyser;

public class MoodAnalysisException extends Exception {
	ExceptionType type;

	enum ExceptionType {
		NULL_INPUT, EMPTY_INPUT
	}

	public MoodAnalysisException(ExceptionType type, String message) {
		super(message);
		this.type = type;
	}
}
