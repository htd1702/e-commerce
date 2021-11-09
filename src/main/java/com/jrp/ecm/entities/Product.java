package com.jrp.ecm.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long productId;
	private String name;
	private double price;
	private String color;
	private String size;
	private String des;
	private String image1;
	private String image2;
	private String image3;

	public Product() {

	}

	public Product(String name, double price, String color, String size, String des, String image1, String image2,
			String image3) {
		super();
		this.name = name;
		this.price = price;
		this.color = color;
		this.size = size;
		this.des = des;
		this.image1 = image1;
		this.image2 = image2;
		this.image3 = image3;
	}

	public long getProductId() {
		return productId;
	}

	public void setProductId(long productId) {
		this.productId = productId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getDes() {
		return des;
	}

	public void setDes(String des) {
		this.des = des;
	}

	public String getImage1() {
		return image1;
	}

	public void setImage1(String image1) {
		this.image1 = image1;
	}

	public String getImage2() {
		return image2;
	}

	public void setImage2(String image2) {
		this.image2 = image2;
	}

	public String getImage3() {
		return image3;
	}

	public void setImage3(String image3) {
		this.image3 = image3;
	}

//	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
//	private long productId;
//	private String name;
//	private String size;
//	private String des;
//	public Product() {
//		
//	}
//	public Product(String name, String size, String des) {
//		super();
//		this.name = name;
//		this.size = size;
//		this.des = des;
//	}
//	public long getProductId() {
//		return productId;
//	}
//	public void setProductId(long productId) {
//		this.productId = productId;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public String getSize() {
//		return size;
//	}
//	public void setSize(String size) {
//		this.size = size;
//	}
//	public String getDes() {
//		return des;
//	}
//	public void setDes(String des) {
//		this.des = des;
//	}
}
