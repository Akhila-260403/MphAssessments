package com.mph.model;

public class Quiz {
	 
    private int quizId;
    private String title;
    private String category;
    private Integer createdBy;   // admin user_id
 
    // No-arg constructor
    public Quiz() {
    }
 
    // Getters and Setters
    public int getQuizId() {
        return quizId;
    }
 
    public void setQuizId(int quizId) {
        this.quizId = quizId;
    }
 
    public String getTitle() {
        return title;
    }
 
    public void setTitle(String title) {
        this.title = title;
    }
 
    public String getCategory() {
        return category;
    }
 
    public void setCategory(String category) {
        this.category = category;
    }
 
    public Integer getCreatedBy() {
        return createdBy;
    }
 
    public void setCreatedBy(Integer createdBy) {
        this.createdBy = createdBy;
    }
}