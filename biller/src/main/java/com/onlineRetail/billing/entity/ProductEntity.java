/**
 * <h1>Entity Class</h1>
 * This class creates the User class that has all the details of the User for
 * the .jar file to talk to.
 * @author ishaankapoor
 * @version 1.0
 * @since 8th August 2020
 */
package com.onlineRetail.billing.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
@SequenceGenerator(name="seq", initialValue=1001, allocationSize=1000)
@Entity
@Table(name="Products")
public class ProductEntity {
@Id @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq") private Integer id;
@Column (name="product_name") private String productName;
@Column (name="product_description") private String productDescription;
@Column (name="product_category") private String productCategory;
@Column (name="price") private Double price;
/**
 * @param productName
 * @param productDescription
 * @param productCategory
 * @param price
 */
public ProductEntity() {
}
/**
 * The constructor of the class sets the values of the product_name, product_description,
 * product_category, price
 * @param productName
 * @param productDescription
 * @param productCategory
 * @param price
 * @return void
 */
public ProductEntity(String productName, String productDescription, String productCategory, Double price) {
	this.productName = productName;
	this.productDescription = productDescription;
	this.productCategory = productCategory;
	this.price = price;
}
/**
 * Method to get price of the object
 * @return Price of the object
 */
public Double getPrice() {
	// TODO Auto-generated method stub
	return this.price;
}
/**
 * 
 * @return name of the product
 */
public String getName() {
	// TODO Auto-generated method stub
	return this.productName;
}
/**
 * 
 * @return Category of the product
 */
public String getCategory() {
	// TODO Auto-generated method stub
	return this.productCategory;
}
/**
 * 
 * @return Description of the product
 */
public String getDescription() {
	// TODO Auto-generated method stub
	return this.productDescription;
}

}
