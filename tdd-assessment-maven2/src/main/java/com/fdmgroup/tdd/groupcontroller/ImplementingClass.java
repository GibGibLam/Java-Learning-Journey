package com.fdmgroup.tdd.groupcontroller;

import java.util.Map;

public class ImplementingClass implements GroupControllerService {
	private DatabaseReader dbReader;
	private DatabaseWriter dbWriter;
	public Map<String, Trainee> getAllTrainees() {
		// TODO Auto-generated method stub
		return null;
	}
	public void addTrainee(Trainee trainee) {
		// TODO Auto-generated method stub
		
	}
	public void removeTraineeByUsername(String traineeUsername) {
		// TODO Auto-generated method stub
		
	}
	public ImplementingClass(DatabaseReader dbReaderMock, DatabaseWriter dbWriterMock) {
		this.dbReader = dbReaderMock;
		this.dbWriter = dbWriterMock;
	}
	
	
}
