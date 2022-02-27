package com.example.week1.shopping;

import com.example.week1.product.Product;
import com.example.week1.product.ProductResponse;

import javax.persistence.*;
import java.sql.Timestamp;

public class CartItemResponse {
	private int id;
	private ProductResponse product;

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	private int quantity;
	private Timestamp createdAt;
	private Timestamp modifiedAt;
	private ShoppingSessionResponse shoppingSession;

	public ProductResponse getCartItem() {
		return product;
	}

	public void setCartItem(ProductResponse product) {
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

	public void setShoppingSession(ShoppingSessionResponse shoppingSession){
		this.shoppingSession = shoppingSession;
	}

	public ShoppingSessionResponse getShoppingSession(){
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
