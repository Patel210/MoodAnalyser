package com.capgemini.moodanalyser;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MoodAnalyserTest {

	@Test
	public void givenSadMessage_ShouldReturnSadTest1_1() {
		MoodAnalyser moodAnalyser = new MoodAnalyser();
		String mood = moodAnalyser.analyseMood("I am in Sad Mood");
		assertEquals("SAD", mood);
	}

	@Test
	public void givenNonSadMessage_ShouldReturnHappyTest1_2() {
		MoodAnalyser moodAnalyser = new MoodAnalyser();
		String mood = moodAnalyser.analyseMood("I am in Any Mood");
		assertEquals("HAPPY", mood);
	}
}
