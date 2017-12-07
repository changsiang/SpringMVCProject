package sg.edu.nus.repository;

import java.util.ArrayList;
import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import sg.edu.nus.model.UsageRecord;

public interface UsageRecordRepository extends JpaRepository<UsageRecord, Integer>{


	@Query("SELECT ur FROM usagerecords ur WHERE ur.TransID = :transId")
	ArrayList<UsageRecord> findUsageRecordById(@Param("transId")int transId);

	@Query("SELECT ur FROM usagerecords ur WHERE ur.DateUsed = :transDate")
	ArrayList<UsageRecord> findUsageRecordByDate(@Param("transDate") Date TransDate);

	@Query("SELECT ur from usagerecords ur WHERE EXISTS (SELECT urd from usagerecorddetails urd WHERE urd.Products_PartID = :productId ")
	ArrayList<UsageRecord> findUsageRecordByPartId(int productId);
	
}
