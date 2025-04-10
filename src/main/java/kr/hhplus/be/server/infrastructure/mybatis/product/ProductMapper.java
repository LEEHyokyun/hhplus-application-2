package kr.hhplus.be.server.infrastructure.mybatis.product;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.data.repository.query.Param;

import kr.hhplus.be.server.domain.model.product.ProductDTO;

@Mapper
public interface ProductMapper {
	
	/*
	 * JpaImpl 대신에 mybatis 사용하여 구현
	 * */
	
	List<ProductDTO> search(@Param("productName") String productName);
}
