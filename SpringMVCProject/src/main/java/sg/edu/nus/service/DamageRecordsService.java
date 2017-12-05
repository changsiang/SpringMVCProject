package sg.edu.nus.service;

import java.util.ArrayList;

import sg.edu.nus.model.DamageRecords;

public interface DamageRecordsService {

	ArrayList<DamageRecords> findAllDamageRecord();

	DamageRecords findDamageRecordsById(int transId);

	DamageRecords createDamageRecords(DamageRecords damageRecords);

	DamageRecords changeDamageRecords(DamageRecords damageRecords);

	void removeDamgeRecord(DamageRecords damageRecords);

	ArrayList<DamageRecords> findDamageRecordById(int transId);

}
