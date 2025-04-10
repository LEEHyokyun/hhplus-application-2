package kr.hhplus.server.domain.service.product;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import annotation.UnitTest;

@UnitTest
public class ProductUnitTest {
	
	@Autowired
	ProductService productService;
	
	@Test
	@DisplayName("[단위테스트] 상품 세부정보를 조회한다.")
	void searchTest() {
		/*
		 * given
		 * - 테스트에 사용할 변수 및 입력값을 정의한다.
		 * - 동작을 확인하기 위한 Mokito 정의도 포함(Database(Repository)의 객체를 Mokito화하여 사용)
		 * */
		long productId = 1L;
		String expectedProductName = "cloth";
		long expectedProductQuantity = 5L;
		
		/*
		 * when
		 * - 실제 동작이 이루어진다.
		 * - 동작에 따른 상태 변화를 기억하거나, 대조군으로 활용하기 위한 과정이다.
		 * - 검증 대상의 동작 하나만 기술한다.
		 * */
		String actualProductName = productService.search(productId).getProductName();
		long actualProductQuantity = productService.search(productId).getProductQuantity();
		
		/*
		 * Then
		 * - 최종적으로 테스트를 검증한다.
		 * - 테스트 과정을 종합한다.
		 * */
		assertEquals(expectedProductName, actualProductName);
		assertEquals(expectedProductQuantity, actualProductQuantity);
	}
	
	@Test
	@DisplayName("[단위테스트] 상품 주문 수만큼 주문한다.")
	void orderTest() {
		/*
		 * given
		 * - 테스트에 사용할 변수 및 입력값을 정의한다.
		 * - 동작을 확인하기 위한 Mokito 정의도 포함(Database(Repository)의 객체를 Mokito화하여 사용)
		 * */
		long originalQuantity = 10L;
		long orderQuantity = 5L;
		long expectedQuantity = 5L;
		
		/*
		 * when
		 * - 실제 동작이 이루어진다.
		 * - 동작에 따른 상태 변화를 기억하거나, 대조군으로 활용하기 위한 과정이다.
		 * - 검증 대상의 동작 하나만 기술한다.
		 * */
		long actualPoint = productService.charge(originalQuantity, orderQuantity);
		
		/*
		 * Then
		 * - 최종적으로 테스트를 검증한다.
		 * - 테스트 과정을 종합한다.
		 * */
		assertEquals(expectedQuantity, actualPoint);
	}
}
