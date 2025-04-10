package kr.hhplus.be.server.domain.model.product;

import lombok.Data;

@Data
public class ProductDTO {
	
	/*
	 * 다른 도메인간의 연결 : command
	 * */
	
	String productId;
	String productName;
	String createdTime;
	String modifiedTime;
	
}
