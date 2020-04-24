package com.zensar.services;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.zensar.entity.Product;

public interface ProductService {

	public Iterable<Product> getAllProducts();
	
	public Product getProduct(int productId);
	
	public Product insertProduct(Product product);
	
	public void deleteProduct(int productId);
	
	public Product updateProduct(int productId, Product product);
}
