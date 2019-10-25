package com.subu2code.expenses_tracker.services;

import com.subu2code.expenses_tracker.entity.ExpenseCategory;
import com.subu2code.expenses_tracker.entity.ExpenseTransaction;
import com.subu2code.expenses_tracker.entity.IncomeCategory;
import com.subu2code.expenses_tracker.entity.IncomeTransaction;
import com.subu2code.expenses_tracker.entity.User;

public interface UserService {
	
	public void addNewUserDetails(User user);
	
	public boolean isUserEmailAlreadyInUse(String email);
	
	public void addNewIncomeCategory(IncomeCategory incomeCategory);
	
	public void addNewExpenseCategory(ExpenseCategory expenseCategory);
	
	public void addNewIncomeTransaction(IncomeTransaction incomeTransaction);
	
	public void addNewExpenseTransaction(ExpenseTransaction expenseTransaction);

}
