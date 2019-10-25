package com.subu2code.expenses_tracker.entity;

import java.util.Date;

public class IncomeTransaction {

   private Integer id;
	
	private Date date;
	
	private String incomeCategoryName;
	
	private Integer amount;
	
	private String extraNotes;
	
	private User user;
	
	IncomeTransaction()
	{
		
	}

	public IncomeTransaction(Date date, String incomeCategoryName, Integer amount, String extraNotes) {
		this.date = date;
		this.incomeCategoryName = incomeCategoryName;
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

	public String getIncomeCategoryName() {
		return incomeCategoryName;
	}

	public void setIncomeCategoryName(String incomeCategoryName) {
		this.incomeCategoryName = incomeCategoryName;
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
		return "IncomeTransaction [user=" + user + ", date=" + date + ", incomeCategoryName=" + incomeCategoryName
				+ ", amount=" + amount + ", extraNotes=" + extraNotes + "]";
	}
}
