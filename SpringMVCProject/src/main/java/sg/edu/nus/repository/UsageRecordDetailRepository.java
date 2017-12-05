package sg.edu.nus.repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import sg.edu.nus.model.UsageRecordDetail;

public interface UsageRecordDetailRepository extends JpaRepository<UsageRecordDetail, Integer> {

	@Query("SELECT urd From usagerecorddetails WHERE urd.TransID = :transId")
	ArrayList<UsageRecordDetail> findUsageRecordDetailbyTransId(@Param("transId") int transId);

}
