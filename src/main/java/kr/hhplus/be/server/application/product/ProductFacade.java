package kr.hhplus.be.server.application.product;

import org.springframework.beans.factory.annotation.Autowired;

import jakarta.transaction.Transactional;
import kr.hhplus.be.server.domain.model.product.ProductDTO;
import kr.hhplus.be.server.domain.service.history.pointhistory.PointHistoryService;
import kr.hhplus.be.server.domain.service.history.producthistory.ProductHistoryService;
import kr.hhplus.be.server.domain.service.point.PointService;
import kr.hhplus.be.server.domain.service.product.ProductService;

@Transactional
public class ProductFacade {
	
	@Autowired
	ProductService productService;
	
	@Autowired
	PointService pointService;
	
	@Autowired 
	ProductHistoryService productHistoryService;
	
	@Autowired
	PointHistoryService pointHistoryService;
	
	/*
	 * 주문 및 결제
	 * - 중심 도메인인 product 도메인에서
	 * - 중심 도메인 모델인 productDTO 를 활용
	 * */
	public int orderAndPay(ProductDTO productDTO) {
		productService.order(productDTO);
		
		//DTO mapper? 
		pointService.use(productDTO);
		
		//DTO mapper?
		productHistoryService.insert(productDTO);
		
		//DTO mapper?
		pointHistoryService.insert(productDTO);
		
		//return what?
		return 1;
	}
}
