package kr.hhplus.be.server.infrastructure.domainjparepository.productsales;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import annotation.UnitTest;
import kr.hhplus.be.server.domain.model.productsales.ProductSalesDTO;
import kr.hhplus.be.server.domain.service.productsales.ProductSalesService;
import kr.hhplus.server.domain.service.point.PointService;

@UnitTest
public class ProductSalesUnitTest {
	
	@Autowired
	ProductSalesService productSalesService;
	
	@Test
	@DisplayName("[단위테스트] 최근 3일간의 인기 상품을 조회한다.")
	void searchHotSaledProductTest() {
		/*
		 * given
		 * - 테스트에 사용할 변수 및 입력값을 정의한다.
		 * - 동작을 확인하기 위한 Mokito 정의도 포함(Database(Repository)의 객체를 Mokito화하여 사용)
		 * */
		long expectedSize = 5L;
		long expectedId = 1L;
		
		/*
		 * when
		 * - 실제 동작이 이루어진다.
		 * - 동작에 따른 상태 변화를 기억하거나, 대조군으로 활용하기 위한 과정이다.
		 * - 검증 대상의 동작 하나만 기술한다.
		 * */
		List<ProductSalesDTO> actualList = productSalesService.search();
		
		/*
		 * Then
		 * - 최종적으로 테스트를 검증한다.
		 * - 테스트 과정을 종합한다.
		 * */
		assertEquals(expectedSize, actualList.size());
		assertEquals(expectedName, actualList.get(0).getProductId());
	}
}
