package com.example.week1.product;

import com.example.week1.discount.Discount;
import com.example.week1.order.OrderItems;
import com.example.week1.shopping.CartItem;
import com.example.week1.user.User;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.criterion.Order;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
public class Product{
	@Id
	private int id;
	private double price;
	private String name;
	private String desc;
	private String sKU;
	private Timestamp createdAt;
	private Timestamp modifiedAt;
	private Timestamp deletedAt;

	@ManyToOne
	@JoinColumn(name = "category_id", nullable = false)
	private ProductCategory productCategory;

	@ManyToOne
	@JoinColumn(name = "inventory_id", nullable = false)
	private ProductInventory productInventory;

	@OneToOne
	@JoinColumn(name = "order_items_id", nullable = true)
	private OrderItems product;

	@OneToOne
	@JoinColumn(name = "discount_id", nullable = true)
	private Discount discount;

	@OneToOne(mappedBy = "product")
	@JsonIgnore
	private CartItem cartItem;

	public OrderItems getProduct() {
		return product;
	}

	public void setProduct(OrderItems product) {
		this.product = product;
	}

	public CartItem getCartItem() {
		return cartItem;
	}

	public void setCartItem(CartItem cartItem) {
		this.cartItem = cartItem;
	}

	public void setProductCategory(ProductCategory categoryId){
		this.productCategory = productCategory;
	}

	public ProductCategory getProductCategory(){
		return productCategory;
	}

	public void setProductInventory(ProductInventory productInventory){
		this.productInventory = productInventory;
	}

	public ProductInventory getProductInventory(){
		return productInventory;
	}

	public void setPrice(double price){
		this.price = price;
	}

	public double getPrice(){
		return price;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
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

	public void setSKU(String sKU){
		this.sKU = sKU;
	}

	public String getSKU(){
		return sKU;
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

	public void setDiscount(Discount discount){
		this.discount = discount;
	}

	public Discount getDiscountId(){
		return discount;
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
			"Product{" +
			",price = '" + price + '\'' + 
			",name = '" + name + '\'' + 
			",created_at = '" + createdAt + '\'' + 
			",id = '" + id + '\'' + 
			",sKU = '" + sKU + '\'' + 
			",modified_at = '" + modifiedAt + '\'' + 
			",deleted_at = '" + deletedAt + '\'' +
			",desc = '" + desc + '\'' + 
			"}";
		}
}
