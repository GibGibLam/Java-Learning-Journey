package com.fdmgroup.collection_exercise;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.awt.Color;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CollectionExerciseTest {

	@Test
	@DisplayName("Qn2")
	public void test_setMethodReadsSeriesofNames_ReturnsSetWithNoDuplicate_WhenCalled() {
		Qn2_SetExercise setexercise = new Qn2_SetExercise();
		String name1 = "Faiz";
		String name2 = "Faiz";
		String name3 = "James";
		String name4 = "Ruban";
		assertEquals(3, setexercise.setMethod(name1,name2,name3,name4).size());
		
	}
	
	@Test
	@DisplayName("Qn3")
	public void test_HashMap() {
		Qn3_HashMap hashmap = new Qn3_HashMap();
		assertEquals(Color.RED, hashmap.colorFinder("red"));
		
	}
	
	@Test
	@DisplayName("Qn4")
	public void test_CountOccurence() {
		Qn4_HelloThere hello = new Qn4_HelloThere();
		hello.countOccurence("HELLO THERE");
		
		
	}
	
	@Test
	@DisplayName("Qn5")
	public void test_CountDuplicates() {
		Qn5_CountDuplicates cd = new Qn5_CountDuplicates();
		assertEquals(1, cd.CountDup("I I HATE THIS"));
	}
	
	@Test
	@DisplayName("Qn6")
	
	@Test
	@DisplayName("Qn7")
	
	@Test
	@DisplayName("Qn8")

}
