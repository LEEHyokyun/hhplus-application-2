package kr.hhplus.be.server.infrastructure.mybatis.point;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.data.repository.query.Param;

import kr.hhplus.be.server.domain.model.point.PointDTO;

@Mapper
public interface PointMapper {
	
	/*
	 * JpaImpl 대신에 mybatis 사용하여 구현
	 * */
	
	PointDTO search(@Param("userId") String userId);
}
