/**
 * <h1>SpringBootApplication Class</h1>
 * This class is used to bootstrap and launch a Spring application from a 
 * Java main method. The application creates an appropriate ApplicationContext
 * instance and registers a CommandLinePropertySource that exposes cmd line 
 * arguments as Spring properties and loads all the singleton beans and triggers
 * cmd line beans. 
 * @author ishaankapoor
 * @version 1.0
 * @since 8th August 2020
 */
package com.onlineRetail.billing.biller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.onlineRetail.billing.controller.BillController;

@SpringBootApplication
@EntityScan(basePackages = "com.onlineRetail.billing.entity")
@ComponentScan(basePackageClasses = BillController.class)
@ComponentScan(basePackageClasses = com.onlineRetail.billing.commandlinerunner.NewData.class)
@EnableJpaRepositories("com.onlineRetail.billing.repository")
public class BillApplication {
	/**
	 * The main method for the MSP.Airtel program.
	 * 
	 * @param args Not used
	 */
	public static void main(String[] args) {
		SpringApplication.run(BillApplication.class, args);
	}

}
