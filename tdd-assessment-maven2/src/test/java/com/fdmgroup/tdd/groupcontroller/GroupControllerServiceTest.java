package com.fdmgroup.tdd.groupcontroller;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

class GroupControllerServiceTest {
	
	@Mock
	DatabaseReader dbReaderMock;
	
	@Mock
	DatabaseWriter dbWriterMock;
	
	@BeforeEach
	public void initialize() {
		MockitoAnnotations.initMocks(this);
	}
	@Test
	void test_WhenCallServiceImplementation_TraineesReadFromDatabaseReader() {
		ImplementingClass class = new ImplementingClass(dbReaderMock, dbWriterMock);
		Trainee trainee = new Trainee();
		class.getAllTrainees(trainee);
		
		verify(dbReaderMock).readGroup(trainee);
	}
	
	@Test
	void test_WhenRemoveTrainee_DatabaseWriterCalled() {
	ImplementingClass class = new ImplementingClass(dbReaderMock, dbWriterMock);
	Trainee trainee = new Trainee();
	class.removeTraineeByUserName;
	verify(dbWriterMock).deleteTraineeByUsername(trainee);
	}
	
	@Test
	void test_WhenAddTrainee_DataBaseWriterCalled() {
		ImplementingClass class = new ImplementingClass(dbReaderMock, dbWriterMock);
		Trainee trainee = new Trainee();
		class.addTrainee;
		verify(dbWriterMock).addTrainee(trainee);
	}
}
