package com.example.week1.shopping;

import com.example.week1.product.Product;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;

@Entity
public class CartItem{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	private int quantity;
	private Timestamp createdAt;
	private Timestamp modifiedAt;

	@ManyToOne
	@JoinColumn(name = "session_id", nullable = false)
	private ShoppingSession shoppingSession;

	@OneToOne(mappedBy = "product", fetch = FetchType.EAGER)
	private Product product;

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

	public void setShoppingSession(ShoppingSession shoppingSession){
		this.shoppingSession = shoppingSession;
	}

	public ShoppingSession getShoppingSession(){
		return shoppingSession;
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
			"CartItem{" +
			",created_at = '" + createdAt + '\'' + 
			",id = '" + id + '\'' + 
			",modified_at = '" + modifiedAt + '\'' + 
			"}";
		}
}
