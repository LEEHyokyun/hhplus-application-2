package kr.hhplus.be.server.domain.model.history.producthistory;

import lombok.Data;

@Data
public class ProductHistoryDTO {
	
	/*
	 * 다른 도메인간의 연결 : command
	 * */
	
	String productId;
	String userId;
	String historySequence;
	String transactionType;
	long orderQuantity;
	String createdTime;
	String modifiedTime;
}
