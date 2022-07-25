package com.fdmgroup.tdd.groupcontroller;

import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

class GroupControllerServiceTest {

	GroupControllerServiceImpl controllerService;
	
	@Mock
	DatabaseReader databaseReaderMock;
	
	@Mock
	DatabaseWriter databaseWriterMock;
	
	@Mock
	Trainee traineeMock;
	
	@BeforeEach
	public void init() {
		MockitoAnnotations.openMocks(this);
		controllerService = new GroupControllerServiceImpl(databaseReaderMock, databaseWriterMock);
	}
	
	@Test
	public void getAllTrainees_CallReadGroupFromDatabaseReader_WhenCalled() {
		controllerService.getAllTrainees();
		verify(databaseReaderMock).readGroup();
	}
	
	@Test
	public void removeTraineebyUsername_CallDeleteTraineebyUsernameFromDatabaseWriter_WhenCalled() {
		controllerService.removeTraineeByUsername(traineeMock.getUsername());
		verify(databaseWriterMock).deleteTraineeByUsername(traineeMock.getUsername());
	}
	
	@Test
	public void addTrainee_CallAddTraineeFromDatabaseWriter_WhenCalled() {
		controllerService.addTrainee(traineeMock);
		verify(databaseWriterMock).addTrainee(traineeMock);
	}
	
	

}
