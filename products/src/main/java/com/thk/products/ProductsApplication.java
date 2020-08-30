package com.thk.products;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.thk.products.services.ProductLineService;

@SpringBootApplication
public class ProductsApplication implements CommandLineRunner{

	@Autowired
	ProductLineService productLineService;
	
	public static void main(String[] args) {
		SpringApplication.run(ProductsApplication.class, args);
		System.out.println("Hello Viswam");
		
	}
	
	public void run(String... args) throws Exception{
		productLineService.getProductLines();
	}

}
