package com.example.week1.product;

import com.example.week1.discount.DiscountResponse;
import com.example.week1.order.OrderItemsResponse;
import com.example.week1.shopping.CartItemResponse;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.sql.Timestamp;

public class ProductResponse {
	private int id;
	private double price;
	private String name;
	private String desc;
	private String sKU;
	private Timestamp createdAt;
	private Timestamp modifiedAt;
	private Timestamp deletedAt;
	private ProductCategoryResponse productCategory;
	private ProductInventoryResponse productInventory;
	private OrderItemsResponse product;
	private DiscountResponse discount;
	@JsonIgnore
	private CartItemResponse cartItem;


	public CartItemResponse getCartItem() {
		return cartItem;
	}

	public void setCartItem(CartItemResponse cartItem) {
		this.cartItem = cartItem;
	}

	public OrderItemsResponse getProduct() {
		return product;
	}

	public void setProduct(OrderItemsResponse product) {
		this.product = product;
	}

	public void setProductCategory(ProductCategory categoryId){
		this.productCategory = productCategory;
	}

	public ProductCategoryResponse getProductCategory(){
		return productCategory;
	}

	public void setProductInventory(ProductInventoryResponse productInventory){
		this.productInventory = productInventory;
	}

	public ProductInventoryResponse getProductInventory(){
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

	public void setDiscount(DiscountResponse discount){
		this.discount = discount;
	}

	public DiscountResponse getDiscountId(){
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
