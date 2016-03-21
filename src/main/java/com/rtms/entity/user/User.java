package com.rtms.entity.user;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import com.rtms.entity.BaseObject;

@Table(name = "USER")
public class User extends BaseObject {

	/**
	 * Is the user shopper
	 */
	public static final String SHOPPER = "SHOPPER";

	/**
	 * is the user an internal user 
	 */
	public static final String ADMIN = "ADMIN";

	@Id
	@Column(name = "USER_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long userID;

	@Size(min = 3, max = 50)
	@Column(name = "FIRST_NAME", nullable = false)
	private String firstName;

	@Size(min = 3, max = 50)
	@Column(name = "LAST_NAME", nullable = false)
	private String lastName;

	@Size(min = 3, max = 50)
	@Column(name = "MID_NAME", nullable = false)
	private String midName;

	@Size(min = 3, max = 500)
	@Column(name = "EMAIL_ID")
	private String emailID;

	@Size(min = 3, max = 500)
	@Column(name = "LOGIN_ID")
	private String loginID;

	@Size(min = 3, max = 500)
	@Column(name = "PASSWORD")
	private String password;

	@Size(min = 3, max = 500)
	@Column(name = "SECURITY_QUESTION")	
	private String securityQuestion;

	@Size(min = 3, max = 500)
	@Column(name = "SECURITY_ANSWER")
	private String securityAnswer;

	@Size(min = 3, max = 500)
	@Column(name = "USER_TYPE")
	private String userType;

	/**
	 * @return the userID
	 */
	public long getUserID() {
		return userID;
	}

	/**
	 * @param userID the userID to set
	 */
	public void setUserID(long userID) {
		this.userID = userID;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the midName
	 */
	public String getMidName() {
		return midName;
	}

	/**
	 * @param midName the midName to set
	 */
	public void setMidName(String midName) {
		this.midName = midName;
	}

	/**
	 * @return the emailID
	 */
	public String getEmailID() {
		return emailID;
	}

	/**
	 * @param emailID the emailID to set
	 */
	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}

	/**
	 * @return the loginID
	 */
	public String getLoginID() {
		return loginID;
	}

	/**
	 * @param loginID the loginID to set
	 */
	public void setLoginID(String loginID) {
		this.loginID = loginID;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

}
