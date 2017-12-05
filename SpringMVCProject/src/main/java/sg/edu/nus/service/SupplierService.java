package sg.edu.nus.service;

import java.util.ArrayList;

import sg.edu.nus.model.Supplier;

public interface SupplierService {

	ArrayList<Supplier> findAllSupplier();

	Supplier findSupplierById(String supplierId);

	Supplier createSupplier(Supplier supplier);

	Supplier changeSupplier(Supplier supplier);

	void removeSupplier(Supplier supplier);

	ArrayList<Supplier> findSupplierByName(String supplierName);


}
