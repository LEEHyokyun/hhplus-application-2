package kr.hhplus.be.server.domain.model.productsales;

import java.sql.Timestamp;

import lombok.Data;

@Data
public class ProductSalesDTO {
	
	/*
	 * 다른 도메인간의 연결 : command
	 * */
	
	String productId;
	int productStock;
	String isInSale;
	Timestamp createdTime;
	Timestamp modifiedTime;
	
}
