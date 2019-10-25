package com.subu2code.expenses_tracker.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.subu2code.expenses_tracker.validate.ComparePasswords;

@Entity
@Table(name="user")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Integer id;
	
	@Size(min=5,max=20)
	@Column(name="name")
	private String name;
	
	@Column(name="email")
	@Pattern(regexp="^[\\w-\\+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-z]{2,})$", message="Enter an valid Email Id")
	private String email;
	
	@Column(name="password")
	@Pattern(regexp="^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{6,8}$",message="Pattern not match")
	private String password;
	
	@Column(insertable= false ,updatable= false)
	@Pattern(regexp="^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{6,8}$",message="Pattern not match")
	private String confirm_password;
	
	@ComparePasswords
	private String check_passwords = "";
	
	public User()
	{

	}

	public User(String name, String email, String password) {
		this.name = name;
		this.email = email;
		this.password = password;
	}

	public User(String name, String email, String password, String confirm_password) {
		this.name = name;
		this.email = email;
		this.password = password;
		this.confirm_password = confirm_password;
		this.check_passwords = password+" "+confirm_password;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
		this.check_passwords = this.check_passwords+password;
	}

	public String getConfirm_password() {
		return confirm_password;
	}

	public void setConfirm_password(String confirm_password) {
		this.confirm_password = confirm_password;
		this.check_passwords = this.check_passwords+confirm_password;
	}

	public String getCheck_passwords() {
		return check_passwords;
	}

	public void setCheck_passwords(String check_passwords) {
		this.check_passwords = check_passwords;
	}
}
