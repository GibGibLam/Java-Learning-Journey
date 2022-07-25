package com.fdmgroup.enum_demo;

import java.security.DomainCombiner;

public class TraineeEnum {

	//Manual way of doing enum
	final String SOFTWARE_DEVELOPMENT = "SOFTWARE_DEVELOPMENT";
	final String BUSINESS_INTELLIGENCE = "BUSINESS_INTELLIGENCE";
	final String CLOUD = "CLOUD";
	
	public enum DatabaseState{
		OPEN,CLOSE,BLOCKED
	}
	public enum FDMStreams{
		SOFTWARE_DEVELOPMENT, BUSINESS_INTELLIGENCE, CLOUD
	}
	
	public static void main(String[] args) {
		FDMStreams ryanStream = FDMStreams.SOFTWARE_DEVELOPMENT;
		if (ryanStream.equals(FDMStreams.SOFTWARE_DEVELOPMENT))
			System.out.println("You are under Software Development stream");
	}
}
