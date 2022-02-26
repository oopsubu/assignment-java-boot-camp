package com.example.week1.shopping;

import com.example.week1.product.ProductCategory;
import com.example.week1.user.User;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
public class ShoppingSession {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int total;
	private Timestamp createdAt;
	private Timestamp modifiedAt;

	@ManyToOne
	@JoinColumn(name = "user_id", nullable = false)
	private User user;


	public void setTotal(int total){
		this.total = total;
	}

	public int getTotal(){
		return total;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
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

	@Override
 	public String toString(){
		return 
			"ShoppingSessionResponse{" + 
			"total = '" + total + '\'' +
			",created_at = '" + createdAt + '\'' + 
			",id = '" + id + '\'' + 
			",modified_at = '" + modifiedAt + '\'' + 
			"}";
		}
}
