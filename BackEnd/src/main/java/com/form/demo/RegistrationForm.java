package com.form.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class RegistrationForm {
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String name;
	private String password;
	private String address;
	private String zipCode;
	private String city;
	
	public RegistrationForm() {
		
	}
	/**
	 * @param id
	 * @param name
	 * @param password
	 * @param address
	 * @param zipCode
	 * @param city
	 */
	public RegistrationForm(Long id, String name, String password, String address, String zipCode, String city) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.address = address;
		this.zipCode = zipCode;
		this.city = city;
	}
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
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
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * @return the zipCode
	 */
	public String getZipCode() {
		return zipCode;
	}
	/**
	 * @param zipCode the zipCode to set
	 */
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	/**
	 * @return the state
	 */
	public String getCity() {
		return city;
	}
	/**
	 * @param state the state to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	

}
