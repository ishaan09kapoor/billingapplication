/**
 * <h1>Controller Class</h1>
 * This class creates the controller class that is connected to HTML pages
 * and accesses the database in order to generate bills. 
 * @author ishaankapoor
 * @version 1.0
 * @since 5th August 2020
 */
package com.onlineRetail.billing.controller;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

import com.onlineRetail.billing.Exception.InvalidTokenException;
import com.onlineRetail.billing.Exception.IdNotFoundException;
import com.onlineRetail.billing.entity.ProductEntity;
import com.onlineRetail.billing.repository.ProductRepository;

@Controller
public class BillController {
	@Autowired
	private ProductRepository productRepository;
	/**
	 * This function processes the request to access the home screen request by
	 * user
	 * @param model
	 * @return reference to the home page file
	 * @throws UserIncorrectNumberExcpetion & InvalidTokenException
	 */
@GetMapping("/home") public String home(){
	return "home";
}
/**
 * This function processes the request to generate a bill as requested 
 * by the user
 * @param id: The Id of the product
 * @param quantity: The quantity of the product purchased
 * @param model a Model to feed data to the HTML file
 * @return reference to the bill html file
 * @throws UserIncorrectNumberExcpetion 
 * @throws InvalidTokenException
 */
@GetMapping("/bill") public String billGenerator (@RequestParam(name="id") Integer id, @RequestParam(name="quantity") Integer quantity, Model model){
	try {
		if(	id>=1000&&id<=9999&&quantity>=0) {
			Optional<ProductEntity> product=productRepository.findById(id);
			if (!product.isPresent()) {
				throw new IdNotFoundException(id);
			}
			model.addAttribute("quantity", quantity);
			model.addAttribute("name",product.get().getName());
			model.addAttribute("category",product.get().getCategory());
			model.addAttribute("description",product.get().getDescription());
			model.addAttribute("price",product.get().getPrice());
			model.addAttribute("totalPrice", product.get().getPrice()*quantity);
			return "finalBill";
			}
		else {
			throw new InvalidTokenException();
		}
	}
	catch(MethodArgumentTypeMismatchException e) {
		return "invaildToken";				
	}
	catch (InvalidTokenException e) {
		return "invaildToken";
	}
	catch (IdNotFoundException e){
		return "idNotFound";
	}
}
}
