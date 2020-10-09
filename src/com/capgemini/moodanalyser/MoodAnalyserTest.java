package com.capgemini.moodanalyser;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MoodAnalyserTest {

	@Test
	public void givenSadMessage_ShouldReturnSadTest1_1() {
		MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Sad Mood");
		String mood = moodAnalyser.analyseMood();
		assertEquals("SAD", mood);
	}

	@Test
	public void givenNonSadMessage_ShouldReturnHappyTest1_2() {
		MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Happy Mood");
		String mood = moodAnalyser.analyseMood();
		assertEquals("HAPPY", mood);
	}
}
