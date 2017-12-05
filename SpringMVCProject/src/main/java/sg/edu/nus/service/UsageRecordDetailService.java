package sg.edu.nus.service;

import java.util.ArrayList;

import sg.edu.nus.model.UsageRecordDetail;

public interface UsageRecordDetailService {

	ArrayList<UsageRecordDetail> findAllUsageRecordDetails();

	ArrayList<UsageRecordDetail> findUsageRecordDetailbyTransId(int transId);

	UsageRecordDetail createUsageRecordDetail(UsageRecordDetail usageRecordDetail);

	UsageRecordDetail changeUsageRecordDetail(UsageRecordDetail usageRecordDetail);

	void removeUsageRecordDetail(UsageRecordDetail usageRecordDetail);

}
