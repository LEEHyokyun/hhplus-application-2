package kr.hhplus.be.server.domain.model.history.producthistory;

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
}
