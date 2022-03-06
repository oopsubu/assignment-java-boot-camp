package com.example.week1.shopping;

import com.example.week1.payment.PaymentDetail;
import com.example.week1.user.Users;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
public class OrderDetails {
	@Id
	private int id;
	private double total;
	private Timestamp createdAt;
	private Timestamp modifiedAt;

	@OneToOne
	@JoinColumn(name = "user_id", nullable = false)
	private Users users;

	@OneToOne
	@JoinColumn(name = "paymentDetail", nullable = false)
	private PaymentDetail paymentDetail;

	public void setTotal(double total){
		this.total = total;
	}

	public double getTotal(){
		return total;
	}

	public void setCreatedAt(Timestamp createdAt){
		this.createdAt = createdAt;
	}

	public Timestamp getCreatedAt(){
		return createdAt;
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

	public Users getUser() {
		return users;
	}

	public void setUser(Users users) {
		this.users = users;
	}

	public PaymentDetail getPaymentDetail() {
		return paymentDetail;
	}

	public void setPaymentDetail(PaymentDetail paymentDetail) {
		this.paymentDetail = paymentDetail;
	}

	@Override
 	public String toString(){
		return 
			"OrderItems{" + 
			"total = '" + total + '\'' +
			",created_at = '" + createdAt + '\'' + 
			",id = '" + id + '\'' + 
			",modified_at = '" + modifiedAt + '\'' + 
			"}";
		}
}
