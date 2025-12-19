package com.mph.model;

public class AttemptAnswer {

	private int id;
	private int attemptId;
	private int questionId;
	private String selectedOption;
	private boolean isCorrect;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAttemptId() {
		return attemptId;
	}
	public void setAttemptId(int attemptId) {
		this.attemptId = attemptId;
	}
	public int getQuestionId() {
		return questionId;
	}
	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}
	public String getSelectedOption() {
		return selectedOption;
	}
	public AttemptAnswer() {
		super();
	}
	public AttemptAnswer(int id, int attemptId, int questionId, String selectedOption, boolean isCorrect) {
		super();
		this.id = id;
		this.attemptId = attemptId;
		this.questionId = questionId;
		this.selectedOption = selectedOption;
		this.isCorrect = isCorrect;
	}
	public void setSelectedOption(String selectedOption) {
		this.selectedOption = selectedOption;
	}
	public boolean isCorrect() {
		return isCorrect;
	}
	public void setCorrect(boolean isCorrect) {
		this.isCorrect = isCorrect;
	}
}
