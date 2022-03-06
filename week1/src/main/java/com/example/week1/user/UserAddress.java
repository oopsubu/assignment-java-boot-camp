package com.example.week1.user;

import javax.persistence.*;

@Entity
public class UserAddress{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String country;
	private String addressLine2;
	private String addressLine1;
	private String city;
	private String postalCode;
	private String mobile;
	private String telephone;

	@ManyToOne(fetch = FetchType.LAZY , optional = false)
	@JoinColumn(name = "user_id", nullable = false)
	private Users users;

	public Users getUser() {
		return users;
	}

	public void setUser(Users users) {
		this.users = users;
	}

	public void setCountry(String country){
		this.country = country;
	}

	public String getCountry(){
		return country;
	}

	public void setAddressLine2(String addressLine2){
		this.addressLine2 = addressLine2;
	}

	public String getAddressLine2(){
		return addressLine2;
	}

	public void setAddressLine1(String addressLine1){
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine1(){
		return addressLine1;
	}

	public void setCity(String city){
		this.city = city;
	}

	public String getCity(){
		return city;
	}

	public void setMobile(String mobile){
		this.mobile = mobile;
	}

	public String getMobile(){
		return mobile;
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

	public void setPostalCode(String postalCode){
		this.postalCode = postalCode;
	}

	public String getPostalCode(){
		return postalCode;
	}

 	public String toString(){
		return 
			"UserAddress{" + 
			"country = '" + country + '\'' + 
			",address_line2 = '" + addressLine2 + '\'' +
			",address_line1 = '" + addressLine1 + '\'' + 
			",city = '" + city + '\'' + 
			",mobile = '" + mobile + '\'' + 
			",telephone = '" + telephone + '\'' + 
			",id = '" + id + '\'' + 
			",postal_code = '" + postalCode + '\'' + 
			"}";
		}
}
