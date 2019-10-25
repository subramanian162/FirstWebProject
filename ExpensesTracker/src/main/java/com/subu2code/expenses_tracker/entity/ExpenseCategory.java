package com.subu2code.expenses_tracker.entity;

public class ExpenseCategory {

	private Integer id;
	
	private String expenseCategoryName;

	private User user;
	
	public ExpenseCategory()
	{
		
	}
	
	public ExpenseCategory(String expenseCategoryName)
	{
		this.expenseCategoryName = expenseCategoryName;
	}

	public String getExpenseCategoryName() {
		return expenseCategoryName;
	}

	public void setExpenseCategoryName(String expenseCategoryName) {
		this.expenseCategoryName = expenseCategoryName;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
}
