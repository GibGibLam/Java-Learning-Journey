package com.fdmgroup.tdd.gradecalculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.fdmgroup.tdd.groupcontroller.Trainee;

import static org.mockito.Mockito.*;

import java.util.List;


class GradeCalculatorServiceTest {
	
	@Mock
	GradeCalculatorService gradeCalculatorServiceMock;
	
	@Mock
	List<Trainee> ListofTraineeMock;
	
	@BeforeEach
	public void initialize() {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	@DisplayName("Fail")
	void test_GradeCalculatorService_ReturnsFail_WhenMarkLessThanSeventyFive() {
		when(gradeCalculatorServiceMock.getClassification(74.0)).thenReturn("fail");
		assertEquals("fail",  gradeCalculatorServiceMock.getClassification(74.0));
	}
	@Test
	@DisplayName("Pass")
	void test_GradeCalculatorService_ReturnsFail_WhenMarkBetween75and79() {
		when(gradeCalculatorServiceMock.getClassification(76.0)).thenReturn("pass");
		assertEquals("pass",  gradeCalculatorServiceMock.getClassification(76.0));
		
	}@Test
	@DisplayName("Merit")
	void test_GradeCalculatorService_ReturnsFail_WhenMarkBetween80and89() {
		when(gradeCalculatorServiceMock.getClassification(81.0)).thenReturn("merit");
		assertEquals("merit",  gradeCalculatorServiceMock.getClassification(81.0));
		
	}@Test
	@DisplayName("Distinction")
	void test_GradeCalculatorService_ReturnsFail_WhenMarkBetween90and100() {
		when(gradeCalculatorServiceMock.getClassification(91.0)).thenReturn("distinction");	
		assertEquals("distinction",  gradeCalculatorServiceMock.getClassification(91.0));
	}
}
