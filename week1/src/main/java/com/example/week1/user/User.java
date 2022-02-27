package com.example.week1.user;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;
import java.util.Set;

@Entity
public class User{
	@Id
	private int id;
	private String username;
	private String password;
	private String firstName;
	private String lastName;
	private String telephone;
	private Timestamp createdAt;
	private Timestamp modifiedAt;

	@OneToMany(fetch = FetchType.EAGER,
			mappedBy = "user")
	private Set<UserAddress> address;

	@OneToMany(fetch = FetchType.EAGER,
			mappedBy = "user")
	private Set<UserPayment> userPayments;

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

	public User setId(int id){
		this.id = id;
		return null;
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

	public Set<UserAddress> getAddress() {
		return address;
	}

	public void setAddress(Set<UserAddress> address) {
		this.address = address;
	}

	public Set<UserPayment> getUserPayments() {
		return userPayments;
	}

	public void setUserPayments(Set<UserPayment> userPayments) {
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
