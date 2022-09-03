package com.sky.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Repository;

import com.sky.domain.Product;
@Repository
public class ProductRepositoryImpl implements ProductRepository {
	
	private static List<Product> products=new ArrayList<Product>();
	static {
		products.add(new Product("1","zk",0));
		products.add(new Product("2","dp",0));
	}

	@Override
	public void addProduct(Product product) {
		System.out.println("in repsoitory");
		products.add(product);	
		
	}

	@Override
	public List<Product> getProduct() {
	//	products.add(new Product("1", "dp", 10));
	//	products.add(null))
		// TODO Auto-generated method stub
		return products;
	}

	@Override
	public void deletedProduct(Product product) {
		// TODO Auto-generated method stub
		products.remove(product);
		
	}

	@Override
	public Product getProductById(String productId) {
		Product result = new Product();
		for(Product product:products) {
			if(product.getProductId().equals(productId))
				result = product;
				
			
		}
		return result;
	}

	@Override
	public Product updateProduct(Product tempproduct) {
		// TODO Auto-generated method stub
		int index=0;
		for(Product product2 : products) {
			if(product2.getProductId().equals(tempproduct.getProductId())) {
					products.set(index,tempproduct);
			}
			++index;
					
		}
		return tempproduct;
		
	}
	
	

}
