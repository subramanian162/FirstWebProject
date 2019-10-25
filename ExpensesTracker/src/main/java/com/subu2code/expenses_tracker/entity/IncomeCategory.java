package com.subu2code.expenses_tracker.entity;

public class IncomeCategory {
	
	private Integer id;
	
	private String incomeCategoryName;
	
	private User user;
	
	public IncomeCategory()
	{
		
	}
	
	public IncomeCategory(String incomeCategoryName)
	{
		this.incomeCategoryName = incomeCategoryName;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getIncomeCategoryName() {
		return incomeCategoryName;
	}

	public void setIncomeCategoryName(String incomeCategoryName) {
		this.incomeCategoryName = incomeCategoryName;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
}
