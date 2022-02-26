package com.example.week1.order;

import com.example.week1.product.Product;
import com.example.week1.shopping.OrderDetails;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;

@Entity
public class OrderItems{
	@Id
	private int id;
	private int quantity;
	private Timestamp createdAt;
	private Timestamp modifiedAt;

	@OneToOne(mappedBy = "product", fetch = FetchType.EAGER)
	private Product product;

	@ManyToOne
	@JoinColumn(name = "user_id", nullable = false)
	private OrderDetails orderDetails;

	public void setQuantity(int quantity){
		this.quantity = quantity;
	}

	public int getQuantity(){
		return quantity;
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

	public void setProduct(Product product){
		this.product = this.product;
	}

	public Product getProduct(){
		return product;
	}

	@Override
 	public String toString(){
		return 
			"OrderItems{" + 
			"quantity = '" + quantity + '\'' +
			",created_at = '" + createdAt + '\'' + 
			",id = '" + id + '\'' + 
			",modified_at = '" + modifiedAt + '\'' +
			"}";
		}
}
