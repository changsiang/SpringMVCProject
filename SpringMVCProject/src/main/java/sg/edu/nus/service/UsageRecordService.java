package sg.edu.nus.service;

import java.util.ArrayList;
import java.util.Date;

import sg.edu.nus.model.UsageRecord;

public interface UsageRecordService {

	ArrayList<UsageRecord> findAllUsageRecord();

	UsageRecord findUsageRecord(int transId);

	UsageRecord createUsageRecord(UsageRecord usageRecord);

	UsageRecord changeUsageRecord(UsageRecord usageRecord);

	void removeUsageRecord(UsageRecord usageRecord);

	ArrayList<UsageRecord> findUsageRecordById(int transId);

	ArrayList<UsageRecord> findUsageRecordByDate(Date transDate);

	ArrayList<UsageRecord> findUsageRecordByPartId(int productId);
	
}
