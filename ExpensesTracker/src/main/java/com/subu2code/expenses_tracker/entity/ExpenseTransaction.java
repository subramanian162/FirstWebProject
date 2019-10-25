package com.subu2code.expenses_tracker.entity;

import java.util.Date;

public class ExpenseTransaction {

	private Integer id; 
	
	private Date date;
	
	private String expenseCategoryName;
	
	private Integer amount;
	
	private String extraNotes;
	
	private User user;
	
	ExpenseTransaction()
	{
		
	}

	public ExpenseTransaction(Date date, String expenseCategoryName, Integer amount, String extraNotes) {
		this.date = date;
		this.expenseCategoryName = expenseCategoryName;
		this.amount = amount;
		this.extraNotes = extraNotes;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getExpenseCategoryName() {
		return expenseCategoryName;
	}

	public void setExpenseCategoryName(String expenseCategoryName) {
		this.expenseCategoryName = expenseCategoryName;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public String getExtraNotes() {
		return extraNotes;
	}

	public void setExtraNotes(String extraNotes) {
		this.extraNotes = extraNotes;
	}

	@Override
	public String toString() {
		return "ExpenseTransaction [user=" + user + ", date=" + date + ", expenseCategoryName=" + expenseCategoryName
				+ ", amount=" + amount + ", extraNotes=" + extraNotes + "]";
	}
}
