package com.subu2code.expenses_tracker.Dao;

import com.subu2code.expenses_tracker.entity.ExpenseCategory;
import com.subu2code.expenses_tracker.entity.ExpenseTransaction;
import com.subu2code.expenses_tracker.entity.IncomeCategory;
import com.subu2code.expenses_tracker.entity.IncomeTransaction;
import com.subu2code.expenses_tracker.entity.User;

public interface UserDao {
	
	public void insertNewUser(User user);
	
	public User getUserByEmail(String email);
	
	public void insertIncomeCategory(IncomeCategory incomeCategory);
	
	public void insertExpenseCategory(ExpenseCategory expenseCategory);
	
	public void insertIncomeTransaction(IncomeTransaction incomeTransaction);

	public void insertExpenseTransaction(ExpenseTransaction expenseTransaction);

}
