package kr.hhplus.be.server.infrastructure.domainjparepository.point;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import annotation.UnitTest;
import kr.hhplus.server.domain.service.point.PointService;

@UnitTest
public class PointJpaRepositoryUnitTest {
	@Autowired
	PointJpaRepository pointJpaRepository;
	
	@Test
	@DisplayName("[DB단위테스트] 포인트 액수만큼 충전한다.")
	void chargeTest() {
		/*
		 * given
		 * - 테스트에 사용할 변수 및 입력값을 정의한다.
		 * - 동작을 확인하기 위한 Mokito 정의도 포함(Database(Repository)의 객체를 Mokito화하여 사용)
		 * */
		int expectedRow = 1;
		long userId = 1L;
		long originalPoint = 0L;
		long chargePoint = 100L;
		long expectedPoint = 100L;
		
		/*
		 * when
		 * - 실제 동작이 이루어진다.
		 * - 동작에 따른 상태 변화를 기억하거나, 대조군으로 활용하기 위한 과정이다.
		 * - 검증 대상의 동작 하나만 기술한다.
		 * */
		int actualRow = pointJpaRepository.save(userId, originalPoint + chargePoint);
		
		/*
		 * Then
		 * - 최종적으로 테스트를 검증한다.
		 * - 테스트 과정을 종합한다.
		 * */
		assertEquals(expectedRow, actualRow);
	}
	
	@Test
	@DisplayName("[DB단위테스트] 포인트 액수만큼 결제한다.")
	void useTest() {
		/*
		 * given
		 * - 테스트에 사용할 변수 및 입력값을 정의한다.
		 * - 동작을 확인하기 위한 Mokito 정의도 포함(Database(Repository)의 객체를 Mokito화하여 사용)
		 * */
		int expectedRow = 1;
		long userId = 1L;
		long originalPoint = 400L;
		long usePoint = 100L;
		long expectedPoint = 300L;
		
		/*
		 * when
		 * - 실제 동작이 이루어진다.
		 * - 동작에 따른 상태 변화를 기억하거나, 대조군으로 활용하기 위한 과정이다.
		 * - 검증 대상의 동작 하나만 기술한다.
		 * */
		int actualRow = pointJpaRepository.save(userId, originalPoint - usePoint);
		
		/*
		 * Then
		 * - 최종적으로 테스트를 검증한다.
		 * - 테스트 과정을 종합한다.
		 * */
		assertEquals(expectedRow, actualRow);
	}
}
