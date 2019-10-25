package com.subu2code.expenses_tracker.validate;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ComparePasswordsValidater implements ConstraintValidator<ComparePasswords, String>{

	public boolean isValid(String combinePassword, ConstraintValidatorContext context) {
       
		boolean isMatch = false;

		System.out.println(combinePassword);
		if(combinePassword!=null)
		{
			int mid = combinePassword.length()/2;
			String password = combinePassword.substring(0,mid);
			String confirmPassword = combinePassword.substring(mid, combinePassword.length());
			
			System.out.println(password+" "+confirmPassword);
			
			if(password.equals(confirmPassword))
			{
				isMatch = true;
			}
		}
		return isMatch;
	}
	

}
