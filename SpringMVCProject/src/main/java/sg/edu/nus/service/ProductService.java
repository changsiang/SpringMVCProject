package sg.edu.nus.service;

import java.util.ArrayList;

import sg.edu.nus.model.Product;

public interface ProductService {
	
	//To write all CRUD functions
	
	ArrayList<Product> findAllProducts();
	
	Product findProduct(int productId);
	
	Product createProduct(Product product);
	
	Product changeProduct(Product product);
	
	void removeProduct(Product product);
	
	ArrayList<Product> findProductByID(int productId);
	
	ArrayList<Product> findProductByDesc(String description);
		
	ArrayList<Product> findProductByColor(String color);
	
	ArrayList<Product> findProductByManufacturer(String manufacturer);

}
