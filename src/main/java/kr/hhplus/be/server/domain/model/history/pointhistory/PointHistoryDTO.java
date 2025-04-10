package kr.hhplus.be.server.domain.model.history.pointhistory;

import lombok.Data;

@Data
public class PointHistoryDTO {
	
	/*
	 * 다른 도메인간의 연결 : command
	 * */
	
	String userId;
	String historySequence;
	long point;
	String transactionType;
	String createdTime;
	String modifiedTime;
	
}
