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

	@OneToOne(orphanRemoval = true)
	@JoinTable(name = "cart_item_product",
			joinColumns = @JoinColumn(name = "cart_item_null"),
			inverseJoinColumns = @JoinColumn(name = "product_id"))
	private Product product;

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

	public Product getCartItem() {
		return product;
	}

	public void setCartItem(Product product) {
		this.product = product;
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

	public void setShoppingSession(ShoppingSession shoppingSession){
		this.shoppingSession = shoppingSession;
	}

	public ShoppingSession getShoppingSession(){
		return shoppingSession;
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
