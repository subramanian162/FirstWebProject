package com.subu2code.expenses_tracker.services;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.subu2code.expenses_tracker.entity.ExpenseCategory;
import com.subu2code.expenses_tracker.entity.ExpenseTransaction;
import com.subu2code.expenses_tracker.entity.IncomeCategory;
import com.subu2code.expenses_tracker.entity.IncomeTransaction;
import com.subu2code.expenses_tracker.entity.User;

@Service
@Transactional
public class ExpensesTrackerService implements UserService{

	public void addNewUserDetails(User user) {
		// TODO Auto-generated method stub
		
	}

	public boolean isUserEmailAlreadyInUse(String email) {
		// TODO Auto-generated method stub
		return false;
	}

	public void addNewIncomeCategory(IncomeCategory incomeCategory) {
		// TODO Auto-generated method stub
		
	}

	public void addNewExpenseCategory(ExpenseCategory expenseCategory) {
		// TODO Auto-generated method stub
		
	}

	public void addNewIncomeTransaction(IncomeTransaction incomeTransaction) {
		// TODO Auto-generated method stub
		
	}

	public void addNewExpenseTransaction(ExpenseTransaction expenseTransaction) {
		// TODO Auto-generated method stub
		
	}
	

}
