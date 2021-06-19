package com.cts.AuditSeverity.service;

import com.cts.AuditSeverity.model.AuditRequestModel;
import com.cts.AuditSeverity.model.AuditResponseModel;
import com.cts.AuditSeverity.pojo.AuditRequest;
import com.cts.AuditSeverity.pojo.AuditResponse;

public interface IAuditRequestResponse {
	public AuditRequestModel saveRequest(AuditRequest request);
	public AuditResponseModel saveResponse(AuditResponse response);
}
