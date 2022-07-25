package com.fdmgroup.javadoc_demo;

/**
 * The {@link TraineeGradeCalculator}calculator is an application that computes the grade of the trainees
 * based on their scores.
 * 
 * @author Gibson.Lam
 * @version 0.0.1 -SNAPSHOT
 * @since 2020-06-23
 * @see Calculator
 * 
 */
//major.minor.debug(for the version number)
public class TraineeGradeCalculator extends Calculator {
	private int score;
	private int totalScore;

	
	public int getScore() {
		return score;
	}

	
	public void setScore(int score) {
		this.score = score;
	}

	public int getTotalScore() {
		return totalScore;
	}

	public void setTotalScore(int totalScore) {
		this.totalScore = totalScore;
	}

	/**
	 * This method computes for the grade of the trainees by dividing score by total
	 * score.
	 * @param score : int
	 * @param total : int
	 * @return : double
	 */
	public double computeGrade(int score, int total) {
		return score / total * 100;
	}
}
