package sg.edu.nus.service;

import java.util.ArrayList;
import javax.annotation.Resource;

import org.springframework.transaction.annotation.Transactional;


import sg.edu.nus.model.Product;
import sg.edu.nus.repository.ProductRepository;

public class ProductServiceImpl implements ProductService {
	
	@Resource
	ProductRepository productRepository;

	@Override
	@Transactional
	public ArrayList<Product> findAllProducts() {
		ArrayList<Product> products = (ArrayList<Product>)productRepository.findAll();
		return products;
	}

	@Override
	@Transactional
	public Product findProduct(int productId) {
		return productRepository.getOne(productId);
	}

	@Override
	@Transactional
	public Product createProduct(Product product) {
		return productRepository.saveAndFlush(product);
	}

	@Override
	@Transactional
	public Product changeProduct(Product product) {
		return productRepository.saveAndFlush(product);
	}

	@Override
	@Transactional
	public void removeProduct(Product product) {
		productRepository.delete(product);
	}

	@Override
	public ArrayList<Product> findProductByID(int productId) {
		return productRepository.findProductByID(productId);
	}

	@Override
	public ArrayList<Product> findProductByDesc(String description) {
		return productRepository.findProductByDesc(description);
	}

	@Override
	public ArrayList<Product> findProductByColor(String color) {
		return productRepository.findProductByColor(color);
	}

	@Override
	@Transactional
	public ArrayList<Product> findProductByManufacturer(String manufacturer) {
		return productRepository.findProductByManufacturer(manufacturer);
	}
	

}
