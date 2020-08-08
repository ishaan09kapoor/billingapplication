/**
 * <h1>Repository Class</h1>
 * This interface is a repository of methods used in the Controller class
 * @author ishaankapoor
 * @version 1.0
 * @since 5th August 2020
 */
package com.onlineRetail.billing.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.onlineRetail.billing.entity.ProductEntity;

/**
 * @author ishaankapoor
 *
 */
public interface ProductRepository extends JpaRepository<ProductEntity, Integer>{
	/**
	 * Finds if a product ID exists in the database or not
	 * @param id
	 * @return object of product that has the same ID as that specified by the request
	 */
	public Optional<ProductEntity> findById(Integer id);
}
