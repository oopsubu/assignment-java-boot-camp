package com.example.week1.product;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;

@Entity
public class ProductInventory{
	@Id
	private int id;
	private int quantity;
	private Timestamp createdAt;
	private Timestamp modifiedAt;
	private Timestamp deletedAt;

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

	public void setDeletedAt(Timestamp deletedAt){
		this.deletedAt = deletedAt;
	}

	public Timestamp getDeletedAt(){
		return deletedAt;
	}

	@Override
 	public String toString(){
		return 
			"ProductInventory{" + 
			"quantity = '" + quantity + '\'' + 
			",created_at = '" + createdAt + '\'' + 
			",id = '" + id + '\'' + 
			",modified_at = '" + modifiedAt + '\'' + 
			",deleted_at = '" + deletedAt + '\'' + 
			"}";
		}
}
