package com.example.week1.discount;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;

public class DiscountResponse {

	private int id;
	private String name;
	private String desc;
	private boolean active;
	private int discountPercent;
	private Timestamp createdAt;
	private Timestamp modifiedAt;
	private Timestamp deletedAt;

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setActive(boolean active){
		this.active = active;
	}

	public boolean isActive(){
		return active;
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

	public void setDiscountPercent(int discountPercent){
		this.discountPercent = discountPercent;
	}

	public int getDiscountPercent(){
		return discountPercent;
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

	public void setDesc(String desc){
		this.desc = desc;
	}

	public String getDesc(){
		return desc;
	}

	@Override
 	public String toString(){
		return 
			"Discount{" + 
			"name = '" + name + '\'' + 
			",active = '" + active + '\'' + 
			",created_at = '" + createdAt + '\'' + 
			",id = '" + id + '\'' + 
			",discount_percent = '" + discountPercent + '\'' + 
			",modified_at = '" + modifiedAt + '\'' + 
			",deleted_at = '" + deletedAt + '\'' + 
			",desc = '" + desc + '\'' + 
			"}";
		}
}
