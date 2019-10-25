package com.subu2code.expenses_tracker.controller;

import javax.validation.Valid;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.subu2code.expenses_tracker.entity.User;

@Controller
@Transactional
public class ExpensesTrackerController {

	@Autowired
	SessionFactory sessionFactory;

	@RequestMapping("/")
	public ModelAndView showIndex() {
		ModelAndView view = new ModelAndView();
		view.setViewName("home_view");
		return view;
	}
	
	/*
	 * Here we perform the sign up form validation 
	 * and if it pass then insert the user details in to our user table by using service class
	 * 
	 * */
	@RequestMapping("/addUserCredentials")
	public ModelAndView checkUserData(@Valid @ModelAttribute("user") User user, BindingResult result) {
		ModelAndView view = new ModelAndView();

		if (!result.hasErrors()) {
			System.out.println(user.getName());
			System.out.println(user.getEmail());
			System.out.println(user.getPassword());
			System.out.println(user.getConfirm_password());
			System.out.println(user.getCheck_passwords());
			view.setViewName("home_view");
		}
		else
		{
		 view.setViewName("signup_view");
		}
		return view;
	}

	@RequestMapping("/login")
	public ModelAndView getLoginView() {
		ModelAndView view = new ModelAndView();
		view.setViewName("login_view");
		return view;
	}

	@RequestMapping("/signup")
	public ModelAndView getSignUpView() {
		ModelAndView view = new ModelAndView();
		view.setViewName("signup_view");
		view.addObject("user", new User());
		return view;
	}

	@RequestMapping("/spend")
	public ModelAndView getSpendView() {
		ModelAndView view = new ModelAndView();
		view.setViewName("spend_view");
		return view;
	}

	@RequestMapping("/income")
	public ModelAndView getIncomeView() {
		ModelAndView view = new ModelAndView();
		view.setViewName("income_view");
		return view;
	}

	@RequestMapping("/expense")
	public ModelAndView getExpenseView() {
		ModelAndView view = new ModelAndView();
		view.setViewName("expense_view");
		return view;
	}

	@RequestMapping("/incomeCategory")
	public ModelAndView getIncomeCategoryView() {
		ModelAndView view = new ModelAndView();
		view.setViewName("income_category_view");
		return view;
	}

	@RequestMapping("/expenseCategory")
	public ModelAndView getExpenseCategoryView() {
		ModelAndView view = new ModelAndView();
		view.setViewName("expense_category_view");
		return view;
	}

	public void testPersist() {
		System.out.println("Inside the check Hibernate push function to test the insert task\n");
		User user = new User("Subu", "subu@gmail.com", "subu");

		Session session = sessionFactory.getCurrentSession();

		session.saveOrUpdate(user);
		System.out.println("User added Successfully");

	}
}
