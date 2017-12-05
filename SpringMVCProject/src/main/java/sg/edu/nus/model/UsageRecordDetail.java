package sg.edu.nus.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "usagerecorddetails")
public class UsageRecordDetail {
	
	@Id
	@Column (name = "TransDetailID")
	private int transDetailId;
	@Column (name = "TransID")
	private int transId;
	@Column (name = "Products_PartID")
	private int productPartId;
	@Column (name = "UsedQty")
	private int usedQty;
	
	//Pending TableRelation Statements
	
	//Constructors
	public UsageRecordDetail(int transDetailId, int transId, int productPartId, int usedQty) {
		super();
		this.transDetailId = transDetailId;
		this.transId = transId;
		this.productPartId = productPartId;
		this.usedQty = usedQty;
	}
	public UsageRecordDetail() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//Getter and Setters
	public int getTransDetailId() {
		return transDetailId;
	}
	public void setTransDetailId(int transDetailId) {
		this.transDetailId = transDetailId;
	}
	public int getTransId() {
		return transId;
	}
	public void setTransId(int transId) {
		this.transId = transId;
	}
	public int getProductPartId() {
		return productPartId;
	}
	public void setProductPartId(int productPartId) {
		this.productPartId = productPartId;
	}
	public int getUsedQty() {
		return usedQty;
	}
	public void setUsedQty(int usedQty) {
		this.usedQty = usedQty;
	}
	
	//hashCode() and equals()
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + transDetailId;
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
		UsageRecordDetail other = (UsageRecordDetail) obj;
		if (transDetailId != other.transDetailId)
			return false;
		return true;
	}
	
	

}
