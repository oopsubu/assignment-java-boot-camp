package com.example.week1.user;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.sql.Timestamp;
import java.util.List;
import java.util.Set;

public class UserResponse {
	private int id;
	private String username;
	@JsonIgnore
	private String password;
	private String firstName;
	private String lastName;
	private String telephone;
	private Timestamp createdAt;
	private Timestamp modifiedAt;
	private List<UserAddressResponse> address;
	private List<UserPaymentResponse> userPayments;

	public void setPassword(String password){
		this.password = password;
	}

	public String getPassword(){
		return password;
	}

	public void setLastName(String lastName){
		this.lastName = lastName;
	}

	public String getLastName(){
		return lastName;
	}

	public void setCreatedAt(Timestamp createdAt){
		this.createdAt = createdAt;
	}

	public Timestamp getCreatedAt(){
		return createdAt;
	}

	public void setTelephone(String telephone){
		this.telephone = telephone;
	}

	public String getTelephone(){
		return telephone;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setModifiedAt(Timestamp modifiedAt){
		this.modifiedAt = modifiedAt;
	}

	public Timestamp getModifiedAt(){
		return modifiedAt;
	}

	public void setFirstName(String firstName){
		this.firstName = firstName;
	}

	public String getFirstName(){
		return firstName;
	}

	public void setUsername(String username){
		this.username = username;
	}

	public String getUsername(){
		return username;
	}

	public List<UserAddressResponse> getAddress() {
		return address;
	}

	public void setAddress(List<UserAddressResponse> address) {
		this.address = address;
	}

	public List<UserPaymentResponse> getUserPayments() {
		return userPayments;
	}

	public void setUserPayments(List<UserPaymentResponse> userPayments) {
		this.userPayments = userPayments;
	}

	@Override
 	public String toString(){
		return 
			"User{" + 
			"password = '" + password + '\'' + 
			",last_name = '" + lastName + '\'' + 
			",created_at = '" + createdAt + '\'' + 
			",telephone = '" + telephone + '\'' + 
			",id = '" + id + '\'' + 
			",modified_at = '" + modifiedAt + '\'' + 
			",first_name = '" + firstName + '\'' + 
			",username = '" + username + '\'' + 
			"}";
		}
}
