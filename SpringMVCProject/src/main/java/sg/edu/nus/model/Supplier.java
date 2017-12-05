package sg.edu.nus.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "suppliers")
public class Supplier {

	@Id
	@Column(name = "SupplierID")
	private String supplierID;
	@Column(name = "CompanyName")
	private String companyName;
	@Column (name = "ContactNumber")
	private String contactNumber;
	@Column (name = "Address")
	private String address;

	//Pending table relation statement  
	
	// Constructors
	public Supplier(String supplierID, String companyName, String contactNumber, String address) {
		super();
		this.supplierID = supplierID;
		this.companyName = companyName;
		this.contactNumber = contactNumber;
		this.address = address;
	}

	public Supplier() {
		super();
		// TODO Auto-generated constructor stub
	}

	// Getters and Setters

	public String getSupplierID() {
		return supplierID;
	}

	public void setSupplierID(String supplierID) {
		this.supplierID = supplierID;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	// hashCode() and equals()

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((supplierID == null) ? 0 : supplierID.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Supplier other = (Supplier) obj;
		if (supplierID == null) {
			if (other.supplierID != null)
				return false;
		} else if (!supplierID.equals(other.supplierID))
			return false;
		return true;
	}

}
