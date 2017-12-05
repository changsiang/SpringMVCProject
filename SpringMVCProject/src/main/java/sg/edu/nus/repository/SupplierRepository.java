package sg.edu.nus.repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import sg.edu.nus.model.Supplier;

public interface SupplierRepository extends JpaRepository<Supplier, Integer>{

@Query("SELECT s FROM suppliers WHERE s.CompanyName = :supplierName")
	ArrayList<Supplier> findSupplierByName(@Param(":supplierName") String supplierName);

}
