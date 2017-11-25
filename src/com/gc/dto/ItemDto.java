package com.gc.dto;
/*
 * DTO - Model - Data - POJO
 * 
 * 
 */

public class ItemDto {
	private String name; 
	private String description;
	private int qty;
	private double price;
	private int sku;
	
	
	public int getSku() {
		return sku;
	}
	public void setSku(int sku) {
		this.sku = sku;
	}
	public ItemDto(String name, String description, int qty, double price) {
		this.name = name;
		this.description = description;
		this.qty = qty;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
