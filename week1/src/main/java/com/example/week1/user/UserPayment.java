package com.example.week1.user;

import javax.persistence.*;

@Entity
public class UserPayment{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String paymentType;
	private String provider;
	private String accountNo;
	private String expiry;

	@OneToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "user_id", nullable = false)
	private Users users;

	public Users getUser() {
		return users;
	}

	public void setUser(Users users) {
		this.users = users;
	}

	public void setPaymentType(String paymentType){
		this.paymentType = paymentType;
	}

	public String getPaymentType(){
		return paymentType;
	}

	public void setProvider(String provider){
		this.provider = provider;
	}

	public String getProvider(){
		return provider;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setExpiry(String expiry){
		this.expiry = expiry;
	}

	public String getExpiry(){
		return expiry;
	}

	public void setAccountNo(String accountNo){
		this.accountNo = accountNo;
	}

	public String getAccountNo(){
		return accountNo;
	}

	@Override
 	public String toString(){
		return 
			"UserPayment{" + 
			"payment_type = '" + paymentType + '\'' +
			",provider = '" + provider + '\'' + 
			",id = '" + id + '\'' + 
			",expiry = '" + expiry + '\'' + 
			",account_no = '" + accountNo + '\'' + 
			"}";
		}
}
