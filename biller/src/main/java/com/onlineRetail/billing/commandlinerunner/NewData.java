/**
 * <h1>Data Populator</h1>
 * this package aims at populating the table product with dummy data for the
 * products table 
 * @author ishaankapoor
 */
package com.onlineRetail.billing.commandlinerunner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.onlineRetail.billing.entity.ProductEntity;
import com.onlineRetail.billing.repository.ProductRepository;

@Component
public class NewData implements CommandLineRunner{
@Autowired
private ProductRepository productRepository;
	/**
	 * This method populates the table with values by calling ProductEntities constructor
	 * @param args is unused
	 */
	@Override
	public void run(String... args) throws Exception {
		ProductEntity p1=new ProductEntity("Shampoo 1", "FMCG", "Shampoo", 200.00);
		ProductEntity p2=new ProductEntity("Shampoo 2", "FMCG", "Shampoo", 150.00);
		ProductEntity p3=new ProductEntity("Soap 1", "FMCG", "Soap", 60.00);
		ProductEntity p4=new ProductEntity("Soap 2", "FMCG", "Soap", 40.00);
		ProductEntity p5=new ProductEntity("Toothpaste 1", "FMCG", "Toothpaste", 140.00);
		ProductEntity p6=new ProductEntity("Toothpaste 2", "FMCG", "Toothpaste", 100.00);
		ProductEntity p7=new ProductEntity("Conditioner 1", "FMCG", "Conditioner", 300.00);
		ProductEntity p8=new ProductEntity("Conditioner 2", "FMCG", "Conditioner", 250.00);
		ProductEntity p9=new ProductEntity("Vegetable 1", "Vegetables & Fruits", "Vegetable", 30.00);
		ProductEntity p10=new ProductEntity("Vegetable 2", "Vegetables & Fruits", "Vegetable", 40.00);
		ProductEntity p11=new ProductEntity("Vegetable 3", "Vegetables & Fruits", "Vegetable", 20.00);
		ProductEntity p12=new ProductEntity("Fruit 1", "Vegetables & Fruits", "Fruit", 50.00);
		ProductEntity p13=new ProductEntity("Fruit 2", "Vegetables & Fruits", "Fruit", 80.00);
		ProductEntity p14=new ProductEntity("Fruit 3", "Vegetables & Fruits", "Fruit", 60.00);
		productRepository.save(p1);
		productRepository.save(p2);
		productRepository.save(p3);
		productRepository.save(p4);
		productRepository.save(p5);
		productRepository.save(p6);
		productRepository.save(p7);
		productRepository.save(p8);
		productRepository.save(p9);
		productRepository.save(p10);
		productRepository.save(p11);
		productRepository.save(p12);
		productRepository.save(p13);
		productRepository.save(p14);
	}
	
}