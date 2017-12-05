package sg.edu.nus.repository;

import java.util.ArrayList;

import javax.persistence.criteria.From;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import sg.edu.nus.model.DamageRecords;

public interface DamageRecordsRepository extends JpaRepository<DamageRecords, Integer> {	

	@Query("SELECT dr FROM damagerecords WHERE dr.RMAID = :transId")
	ArrayList<DamageRecords> findDamageRecordById(@Param("transId") int transId);

}
