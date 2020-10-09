package com.capgemini.moodanalyser;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MoodAnalyserTest {

	@Test
	public void givenSadMessage_ShouldReturnSadTest1_1() throws MoodAnalysisException {
		MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Sad Mood");
		String mood = moodAnalyser.analyseMood();
		assertEquals("SAD", mood);
	}

	@Test
	public void givenNonSadMessage_ShouldReturnHappyTest1_2() throws MoodAnalysisException {
		MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Happy Mood");
		String mood = moodAnalyser.analyseMood();
		assertEquals("HAPPY", mood);
	}

	@Test
	public void givenNullMessage_ShouldReturnHappyTest2_1() {
		MoodAnalyser moodAnalyser = new MoodAnalyser(null);
		String mood;
		try {
			mood = moodAnalyser.analyseMood();
			assertEquals("HAPPY", mood);
		} catch (MoodAnalysisException e) {
			e.getMessage();
		}
	}

	@Test
	public void givenNullMessage_ShouldThrowMoodAnalysisException3_1() {
		MoodAnalyser moodAnalyser = new MoodAnalyser(null);
		try {
			moodAnalyser.analyseMood();
		} catch (MoodAnalysisException e) {
			assertEquals(MoodAnalysisException.ExceptionType.NULL_INPUT, e.type);
		}
	}

	@Test
	public void givenEmptyMessage_ShouldThrowMoodAnalysisException3_2() {
		MoodAnalyser moodAnalyser = new MoodAnalyser("");
		try {
			moodAnalyser.analyseMood();
		} catch (MoodAnalysisException e) {
			assertEquals(MoodAnalysisException.ExceptionType.EMPTY_INPUT, e.type);
		}
	}

}
