package com.example.week1.payment;

import com.example.week1.product.Product;
import com.example.week1.shopping.OrderDetails;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.sql.Timestamp;

@Entity
public class PaymentDetail{
	@Id
	private int id;
	private double amount;
	private String provider;
	private String status;
	private Timestamp createdAt;
	private Timestamp modifiedAt;

	@OneToOne(mappedBy = "paymentDetail", fetch = FetchType.EAGER)
	private OrderDetails orderDetails;

	public void setAmount(double amount){
		this.amount = amount;
	}

	public double getAmount(){
		return amount;
	}

	public void setProvider(String provider){
		this.provider = provider;
	}

	public String getProvider(){
		return provider;
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

	public void setOrderDetails(OrderDetails orderDetails){
		this.orderDetails = orderDetails;
	}

	public OrderDetails getOrderDetails(){
		return orderDetails;
	}

	public void setStatus(String status){
		this.status = status;
	}

	public String getStatus(){
		return status;
	}

	@Override
 	public String toString(){
		return 
			"PaymentDetail{" + 
			"amount = '" + amount + '\'' + 
			",provider = '" + provider + '\'' + 
			",created_at = '" + createdAt + '\'' + 
			",id = '" + id + '\'' + 
			",modified_at = '" + modifiedAt + '\'' +
			",status = '" + status + '\'' + 
			"}";
		}
}
