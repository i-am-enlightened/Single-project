package com.zensar.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.entity.Product;
import com.zensar.services.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {

	@Autowired
	ProductService service;
	
	//Show all products
	@RequestMapping(method = RequestMethod.GET)
	public Iterable<Product> getAllProducts() {
		return service.getAllProducts();
	}
	
	//Show product by productId
	@RequestMapping(value="/{productId}", method = RequestMethod.GET)
	public Product getProduct(@PathVariable("productId") int productId) {
		 return service.getProduct(productId);
	}
	
	@RequestMapping(value="/", method = RequestMethod.POST)
	public void insertProduct(@RequestBody Product product) {
		service.insertProduct(product);
	}
	
	@RequestMapping(value="/{productId}", method = RequestMethod.DELETE)
	public void deleteProduct(@PathVariable("productId") int productId) {
		service.deleteProduct(productId);
	}
	
	@RequestMapping(value="/", method = RequestMethod.PUT)
	public void updateProduct(@PathVariable("productId") int productId, Product product) {
		service.updateProduct(productId, product);
	}
	
	public ProductController() {
		// TODO Auto-generated constructor stub
	}

}
