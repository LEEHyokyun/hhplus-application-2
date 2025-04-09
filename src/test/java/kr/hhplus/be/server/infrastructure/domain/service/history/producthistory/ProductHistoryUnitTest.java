package kr.hhplus.be.server.infrastructure.domain.service.history.producthistory;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;

import org.assertj.core.util.DateUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class ProductHistoryUnitTest {
	@Autowired
	ProductHistoryService productHistoryService;
	
	@Test
	@DisplayName("[단위테스트] 상품 관리 내역을 기록한다.")
	void chargeTest() {
		/*
		 * given
		 * - 테스트에 사용할 변수 및 입력값을 정의한다.
		 * - 동작을 확인하기 위한 Mokito 정의도 포함(Database(Repository)의 객체를 Mokito화하여 사용)
		 * */
		int expectedRow = 1;
		
		HashMap<String, String> DTO = new HashMap<>();
		
		DTO.put("userId", "1");
		DTO.put("productId", "A");
		DTO.put("historySequence", "001");
		DTO.put("point", "200");
		DTO.put("transactionType", "DESCEND");
		DTO.put("orderQuantity", "10");
		DTO.put("createdTime", DateUtil.now().toString());
		DTO.put("modifiedTIme", DateUtil.now().toString());
		
		/*
		 * when
		 * - 실제 동작이 이루어진다.
		 * - 동작에 따른 상태 변화를 기억하거나, 대조군으로 활용하기 위한 과정이다.
		 * - 검증 대상의 동작 하나만 기술한다.
		 * */
		int actualRow = productHistoryService.insert(DTO);
		
		/*
		 * Then
		 * - 최종적으로 테스트를 검증한다.
		 * - 테스트 과정을 종합한다.
		 * */
		assertEquals(expectedRow, actualRow);
	}
}
