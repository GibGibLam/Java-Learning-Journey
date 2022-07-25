package com.fdmgroup.tdd.groupcontroller;

import java.util.Map;

public class GroupControllerServiceImpl implements GroupControllerService {
	private DatabaseReader databaseReader;
	private DatabaseWriter databaseWriter;
	
	public GroupControllerServiceImpl(DatabaseReader databaseReader, DatabaseWriter databaseWriter) {
		this.databaseReader = databaseReader;
		this.databaseWriter = databaseWriter;
	}

	@Override
	public Map<String, Trainee> getAllTrainees() {
		databaseReader.readGroup();
		return null;
	}

	@Override
	public void addTrainee(Trainee trainee) {
		databaseWriter.addTrainee(trainee);
		
	}

	@Override
	public void removeTraineeByUsername(String traineeUsername) {
		databaseWriter.deleteTraineeByUsername(traineeUsername);
		
	}

	
}
