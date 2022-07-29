package com.sapiens.app.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="policy")
public class Policy {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name="first_name", nullable = false)
	private String firstName;
	@Column(name = "last_name")
	private String lastName;
	@Column(name = "date_of_birth", nullable = false)
	private Date dateOfBirth;
	@Column(name = "email", nullable = false)
	private String email;
	@Column(name = "contact_number", nullable = false)
	private String contactNumber;
	@Column(name = "gender")
	private String gender;
	@Column(name = "tobacco")
	private String tobacco;
	@Column(name = "annual_income", nullable = false)
	private Double annualIncome;
	@Column(name = "policy_type", nullable = false)
	private String policyType;
	@Column(name = "policy_status")
	private String policyStatus;
	@Column(name = "age_of_insurance")
	private Integer ageOfInsurance;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getTobacco() {
		return tobacco;
	}
	public void setTobacco(String tobacco) {
		this.tobacco = tobacco;
	}
	public Double getAnnualIncome() {
		return annualIncome;
	}
	public void setAnnualIncome(Double annualIncome) {
		this.annualIncome = annualIncome;
	}
	public String getPolicyType() {
		return policyType;
	}
	public void setPolicyType(String policyType) {
		this.policyType = policyType;
	}
	public String getPolicyStatus() {
		return policyStatus;
	}
	public void setPolicyStatus(String policyStatus) {
		this.policyStatus = policyStatus;
	}
	public Integer getAgeOfInsurance() {
		return ageOfInsurance;
	}
	public void setAgeOfInsurance(Integer ageOfInsurance) {
		this.ageOfInsurance = ageOfInsurance;
	}
	public Policy(Integer id, String firstName, String lastName, Date dateOfBirth, String email, String contactNumber,
			String gender, String tobacco, Double annualIncome, String policyType, String policyStatus,
			Integer ageOfInsurance) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.email = email;
		this.contactNumber = contactNumber;
		this.gender = gender;
		this.tobacco = tobacco;
		this.annualIncome = annualIncome;
		this.policyType = policyType;
		this.policyStatus = policyStatus;
		this.ageOfInsurance = ageOfInsurance;
	}
	public Policy() {
	}
	
	
}
