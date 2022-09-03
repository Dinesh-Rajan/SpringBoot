package com.sky.service;

import java.util.List;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sky.domain.Product;
import com.sky.repository.ProductRepository;
@Service
public class ProducrServiceImpl implements ProductService {
	@Autowired
	private ProductRepository productRepository;

	@Override
	public void addProduct(Product product) {
		System.out.println("In Service");	
		if(product.getPrice()>20) 
		productRepository.addProduct(product);
	}

	@Override
	public List<Product> getProduct() {
		
		return productRepository.getProduct();
	}

	@Override
	public void deletedProduct(Product product) {
		// TODO Auto-generated method stub
		productRepository.deletedProduct(product);
		
	}

	@Override
	public Product getProductById(String productId) {
		return productRepository.getProductById(productId);
	}

	@Override
	public Product updateProduct(Product tempproduct) {
		// TODO Auto-generated method stub
		return productRepository.updateProduct(tempproduct);
	}
	


}
