package com.zensar.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.zensar.entity.Product;
import com.zensar.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductRepository repo;
	
	public ProductServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	public Iterable<Product> getAllProducts() {
		return repo.findAll();
	}
	
	public Product getProduct(int productId) {
		return repo.findById(productId).get();
	}
	
	public Product insertProduct(Product product) {
		return repo.save(product);
	}
	
	public void deleteProduct(int productId) {
		repo.deleteById(productId);
	}
	
	public Product updateProduct(int productId, Product product) {
		return repo.save(product);
	}
}
