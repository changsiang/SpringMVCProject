package sg.edu.nus.repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import sg.edu.nus.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{
	
	@Query("SELECT p from products p WHERE p.PartId = :productId")
	ArrayList<Product> findProductByID(@Param("productId") int productId);
	
	@Query("SELECT p from products p WHERE p.Description = :productDesc")
	ArrayList<Product> findProductByDesc(@Param ("productDesc") String description);
	
	@Query("SELECT p from products p WHERE p.Color = :color")
	ArrayList<Product> findProductByColor(@Param("color") String color);
	
	@Query("SELECT p from products p WHERE p.Manufacturer = :manufacturer")
	ArrayList<Product> findProductByManufacturer(@Param("manufacturer") String manufacturer);

}
