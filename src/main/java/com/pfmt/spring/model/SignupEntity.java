package com.pfmt.spring.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table (name="TEAM_MEMBERS")
public class SignupEntity {
	
	@Id
    @GeneratedValue
    private Integer teamMateId;
	
	@NotEmpty
	private String userName;
	private Long dob;
	private String password;
	private String email;
	private String mobileNo;
	
	public SignupEntity() {
		
	}
	
	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}
	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	/**
	 * @return the dob
	 */
	public Long getDob() {
		return dob;
	}
	/**
	 * @param dob the dob to set
	 */
	public void setDob(Long dob) {
		this.dob = dob;
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
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the mobileNo
	 */
	public String getMobileNo() {
		return mobileNo;
	}
	/**
	 * @param mobileNo the mobileNo to set
	 */
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	
	@Override
	public String toString() {
		return "Signup [teamMateId=" + teamMateId + ", userName=" + userName + ", dob=" + dob + ", password=" + password
				+ ", email=" + email + ", mobileNo=" + mobileNo + "]";
	}
}
